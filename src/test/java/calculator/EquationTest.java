package calculator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EquationTest {
    @Test
    void equationTrueFalse() {
        Configuration.setRealPrecision(5);
        MyNumber left = MyUnknown.create(
                List.of(new Pair<>(MyInteger.valueOf(8), MyInteger.valueOf(2)),
                        new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(1))),
                MyInteger.valueOf(-4));

        Equation equation = new Equation(left, left);
        assertEquals("true", equation.prettyResult());
        equation = new Equation(MyInteger.valueOf(0), MyInteger.valueOf(6) );
        assertEquals("false", equation.prettyResult());
    }

    @Test
    void equationFirstDegree() {
        Configuration.setRealPrecision(5);
        MyNumber left = MyUnknown.create(
                List.of(new Pair<>(MyInteger.valueOf(7), MyInteger.valueOf(1))),
                MyInteger.valueOf(1));

        Equation equation = new Equation(left, MyInteger.valueOf(3));
        assertNull(equation.getX2());
        assertNull(equation.getErrorState());
        assertEquals(MyRational.create(2, 7), equation.getX1());
    }


    @Test
    void equationSecondDegreeTwoSolution() {
        Configuration.setRealPrecision(5);
        MyNumber left = MyUnknown.create(
                List.of(new Pair<>(MyInteger.valueOf(8), MyInteger.valueOf(2)),
                        new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(1))),
                MyInteger.valueOf(-4));

        MyNumber right = MyUnknown.create(
                List.of(new Pair<>(MyInteger.valueOf(7), MyInteger.valueOf(1))),
                MyInteger.valueOf(0));

        Equation equation = new Equation(left, right);
        assertTrue(MyReal.valueOf(-0.647364).equals(equation.getX1()) || MyReal.valueOf(-0.647364).equals(equation.getX2()));
        assertTrue(MyReal.valueOf(0.772364).equals(equation.getX1()) || MyReal.valueOf(0.772364).equals(equation.getX2()));
        assertNull(equation.getErrorState());
    }
    @Test
    void equationSecondDegreeOneSolution() {
        Configuration.setRealPrecision(5);
        MyNumber left = MyUnknown.create(
                List.of(new Pair<>(MyInteger.valueOf(2), MyInteger.valueOf(2)),
                        new Pair<>(MyInteger.valueOf(4), MyInteger.valueOf(1))),
                MyInteger.valueOf(2));

        Equation equation = new Equation(left, ConstantNumber.ZERO);
        assertEquals(MyInteger.valueOf(-1), equation.getX1());
        assertNull(equation.getErrorState());
        assertNull(equation.getX2());
    }

    @Test
    void equationNoSolutionsComplexDomain() {
        Configuration.setRealPrecision(5);
        Configuration.setUsesComplexDomainDefault(true);

        MyNumber left = MyUnknown.create(
                List.of(new Pair<>(MyInteger.valueOf(8), MyInteger.valueOf(2)),
                        new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(1))),
                MyInteger.valueOf(4));

        Equation equation = new Equation(left, ConstantNumber.ZERO);
        MyNumber val1 = MyComplex.create(MyRational.create(-3, 8), MyReal.valueOf(-0.599478940));
        MyNumber val2 = MyComplex.create(MyRational.create(-3, 8), MyReal.valueOf(0.599478940));
        assertTrue(val1.equals(equation.getX1()) || val1.equals(equation.getX2()));
        assertTrue(val2.equals(equation.getX1()) || val2.equals(equation.getX2()));
        assertNull(equation.getErrorState());
    }


    @Test
    void equationNoSolutionsRealDomain() {
        Configuration.setRealPrecision(5);
        Configuration.setUsesComplexDomainDefault(false);

        MyNumber left = MyUnknown.create(
                List.of(new Pair<>(MyInteger.valueOf(8), MyInteger.valueOf(2)),
                        new Pair<>(MyInteger.valueOf(6), MyInteger.valueOf(1))),
                MyInteger.valueOf(4));

        Equation equation = new Equation(left, ConstantNumber.ZERO);
        assertNotNull(equation.getErrorState());
        assertNull(equation.getX1());
        assertNull(equation.getX2());
    }
}