package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArithmeticUtilityTest {
    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void multiply_returnsProductForVariousOperands() {
        assertEquals(12.0, arithmeticUtility.multiply(3.0, 4.0), 1e-9);
        assertEquals(-15.0, arithmeticUtility.multiply(-3.0, 5.0), 1e-9);
        assertEquals(0.0, arithmeticUtility.multiply(0.0, 8.5), 1e-9);
        assertEquals(2.25, arithmeticUtility.multiply(1.5, 1.5), 1e-9);
    }
}
