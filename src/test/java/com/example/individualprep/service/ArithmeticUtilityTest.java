package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArithmeticUtilityTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void exponent_handlesPositiveExponent() {
        double result = arithmeticUtility.exponent(2.0, 3);

        assertEquals(8.0, result, 1e-9);
    }

    @Test
    void exponent_handlesZeroExponent() {
        double result = arithmeticUtility.exponent(5.5, 0);

        assertEquals(1.0, result, 1e-9);
    }

    @Test
    void divideReturnsQuotient() {
        ArithmeticUtility utility = new ArithmeticUtility();

        double result = utility.divide(9.0, 4.0);

        assertEquals(2.25, result);
    }

    @Test
    void subtractReturnsDifference() {
        ArithmeticUtility utility = new ArithmeticUtility();

        double result = utility.subtract(7.5, 2.5);

        assertEquals(5.0, result);
    }

    @Test
    void subtractWithNegativeResult() {
        ArithmeticUtility utility = new ArithmeticUtility();

        double result = utility.subtract(3.0, 5.0);

        assertEquals(-2.0, result);
    }
}
