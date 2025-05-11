package io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import io.Memory.Category;
import io.Memory.Element;

import calculator.Configuration;

/**
 * TestMemory
 * Class used to test the program's Memory class and its internal Element class.
 */
public class TestMemory {

    /**
     * Class used to test the correct behavior of the internal Element class.
     */
    @Test
    public void testElement() {
        Element e = new Element();
        e.setExpression("1 + 1");
        e.setRes("2");
        assertEquals(e.getExpression(), "1 + 1");
        assertEquals(e.getRes(), "2");
        assertEquals(e.toString(), "1 + 1 = 2");

        assertTrue(e.equals(e));
        assertTrue(e.equals(new Element("1 + 1", "2")));
        assertFalse(e.equals(null));
        assertFalse(e.equals(new Memory()));

        e = new Element("T and T", "T");
        assertEquals(e.toString(), "T and T = T");
    }

    /**
     * Class used to test the correct behavior of various methods applied to stored
     * data, whether logs or favorites.
     */
    @Test
    public void testMemory() {
        // Reset stored data to zero.
        Memory m = new Memory();
        m.reset(Category.LOG);
        m.reset(Category.FAVO);

        Configuration.setMaxStore(50);

        Element e1 = new Element("1 + 1", "1");
        Element e2 = new Element("2 + 2", "4");

        // Test on logs.
        m.addElement(Category.LOG, e1);
        m.addElement(Category.LOG, e2.getExpression(), e2.getRes());
        assertEquals(m.getExpression(Category.LOG, 0), e1.getExpression());
        assertEquals(m.getExpression(Category.LOG, 1), e2.getExpression());

        // Favourites test.
        m.addFavo(null);
        assertEquals(m.getExpression(Category.FAVO, 0), e2.getExpression());
        m.addFavo(-1);
        assertEquals(m.getExpression(Category.FAVO, 0), e2.getExpression());
        m.addFavo(10);
        assertEquals(m.getExpression(Category.FAVO, 0), e2.getExpression());
        m.addFavo(0);
        assertEquals(m.getExpression(Category.FAVO, 1), e1.getExpression());
        m.addFavo(1);
        assertEquals(m.getExpression(Category.FAVO, 2), e2.getExpression());
        m.delFavo(null);
        m.addFavo(0);
        assertEquals(m.getExpression(Category.FAVO, 2), e1.getExpression());
        m.delFavo(-1);
        assertEquals(m.getExpression(Category.FAVO, 2), e1.getExpression());
        m.delFavo(10);
        assertEquals(m.getExpression(Category.FAVO, 2), e1.getExpression());
    }

    @Test
    public void testGetExpression() {
        Memory m = new Memory();
        m.reset(Category.LOG);

        Element e1 = new Element("1 + 1", "1");
        Element e2 = new Element("2 + 2", "4");
        m.addElement(Category.LOG, e1);
        m.addElement(Category.LOG, e2);

        assertEquals(m.getExpression(Category.LOG, null), e2.getExpression());
        assertEquals(m.getExpression(Category.LOG, -1), "");
        assertEquals(m.getExpression(Category.LOG, 10), "");
        assertEquals(m.getExpression(Category.LOG, 0), e1.getExpression());
    }

    @Test
    public void testDeleteDuplicates() {
        // Reset stored data to zero.
        Memory m = new Memory();
        m.reset(Category.FAVO);

        Element e1 = new Element("1 + 1", "1");
        Element e2 = new Element("2 + 2", "4");

        m.addElement(Category.FAVO, e1);
        m.addElement(Category.FAVO, e2);
        assertEquals(m.getExpression(Category.FAVO, 1), e2.getExpression());
        m.delFavo(1);
        Configuration.setDeleteDuplicates(true);
        m.addElement(Category.FAVO, e1);
        m.addElement(Category.FAVO, e2);
        assertEquals(m.getExpression(Category.FAVO, 1), e2.getExpression());
        m.delFavo(1);
        Configuration.setDeleteDuplicates(false);
        m.addElement(Category.FAVO, e1);
        m.addElement(Category.FAVO, e2);
        assertEquals(m.getExpression(Category.FAVO, 1), e1.getExpression());
    }

    @Test
    public void testMaxStore() {
        // Reset stored data to zero.
        Memory m = new Memory();
        m.reset(Category.FAVO);

        Element e1 = new Element("1 + 1", "1");
        Element e2 = new Element("2 + 2", "4");

        Configuration.setMaxStore(1);
        m.addElement(Category.FAVO, e1);
        assertEquals(m.getExpression(Category.FAVO, 0), e1.getExpression());
        m.addElement(Category.FAVO, e2);
        assertEquals(m.getExpression(Category.FAVO, 0), e2.getExpression());
        Configuration.setMaxStore(2);
        m.addElement(Category.FAVO, e1);
        assertEquals(m.getExpression(Category.FAVO, 0), e2.getExpression());
        assertEquals(m.getExpression(Category.FAVO, 1), e1.getExpression());
    }
}
