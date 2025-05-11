package io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import io.Memory.Category;
import io.Memory.Element;

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
        assertTrue(e.equals(new Element("1 + 1", "2")));
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
}
