package tech.pantheon.lubomirgabris;

import java.math.BigInteger;


public class SimpleCalculator {

    private BigInteger firstNumber;
    private BigInteger secondNumber;

    public BigInteger getFirstNumber() {
        return firstNumber;
    }

    public BigInteger getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(BigInteger firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(BigInteger secondNumber) {
        this.secondNumber = secondNumber;
    }

    // First algorithm for multiplication
    public BigInteger getSimpleMultiplication() {
        return getFirstNumber().multiply(getSecondNumber());
    }

}