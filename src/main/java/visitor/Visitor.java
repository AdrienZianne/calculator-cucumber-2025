package visitor;

import calculator.*;
import jdk.jshell.spi.ExecutionControl;

/**
 * Visitor design pattern
 */
public abstract class Visitor {

    /**
     * The Visitor can traverse a number (a subtype of Expression)
     *
     * @param n The number being visited
     */
    public abstract void visit(MyNumber n);

    /**
     * The Visitor can traverse an operation (a subtype of Expression)
     *
     * @param o The operation being visited
     */   public abstract void visit(Operation o) throws ExecutionControl.NotImplementedException, IllegalConstruction;
}
