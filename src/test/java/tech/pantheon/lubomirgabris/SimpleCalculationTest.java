package tech.pantheon.lubomirgabris;


import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;


class SimpleCalculationTest {

    @Test
    void alg1Test() {
        SimpleCalculator alg1 = new SimpleCalculator();
        alg1.setFirstNumber(BigInteger.valueOf(150));
        alg1.setSecondNumber(BigInteger.valueOf(-10));
        assertEquals(BigInteger.valueOf(-1500), alg1.getSimpleMultiplication());
    }


    @Test
    void alg2Test() {
        KaratsubaString alg2 = new KaratsubaString();
        assertEquals(String.valueOf(1500), alg2.multiply("150", "10"));
    }



    @Test
    void compareBothAlgorithms() {
        SimpleCalculator alg1 = new SimpleCalculator();
        alg1.setFirstNumber(BigInteger.valueOf(2345678901234567890L));
        alg1.setSecondNumber(BigInteger.valueOf(1111111111111111111L));
        KaratsubaString alg2 = new KaratsubaString();
        assertEquals(String.valueOf(alg1.getSimpleMultiplication()), alg2.multiply("2345678901234567890", "1111111111111111111"));
    }

}