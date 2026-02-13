package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class VectorUtilityTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void multiply_returnsScaledVector() {
        double[] v1 = {1.5, -2.0, 3.25};
        int x = 2;

        double[] result = vectorUtility.multiply(v1, x);

        assertArrayEquals(new double[] {3.0, -4.0, 6.5}, result, 1e-9);
    }
}