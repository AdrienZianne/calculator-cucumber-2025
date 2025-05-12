package calculator.operation.unary;

import calculator.*;
import calculator.operation.BuildUnaryOperationFunction;
import calculator.operation.binary.BinaryOperation;
import calculator.operation.binary.Divides;
import calculator.operation.unary.trigonometry.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestTrigonometricFunction extends TestUnaryOperation {

    public static ArrayList<TrigonometricFunction.TrigonometricFuncExec> trigoMathFunctions;
    public static ArrayList<BuildUnaryOperationFunction<TrigonometricFunction>> trigoClasses;

    @BeforeAll
    public static void setUp() {
        Configuration.setRealPrecision(5);
        trigoClasses = new ArrayList<>();
        trigoClasses.add(Sinus::new);
        trigoClasses.add(Cosinus::new);
        trigoClasses.add(Tangent::new);

        trigoClasses.add(Arcsine::new);
        trigoClasses.add(Arccosine::new);
        trigoClasses.add(Arctangent::new);

        trigoClasses.add(HyperbolicSine::new);
        trigoClasses.add(HyperbolicCosine::new);
        trigoClasses.add(HyperbolicTangent::new);

        trigoMathFunctions = new ArrayList<>();
        trigoMathFunctions.add(Math::sin);
        trigoMathFunctions.add(Math::cos);
        trigoMathFunctions.add(Math::tan);

        trigoMathFunctions.add(Math::asin);
        trigoMathFunctions.add(Math::acos);
        trigoMathFunctions.add(Math::atan);
        
        trigoMathFunctions.add(Math::sinh);
        trigoMathFunctions.add(Math::cosh);
        trigoMathFunctions.add(Math::tanh);
    }

    @Test
    @Override
    public void testInteger() throws Exception {
        Configuration.setUseDegrees(false);
        ArrayList<MyInteger> toTry = new ArrayList<>();

        toTry.add(new MyInteger(1));
        toTry.add(new MyInteger(0));
        toTry.add(new MyInteger(-1));
        toTry.add(new MyInteger(10000));
        toTry.add(new MyInteger(-10000));
        toTry.add(new MyInteger(Integer.MAX_VALUE));
        toTry.add(new MyInteger(Integer.MIN_VALUE));

        for (MyInteger nb : toTry)
        {
            for (int i = 0; i < trigoClasses.size(); i++) {
                TrigonometricFunction.TrigonometricFuncExec exec = trigoMathFunctions.get(i);
                Double resD = exec.apply(nb.getValue().doubleValue());
                // If the result was supposed to be an error
                if (resD.isInfinite() || resD.isNaN())
                {
                    assertEquals(MyErrorNumber.class, calculator.eval(trigoClasses.get(i).build(nb)).getClass());
                }
                else
                {
                    assertEquals(MyReal.valueOf(resD), calculator.eval(trigoClasses.get(i).build(nb)));
                }
            }
        }
    }

    @Test
    @Override
    public void testMyReal() throws Exception {
        Configuration.setUseDegrees(false);
        ArrayList<MyReal> toTry = new ArrayList<>();

        toTry.add(MyReal.valueOf(1.5));
        toTry.add(MyReal.valueOf(12.12));
        toTry.add(MyReal.valueOf(-12.12));
        toTry.add(ConstantNumber.PI);

        for (MyReal nb : toTry)
        {
            for (int i = 0; i < trigoClasses.size(); i++) {
                TrigonometricFunction.TrigonometricFuncExec exec = trigoMathFunctions.get(i);
                Double resD = exec.apply(nb.getValue().doubleValue());
                // If the result was supposed to be an error
                if (resD.isInfinite() || resD.isNaN())
                {
                    assertEquals(MyErrorNumber.class, calculator.eval(trigoClasses.get(i).build(nb)).getClass());
                }
                else
                {
                    assertEquals(MyReal.valueOf(resD), calculator.eval(trigoClasses.get(i).build(nb)));
                }
            }
        }
    }

    @Test
    @Override
    public void testMyRational() throws Exception {
        Configuration.setUseDegrees(false);
        ArrayList<MyRational> toTry = new ArrayList<>();

        toTry.add((MyRational) BinaryOperation.op(ConstantNumber.PI, MyInteger.valueOf(2), Divides::new));
        toTry.add((MyRational) MyRational.create(ConstantNumber.PI, MyReal.valueOf(2)));
        for (MyRational nb : toTry)
        {
            for (int i = 0; i < trigoClasses.size(); i++) {
                TrigonometricFunction.TrigonometricFuncExec exec = trigoMathFunctions.get(i);
                Double resD = exec.apply(MyReal.toReal(nb).getValue().doubleValue());
                // If the result was supposed to be an error
                if (resD.isInfinite() || resD.isNaN())
                {
                    assertEquals(MyErrorNumber.class, calculator.eval(trigoClasses.get(i).build(nb)).getClass());
                }
                else
                {
                    assertEquals(MyReal.valueOf(resD), calculator.eval(trigoClasses.get(i).build(nb)));
                }
            }
        }
    }

    @Test
    @Override
    public void testMyComplex() throws Exception {
        MyComplex nb = (MyComplex) MyComplex.create(1,1);
        boolean[] values = new boolean[] {true, false};
        for (int i = 0; i < values.length; i++) {
            Configuration.setUseDegrees(values[i]);
            for (BuildUnaryOperationFunction<TrigonometricFunction> trigoClass : trigoClasses) {
                // The result was supposed to be an error
                assertEquals(MyErrorNumber.class, calculator.eval(trigoClass.build(nb)).getClass());
            }
        }
    }

    @Test
    @Override
    public void testMyInfinity() throws Exception {
        Configuration.setUseDegrees(true);
        MyInfinity nb = new MyInfinity(true);
        boolean[] values = new boolean[] {true, false};
        for (boolean value : values) {
            Configuration.setUseDegrees(value);
            for (BuildUnaryOperationFunction<TrigonometricFunction> trigoClass : trigoClasses) {
                // The result was supposed to be an error
                assertEquals(MyErrorNumber.class, calculator.eval(trigoClass.build(nb)).getClass());
            }
        }
        nb = new MyInfinity(false);
        for (boolean value : values) {
            Configuration.setUseDegrees(value);
            for (BuildUnaryOperationFunction<TrigonometricFunction> trigoClass : trigoClasses) {
                // The result was supposed to be an error
                assertEquals(MyErrorNumber.class, calculator.eval(trigoClass.build(nb)).getClass());
            }
        }
    }

    @Test
    @Override
    public void testMyUnknown() throws Exception {
        Configuration.setUseDegrees(true);
        MyUnknown nb = (MyUnknown) MyUnknown.create(MyInteger.valueOf(1), MyInteger.valueOf(2), MyInteger.valueOf(3));
        boolean[] values = new boolean[] {true, false};
        for (boolean value : values) {
            Configuration.setUseDegrees(value);
            for (BuildUnaryOperationFunction<TrigonometricFunction> trigoClass : trigoClasses) {
                // The result was supposed to be an error
                assertEquals(MyErrorNumber.class, calculator.eval(trigoClass.build(nb)).getClass());
            }
        }
    }

    @Test
    public void testIntegerDeg() throws Exception {
        Configuration.setUseDegrees(true);
        ArrayList<MyInteger> toTry = new ArrayList<>();

        toTry.add(new MyInteger(90));
        toTry.add(new MyInteger(0));
        toTry.add(new MyInteger(-90));
        toTry.add(new MyInteger(100));
        toTry.add(new MyInteger(-250));
        toTry.add(new MyInteger(Integer.MAX_VALUE));
        toTry.add(new MyInteger(Integer.MIN_VALUE));

        for (MyInteger nb : toTry)
        {
            for (int i = 0; i < trigoClasses.size(); i++) {
                TrigonometricFunction.TrigonometricFuncExec exec = trigoMathFunctions.get(i);
                double val = Math.toRadians(nb.getValue().doubleValue());
                Double resD = exec.apply(val);
                // If the result was supposed to be an error
                if (resD.isInfinite() || resD.isNaN())
                {
                    assertEquals(MyErrorNumber.class, calculator.eval(trigoClasses.get(i).build(nb)).getClass());
                }
                else
                {
                    assertEquals(MyReal.valueOf(resD), calculator.eval(trigoClasses.get(i).build(nb)));
                }
            }
        }
    }

    @Test
    public void testMyRealDeg() throws Exception {
        Configuration.setUseDegrees(true);
        ArrayList<MyReal> toTry = new ArrayList<>();

        toTry.add(MyReal.valueOf(200.250));
        toTry.add(MyReal.valueOf(0));
        toTry.add(MyReal.valueOf(-100.25));
        toTry.add(ConstantNumber.PI);

        for (MyReal nb : toTry)
        {
            for (int i = 0; i < trigoClasses.size(); i++) {
                TrigonometricFunction.TrigonometricFuncExec exec = trigoMathFunctions.get(i);
                double val = Math.toRadians(nb.getValue().doubleValue());
                Double resD = exec.apply(val);

                // If the result was supposed to be an error
                if (resD.isInfinite() || resD.isNaN())
                {
                    assertEquals(MyErrorNumber.class, calculator.eval(trigoClasses.get(i).build(nb)).getClass());
                }
                else
                {
                    assertEquals(MyReal.valueOf(resD), calculator.eval(trigoClasses.get(i).build(nb)));
                }
            }
        }
    }

    @Test
    public void testMyRationalDeg() throws Exception {
        Configuration.setUseDegrees(true);
        ArrayList<MyRational> toTry = new ArrayList<>();

        toTry.add((MyRational) BinaryOperation.op(ConstantNumber.PI, MyInteger.valueOf(2), Divides::new));
        toTry.add((MyRational) MyRational.create(ConstantNumber.PI, MyReal.valueOf(2)));
        for (MyRational nb : toTry)
        {
            for (int i = 0; i < trigoClasses.size(); i++) {
                TrigonometricFunction.TrigonometricFuncExec exec = trigoMathFunctions.get(i);
                double val = Math.toRadians(MyReal.toReal(nb).getValue().doubleValue());
                Double resD = exec.apply(val);
                // If the result was supposed to be an error
                if (resD.isInfinite() || resD.isNaN())
                {
                    assertEquals(MyErrorNumber.class, calculator.eval(trigoClasses.get(i).build(nb)).getClass());
                }
                else
                {
                    assertEquals(MyReal.valueOf(resD), calculator.eval(trigoClasses.get(i).build(nb)));
                }
            }
        }
    }

    @Test
    public void testMyComplexDeg() throws Exception {
        Configuration.setUseDegrees(true);
        MyComplex nb = (MyComplex) MyComplex.create(1,1);
        boolean[] values = new boolean[] {true, false};
        for (int i = 0; i < values.length; i++) {
            Configuration.setUseDegrees(values[i]);
            for (BuildUnaryOperationFunction<TrigonometricFunction> trigoClass : trigoClasses) {
                // The result was supposed to be an error
                assertEquals(MyErrorNumber.class, calculator.eval(trigoClass.build(nb)).getClass());
            }
        }
    }

    @Test
    public void testMyInfinityDeg() throws Exception {
        Configuration.setUseDegrees(false);
        MyInfinity nb = new MyInfinity(true);
        boolean[] values = new boolean[] {true, false};
        for (boolean value : values) {
            Configuration.setUseDegrees(value);
            for (BuildUnaryOperationFunction<TrigonometricFunction> trigoClass : trigoClasses) {
                // The result was supposed to be an error
                assertEquals(MyErrorNumber.class, calculator.eval(trigoClass.build(nb)).getClass());
            }
        }
        nb = new MyInfinity(false);
        for (boolean value : values) {
            Configuration.setUseDegrees(value);
            for (BuildUnaryOperationFunction<TrigonometricFunction> trigoClass : trigoClasses) {
                // The result was supposed to be an error
                assertEquals(MyErrorNumber.class, calculator.eval(trigoClass.build(nb)).getClass());
            }
        }
    }
}
