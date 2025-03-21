package calculator;

import visitor.Visitor;

import java.math.BigInteger;
import java.util.Objects;

public class MyInteger extends MyNumber
{
    private final BigInteger value;

    /**
     * Constructor method
     *
     * @param v The integer value to be contained in the object
     */
    public MyInteger(int v) {
        this.value = BigInteger.valueOf(v);
    }

    public MyInteger(BigInteger v) {
        this.value = v;
    }

    public static MyInteger valueOf(BigInteger v) {return new MyInteger(v);}
    public static MyInteger valueOf(Integer v) {return new MyInteger(v);}

    @Override
    public Object getObjectValue() {
        return getValue();
    }

    public BigInteger getValue()
    {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return value.equals(myInteger.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
