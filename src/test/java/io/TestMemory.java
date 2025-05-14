package io;

import io.cli.Memory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import io.cli.Memory.Category;
import io.cli.Memory.Element;

import calculator.Configuration;

/**
 * TestMemory
 * Class used to test the program's Memory class and its internal Element class.
 */
class TestMemory {

    /**
     * Class used to test the correct behavior of the internal Element class.
     */
    @Test
    void testElement() {
        Element e = new Element();
        e.setExpression("1 + 1");
        e.setRes("2");
        assertEquals("1 + 1", e.getExpression());
        assertEquals("2", e.getRes());
        assertEquals("1 + 1 = 2", e.toString());

        assertTrue(e.equals(e));
        assertTrue(e.equals(new Element("1 + 1", "2")));
        assertFalse(e.equals(null));
        assertFalse(e.equals(new Memory()));

        e = new Element("T and T", "T");
        assertEquals("T and T = T", e.toString());
    }

    /**
     * Class used to test the correct behavior of various methods applied to stored
     * data, whether logs or favorites.
     */
    @Test
    void testMemory() {
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
        assertEquals(e1.getExpression(), m.getExpression(Category.LOG, 0));
        assertEquals(e2.getExpression(), m.getExpression(Category.LOG, 1));

        // Favourites test.
        m.addFavo(null);
        assertEquals(e2.getExpression(), m.getExpression(Category.FAVO, 0));
        m.addFavo(-1);
        assertEquals(e2.getExpression(), m.getExpression(Category.FAVO, 0));
        m.addFavo(10);
        assertEquals(e2.getExpression(), m.getExpression(Category.FAVO, 0));
        m.addFavo(0);
        assertEquals(e1.getExpression(), m.getExpression(Category.FAVO, 1));
        m.addFavo(1);
        assertEquals(e2.getExpression(), m.getExpression(Category.FAVO, 2));
        m.delFavo(null);
        m.addFavo(0);
        assertEquals(e1.getExpression(), m.getExpression(Category.FAVO, 2));
        m.delFavo(-1);
        assertEquals(e1.getExpression(), m.getExpression(Category.FAVO, 2));
        m.delFavo(10);
        assertEquals(e1.getExpression(), m.getExpression(Category.FAVO, 2));
    }

    @Test
    void testGetExpression() {
        Memory m = new Memory();
        m.reset(Category.LOG);

        Element e1 = new Element("1 + 1", "1");
        Element e2 = new Element("2 + 2", "4");
        m.addElement(Category.LOG, e1);
        m.addElement(Category.LOG, e2);

        assertEquals(e2.getExpression(), m.getExpression(Category.LOG, null));
        assertEquals("", m.getExpression(Category.LOG, -1));
        assertEquals("", m.getExpression(Category.LOG, 10));
        assertEquals(e1.getExpression(), m.getExpression(Category.LOG, 0));
    }

    @Test
    void testDeleteDuplicates() {
        // Reset stored data to zero.
        Memory m = new Memory();
        m.reset(Category.FAVO);

        Element e1 = new Element("1 + 1", "1");
        Element e2 = new Element("2 + 2", "4");

        m.addElement(Category.FAVO, e1);
        m.addElement(Category.FAVO, e2);
        assertEquals(e2.getExpression(), m.getExpression(Category.FAVO, 1));
        m.delFavo(1);
        Configuration.setDeleteDuplicates(true);
        m.addElement(Category.FAVO, e1);
        m.addElement(Category.FAVO, e2);
        assertEquals(e2.getExpression(), m.getExpression(Category.FAVO, 1));
        m.delFavo(1);
        Configuration.setDeleteDuplicates(false);
        m.addElement(Category.FAVO, e1);
        m.addElement(Category.FAVO, e2);
        assertEquals(e1.getExpression(), m.getExpression(Category.FAVO, 1));
    }

    @Test
    void testMaxStore() {
        // Reset stored data to zero.
        Memory m = new Memory();
        m.reset(Category.FAVO);

        Element e1 = new Element("1 + 1", "1");
        Element e2 = new Element("2 + 2", "4");

        Configuration.setMaxStore(1);
        m.addElement(Category.FAVO, e1);
        assertEquals(e1.getExpression(), m.getExpression(Category.FAVO, 0));
        m.addElement(Category.FAVO, e2);
        assertEquals(e2.getExpression(), m.getExpression(Category.FAVO, 0));
        Configuration.setMaxStore(2);
        m.addElement(Category.FAVO, e1);
        assertEquals(e2.getExpression(), m.getExpression(Category.FAVO, 0));
        assertEquals(e1.getExpression(), m.getExpression(Category.FAVO, 1));
    }
}
