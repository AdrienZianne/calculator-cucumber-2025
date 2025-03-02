package calculator;

//import java.util.Arrays;

import visitor.Visitor;

/**
 * MyNumber is a concrete class that represents arithmetic numbers,
 * which are a special kind of Expressions, just like operations are.
 *
 * @see Expression
 * @see Operation
 */
public class MyNumber implements Expression
{
    private final Object value;  
    private final Type type;     

    /**
     * Adding the different possible types
     */
    public enum Type {
        ENTIER, RATIONNEL, REEL, COMPLEXE
    }

    /**
     * Constructor method
     *
     * @param v The integer value to be contained in the object
     */
    public /*constructor*/ MyNumber(int v) {
        this.value = v;
        this.type = Type.ENTIER;
    }

    /**
     * Constructor method
     *
     * @param v The double value to be contained in the object
     */
    public /*constructor*/ MyNumber(double v) {
        this.value = v;
        this.type = Type.REEL;
    }

    /**
     * Constructor method
     *
     * @param numerator Integer value of the numerator to be contained in object
     * @param denominator Integer value of the denominator to be contained in object
     */
    public /*constructor*/ MyNumber(int numerator, int denominator) {
        if (denominator == 0) throw new ArithmeticException("The denominator cannot be zero.");
        this.value = new int[] {numerator, denominator};
        this.type = Type.RATIONNEL;
    }

    /**
     * Constructor method
     *
     * @param partReal Double value of the real part to be contained in object
     * @param partImaginary Double value of the imaginary part to be contained in object
     */
    public /*constructor*/ MyNumber(double partReal, double partImaginary) {
        this.value = new double[] {partReal, partImaginary};  
        this.type = Type.COMPLEXE;
    }

    /** getter method to obtain the value contained in the object
     *
     * @return The number contained in the object
     */
    public Object getValue() { return value; }


    /** getter method to obtain the type contained in the object
     *
     * @return The type contained in the object
     */
    public Type getType() { return type; }

    /**
     * accept method to implement the visitor design pattern to traverse arithmetic expressions.
     * Each number will pass itself to the visitor object to get processed by the visitor.
     *
     * @param v	The visitor object
     */
    public void accept(Visitor v) {
        v.visit(this);
    }

    /**
     * Convert a number into a String to allow it to be printed.
     *
     * @return	The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        switch (type) {
            case ENTIER:
                return Integer.toString((Integer) value);
            case REEL:
                return Double.toString((Double) value);
            case RATIONNEL:
                int[] rationnel = (int[]) value;
                return rationnel[0] + "/" + rationnel[1];
            case COMPLEXE:
                double[] complexe = (double[]) value;
                return complexe[0] + " + " + complexe[1] + "i";
            default:
                return "Unknown type";
        }
    }

  /** Two MyNumber expressions are equal if the values they contain are equal
   *
   * @param o The object to compare to
   * @return A boolean representing the result of the equality test
   */
    @Override
    public boolean equals(Object o) {
        // No object should be equal to null (not including this check can result in an exception if a MyNumber is tested against null)
        if (o == null) return false;

        // If the object is compared to itself then return true
        if (o == this) return true;

        // If the object is of another type then return false
        if (!(o instanceof MyNumber)) return false;

        // If types are different, objects are not equal
        MyNumber other = (MyNumber) o;
        if (this.type != other.type) return false; 

         // Comparison of values according to type
         switch (this.type) {
            case ENTIER :
            case REEL:
                return this.value == other.value;
            case RATIONNEL:
                int[] thisRationnel = (int[]) this.value;
                int[] otherRationnel = (int[]) other.value;
                return thisRationnel[0] == otherRationnel[0] && thisRationnel[1] == otherRationnel[1];
            case COMPLEXE:
                double[] thisComplex = (double[]) this.value;
                double[] otherComplex = (double[]) other.value;
                return thisComplex[0] == otherComplex[0] && thisComplex[1] == otherComplex[1];
            default:
                return false;
        }
    }

    /** The method hashCode needs to be overridden it the equals method is overridden;
     * 	otherwise there may be problems when you use your object in hashed collections
     * 	such as HashMap, HashSet, LinkedHashSet.
     *
     * @return	The result of computing the hash.
     */
    @Override
    public int hashCode() {
    		return (int) value;
            //TMP -> TO DO
    }
}