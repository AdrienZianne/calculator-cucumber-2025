package calculator.operation.binary;

import calculator.Calculator;

public abstract class TestBinaryOperation {

    public final Calculator calculator = new Calculator();

    public abstract void TestMyIntegerMyInteger();
    public abstract void TestMyIntegerMyReal();
    public abstract void TestMyIntegerMyComplex();
    public abstract void TestMyIntegerMyRational();
    public abstract void TestMyIntegerMyInfinity();
    //public abstract void TestMyIntegerMyUnknown();

    public abstract void TestMyRealMyInteger();
    public abstract void TestMyRealMyReal();
    public abstract void TestMyRealMyComplex();
    public abstract void TestMyRealMyRational();
    public abstract void TestMyRealMyInfinity();
    //public abstract void TestMyRealMyUnknown();

    public abstract void TestMyComplexMyInteger();
    public abstract void TestMyComplexMyReal();
    public abstract void TestMyComplexMyComplex();
    public abstract void TestMyComplexMyRational();
    public abstract void TestMyComplexMyInfinity();
    //public abstract void TestMyComplexMyUnknown();

    public abstract void TestMyRationalMyInteger();
    public abstract void TestMyRationalMyReal();
    public abstract void TestMyRationalMyComplex();
    public abstract void TestMyRationalMyRational();
    public abstract void TestMyRationalMyInfinity();
    //public abstract void TestMyRationalMyUnknown();


    public abstract void TestMyInfinityMyInteger();
    public abstract void TestMyInfinityMyReal();
    public abstract void TestMyInfinityMyComplex();
    public abstract void TestMyInfinityMyRational();
    public abstract void TestMyInfinityMyInfinity();
    //public abstract void TestMyInfinityMyUnknown();

    /*
    public abstract void TestMyUnknownMyInteger();
    public abstract void TestMyUnknownMyReal();
    public abstract void TestMyUnknownMyComplex();
    public abstract void TestMyUnknownMyRational();
    public abstract void TestMyUnknownMyInfinity();
    public abstract void TestMyUnknownMyUnknown();
     */


}
