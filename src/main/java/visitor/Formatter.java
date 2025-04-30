package visitor;

import calculator.Expression;
import calculator.MyNumber;
import calculator.Notation;
import calculator.operation.Operation;
import calculator.operation.binary.BinaryOperation;
import calculator.operation.unary.UnaryOperation;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Formatter extends Visitor {

    private Notation notation;

    /**
     * Default constructor of the class. Does not initialise anything.
     */
    public Formatter() {
        this.notation = Notation.INFIX;
    }

    /**
     * Default constructor of the class. Set the notation for print..
     */
    public Formatter(Notation notation) {
        this.notation = notation;
    }

    /** The result of the evaluation will be stored in this private variable */
    private String representation;

    /** getter method to obtain the result of the evaluation
     *
     * @return an Integer object containing the result of the evaluation
     */
    public String getResult() { return representation; }

    /** Use the visitor design pattern to visit a number.
     *
     * @param n The number being visited
     */
    public void visit(MyNumber n) {
        representation = n.toString();
    }

    @Override
    public void visit(Operation o) {
        ArrayList<String> stringArgs = new ArrayList<>();
        for(Expression a: o.getArgs()) {
            a.accept(this);
            stringArgs.add(representation);
        }
        Stream<String> s = stringArgs.stream();
        if (o instanceof BinaryOperation)
        {
            representation = switch (this.notation) {
                case PREFIX -> visitPrefix(o, s);
                case INFIX -> visitInfix(o, s);
                case POSTFIX -> visitPostfix(o, s);
            };
        }
        else if (o instanceof UnaryOperation)
        {
            representation = switch (this.notation) {
                case PREFIX, INFIX -> visitPrefix(o, s);
                case POSTFIX -> visitPostfix(o, s);
            };
        }
    }


    private String visitInfix(Operation o, Stream<String> s)
    {
        return "( " +
                s.reduce((s1, s2) -> s1 + " " + o.getSymbol() + " " + s2).get() +
                " )";
    }

    private String visitPrefix(Operation o, Stream<String> s)
    {
        return o.getSymbol() + " " +
                "(" +
                s.reduce((s1, s2) -> s1 + ", " + s2).get() +
                ")";
    }

    private String visitPostfix(Operation o, Stream<String> s)
    {
        return "(" +
                s.reduce((s1, s2) -> s1 + ", " + s2).get() +
                ")" +
                " " + o.getSymbol();
    }
}
