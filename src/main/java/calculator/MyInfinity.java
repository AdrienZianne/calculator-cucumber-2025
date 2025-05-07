package calculator;

import java.util.Objects;

/**
 * Represents the infinity number. Either positive or negative.
 */
public class MyInfinity extends MyNumber {

    boolean isPositive;

    /**
     * The default constructor of the {@link MyInfinity} class.
     * @param isPositive true if the infinity is positive, false otherwise.
     */
    public MyInfinity(boolean isPositive)
    {
        this.isPositive = isPositive;
    }

    @Override
    public Object getObjectValue() {
        return this.isPositive ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
    }

    @Override
    public boolean isZero() {
        return false;
    }

    @Override
    public int getSign() {
        return this.isPositive ? 1 : -1;
    }

    /**
     * Checks if the infinity is positive or negative.
     * @return  True if the infinity is positive, false otherwise.
     */
    public boolean isPositive() {
        return isPositive;
    }

    @Override
    public String toString() {
        return (isPositive ? "+" : "-") + "inf";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyInfinity that = (MyInfinity) o;
        return isPositive == that.isPositive;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isPositive ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY);
    }
}
