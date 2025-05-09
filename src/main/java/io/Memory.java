package io;

import calculator.Configuration;

import java.util.ArrayList;

import org.apache.tomcat.util.log.UserDataHelper.Mode;

public class Memory {
    public class Element {
        public final String expression;
        public final String res;

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
        // TODO charger les fichiers

        for (int i = 0; i < Configuration.Mode.values().length; i++) {
            for (int j = 0; j < Category.values().length; j++) {
                memo[i][j] = new ArrayList<Element>();
            }
        }
    }

    public void save() {
        // TODO sauvegarder les fichiers
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
}
