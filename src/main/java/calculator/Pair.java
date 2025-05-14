package calculator;

import java.util.Objects;

/**
 * Simple class used to store a pair of values
 * @param <T> The class of the first value
 * @param <E> The class of the second value
 */
public class Pair<T,E>
{
    /**
     * The first value
     */
    public final T a;
    /**
     * The second value
     */
    public final E b;

    /**
     * The default contructor of the {@link Pair} class
     * @param a The first value to store
     * @param b The second value to store
     */
    public Pair(T a, E b){ this.a = a; this.b = b; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;

        return a.equals(pair.a) && b.equals(pair.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }


    @Override
    public String toString() {
        return "Pair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
