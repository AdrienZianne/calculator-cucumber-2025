package io;

import calculator.Configuration;
import calculator.Configuration.Mode;

import java.util.ArrayList;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class Memory {
    public static class Element {
        private String expression;

        public String getExpression() {
            return expression;
        }

        public void setExpression(String expression) {
            this.expression = expression;
        }

        private String res;

        public String getRes() {
            return res;
        }

        public void setRes(String res) {
            this.res = res;
        }

        public Element() {
        }

        public Element(String expression, String res) {
            this.expression = expression.trim().replaceAll("\\s+", " ");
            this.res = res;
        }

        public String toString() {
            return expression + " = " + res;
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
    }

    public enum Category {
        LOG, FAVO
    }

    @SuppressWarnings("unchecked")
    private ArrayList<Element>[][] memo = new ArrayList[Mode.values().length][Category.values().length];

    public Memory() {
        try {
            readFromYaml();
        } catch (IOException e) {
            for (int i = 0; i < Mode.values().length; i++) {
                for (int j = 0; j < Category.values().length; j++) {
                    memo[i][j] = new ArrayList<Element>();
                }
            }
        }
    }

    public void save() {
        try {
            writeToYaml();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addElement(Category c, String exp, String res) {
        addElement(c, new Element(exp, res));
    }

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

    public void delElement(Category c, int index) {
        memo[Configuration.getMode().ordinal()][c.ordinal()].remove(index);
    }

    public void addFavo(Integer index) {
        if (index == null) {
            index = memo[Configuration.getMode().ordinal()][Category.LOG.ordinal()].size() - 1;
        }
        if (index < 0 || index >= memo[Configuration.getMode().ordinal()][Category.LOG.ordinal()].size()) {
            return;
        }

        addElement(Category.FAVO, memo[Configuration.getMode().ordinal()][Category.LOG.ordinal()].get(index));
    }

    public void delFavo(Integer index) {
        if (index == null) {
            index = memo[Configuration.getMode().ordinal()][Category.FAVO.ordinal()].size() - 1;
        }
        if (index < 0 || index >= memo[Configuration.getMode().ordinal()][Category.FAVO.ordinal()].size()) {
            return;
        }

        delElement(Category.FAVO, index);
    }

    public void printData(Category c) {
        for (int i = 0; i < memo[Configuration.getMode().ordinal()][c.ordinal()].size(); i++) {
            System.out.println(i + " : " + memo[Configuration.getMode().ordinal()][c.ordinal()].get(i));
        }
    }

    public String getExpression(Category c, Integer index) {
        if (index == null) {
            index = memo[Configuration.getMode().ordinal()][c.ordinal()].size() - 1;
        }
        if (index < 0 || index >= memo[Configuration.getMode().ordinal()][c.ordinal()].size()) {
            return "";
        }

        return memo[Configuration.getMode().ordinal()][c.ordinal()].get(index).expression;
    }

    public void writeToYaml() throws IOException {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        for (Mode m : Mode.values()) {
            for (Category c : Category.values()) {
                mapper.writeValue(new File("src/main/ressources/" + m.toString() + "_" + c.toString() + ".yml"),
                        memo[m.ordinal()][c.ordinal()]);
            }
        }
    }

    public void readFromYaml() throws IOException {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        for (Mode m : Mode.values()) {
            for (Category c : Category.values()) {
                memo[m.ordinal()][c.ordinal()] = mapper.readValue(
                        new File("src/main/ressources/" + m.toString() + "_" + c.toString() + ".yml"),
                        mapper.getTypeFactory().constructCollectionType(ArrayList.class, Element.class));
            }
        }
    }
}
