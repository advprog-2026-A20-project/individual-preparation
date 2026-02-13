package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class VectorUtilityTest {

    @Test
    void subtractReturnsElementwiseDifference() {
        VectorUtility utility = new VectorUtility();
        double[] v1 = { 5.0, 2.0, -1.0 };
        double[] v2 = { 1.0, 4.0, -3.0 };

        double[] result = utility.subtract(v1, v2);

        assertArrayEquals(new double[] { 4.0, -2.0, 2.0 }, result, 1e-9);
    }

    @Test
    void subtractThrowsWhenLengthsDiffer() {
        VectorUtility utility = new VectorUtility();
        double[] v1 = { 1.0, 2.0, 3.0 };
        double[] v2 = { 1.0, 2.0 };

        assertThrows(IllegalArgumentException.class, () -> utility.subtract(v1, v2));
    }
}
