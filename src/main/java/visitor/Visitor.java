package visitor;

import calculator.*;

/**
 * Visitor design pattern
 */
public abstract class Visitor {

    /**
     * The Visitor can traverse a number (a subtype of Expression)
     *
     * @param n The number being visited
     */
    public abstract void visit(MyInteger n);

    /**
     * The Visitor can traverse a number (a subtype of Expression)
     *
     * @param n The number being visited
     */
    public abstract void visit(ComplexNumber n);
    public abstract void visit(MyRational n);
    public abstract void visit(MyReal n);

    /**
     * The Visitor can traverse an operation (a subtype of Expression)
     *
     * @param o The operation being visited
     */   public abstract void visit(Operation o);
}
