package calculator;

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
     * Sets if the infinity is positive or negative.
     * @param positive true if the infinity is positive, false otherwise.
     */
    public void setPositive(boolean positive) {
        isPositive = positive;
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
}
