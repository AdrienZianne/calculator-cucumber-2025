package io;

import calculator.Configuration;
import calculator.Configuration.Mode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Memory
 * Class used to store logs and favorite expressions depending on the mode used.
 * The data will be loaded via a yaml file when the class is created, and saved
 * in the same file when the program closes.
 */
public class Memory {
    /**
     * Element
     * Internal class that simply stores an element, i.e. an expression and its
     * result in any mode. This class is used for serialization and must therefore
     * have a constructor with no arguments and getters/setters.
     */
    public static class Element {
        /**
         * Attribute used to store an expression.
         */
        private String expression;

        /**
         * Attribute used to store the result of the expression.
         */
        private String res;

        /**
         * Method for recovering the expression.
         * 
         * @return The expression.
         */
        public String getExpression() {
            return expression;
        }

        /**
         * Method for changing the expression to be saved.
         * 
         * @param expression The new expression.
         */
        public void setExpression(String expression) {
            this.expression = expression;
        }

        /**
         * Method for recovering the result.
         * 
         * @return The result.
         */
        public String getRes() {
            return res;
        }

        /**
         * Method for changing the result to be saved.
         * 
         * @param res The new result.
         */
        public void setRes(String res) {
            this.res = res;
        }

        /**
         * Classic constructor for serialization.
         */
        public Element() {
        }

        /**
         * Constructor to create the element to be stored. An element is composed of an
         * expression and a result.
         * 
         * @param expression The expression
         * @param res        The result
         */
        public Element(String expression, String res) {
            this.expression = expression.trim().replaceAll("\\s+", " ");
            this.res = res;
        }

        @Override
        public String toString() {
            return expression + " => " + res;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object)
                return true;
            if (object == null || getClass() != object.getClass())
                return false;
            Element other = (Element) object;
            return expression.equals(other.expression) && res.equals(other.res);
        }

        @Override
        public int hashCode() {
            return expression.hashCode() - res.hashCode();
        }
    }

    /**
     * Category
     * Enumeration to differentiate between types of saved items.
     */
    public enum Category {
        LOG, FAVO
    }

    /**
     * Attribute storing all desired data. It's an ArrayList matrix with the mode
     * used as row and the data type as column.
     */
    @SuppressWarnings("unchecked")
    private ArrayList<Element>[][] memo = new ArrayList[Mode.values().length][Category.values().length];

    /**
     * Unique class constructor. It tries to retrieve old data. If the file is not
     * found, we initialize with empty data.
     */
    public Memory() {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        for (Mode m : Mode.values()) {
            for (Category c : Category.values()) {
                try {
                    memo[m.ordinal()][c.ordinal()] = mapper.readValue(
                            new File("." + m.toString() + "_" + c.toString() + ".yml"),
                            mapper.getTypeFactory().constructCollectionType(ArrayList.class, Element.class));
                } catch (IOException _) {
                    memo[m.ordinal()][c.ordinal()] = new ArrayList<>();
                }
            }
        }
    }

    /**
     * Method for saving all data in yml files. One yaml file will be used per data
     * list.
     */
    public void save() {
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            for (Mode m : Mode.values()) {
                for (Category c : Category.values()) {
                    mapper.writeValue(new File("." + m.toString() + "_" + c.toString() + ".yml"),
                            memo[m.ordinal()][c.ordinal()]);
                }
            }
        } catch (IOException _) {
            System.err.println("Error: Unable to save data.");
        }
    }

    /**
     * Method that creates an element before calling the method that saves it.
     * 
     * @param c   The desired category.
     * @param exp The expression of the element to be saved.
     * @param res The result of the element to be saved.
     */
    public void addElement(Category c, String exp, String res) {
        addElement(c, new Element(exp, res));
    }

    /**
     * Method for adding an item to be saved according to a category in the current
     * mode.
     * 
     * @param c       The desired category.
     * @param element The element to be saved.
     */
    public void addElement(Category c, Element element) {
        if (Configuration.getDeleteDuplicates()) {
            for (Element e : memo[Configuration.getMode().ordinal()][c.ordinal()]) {
                if (e.equals(element)) {
                    return;
                }
            }
        }

        memo[Configuration.getMode().ordinal()][c.ordinal()].add(element);

        if (memo[Configuration.getMode().ordinal()][c.ordinal()].size() > Configuration.getMaxStore()) {
            memo[Configuration.getMode().ordinal()][c.ordinal()].remove(0);
        }
    }

    /**
     * Method for saving an item as a favorite.
     * 
     * @param index The index of the element in the logs to be saved.
     */
    public void addFavo(Integer index) {
        if (index == null) {
            index = memo[Configuration.getMode().ordinal()][Category.LOG.ordinal()].size() - 1;
        }
        if (index < 0 || index >= memo[Configuration.getMode().ordinal()][Category.LOG.ordinal()].size()) {
            return;
        }

        addElement(Category.FAVO, memo[Configuration.getMode().ordinal()][Category.LOG.ordinal()].get(index));
    }

    /**
     * Method for removing an item from favorites.
     * 
     * @param index The index of the favorite to be deleted.
     */
    public void delFavo(Integer index) {
        if (index == null) {
            index = memo[Configuration.getMode().ordinal()][Category.FAVO.ordinal()].size() - 1;
        }
        if (index < 0 || index >= memo[Configuration.getMode().ordinal()][Category.FAVO.ordinal()].size()) {
            return;
        }

        memo[Configuration.getMode().ordinal()][Category.FAVO.ordinal()].remove((int) index);
    }

    /**
     * Method for displaying the list of items currently saved by category for the
     * current mode.
     * 
     * @param c The desired categorie
     */
    public void printData(Category c) {
        for (int i = 0; i < memo[Configuration.getMode().ordinal()][c.ordinal()].size(); i++) {
            System.out.println(i + " : " + memo[Configuration.getMode().ordinal()][c.ordinal()].get(i));
        }
    }

    /**
     * Method for retrieving the expression of an element saved in a category in the
     * current mode, based on its index.
     * 
     * @param c     The desired categorie.
     * @param index The element index.
     * @return The expression.
     */
    public String getExpression(Category c, Integer index) {
        if (index == null) {
            index = memo[Configuration.getMode().ordinal()][c.ordinal()].size() - 1;
        }
        if (index < 0 || index >= memo[Configuration.getMode().ordinal()][c.ordinal()].size()) {
            return "";
        }

        return memo[Configuration.getMode().ordinal()][c.ordinal()].get(index).expression;
    }

    /**
     * Method used to completely erase category data in the current mode.
     * 
     * @param c The desired categorie.
     */
    public void reset(Category c) {
        memo[Configuration.getMode().ordinal()][c.ordinal()] = new ArrayList<>();
    }
}
