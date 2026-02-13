package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArithmeticUtilityTest {

    @Test
    void divideReturnsQuotient() {
        ArithmeticUtility utility = new ArithmeticUtility();

        double result = utility.divide(9.0, 4.0);

        assertEquals(2.25, result);
    }
}
