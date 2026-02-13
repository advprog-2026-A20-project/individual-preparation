package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void add_returnsElementWiseSum() {
        double[] v1 = {1.5, -2.0, 3.25};
        double[] v2 = {2.5, 4.0, -1.25};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(new double[] {4.0, 2.0, 2.0}, result, 1e-9);
    }

    @Test
    void subtractReturnsElementwiseDifference() {
        double[] v1 = { 5.0, 2.0, -1.0 };
        double[] v2 = { 1.0, 4.0, -3.0 };

        double[] result = vectorUtility.subtract(v1, v2);

        assertArrayEquals(new double[] { 4.0, -2.0, 2.0 }, result, 1e-9);
    }

    @Test
    void subtractThrowsWhenLengthsDiffer() {
        double[] v1 = { 1.0, 2.0, 3.0 };
        double[] v2 = { 1.0, 2.0 };

        assertThrows(IllegalArgumentException.class,
                () -> vectorUtility.subtract(v1, v2));
    }

    @Test
    void dotProductReturnsCorrectResult() {
        double[] v1 = { 1.0, 3.0, -5.0 };
        double[] v2 = { 4.0, -2.0, -1.0 };

        double result = vectorUtility.dotProduct(v1, v2);

        assertEquals(3.0, result, 1e-9);
    }

    @Test
    void dotProductThrowsWhenLengthsDiffer() {
        double[] v1 = { 1.0, 2.0 };
        double[] v2 = { 1.0, 2.0, 3.0 };

        assertThrows(IllegalArgumentException.class,
                () -> vectorUtility.dotProduct(v1, v2));
    }

    @Test
    void dotProductThrowsWhenVectorIsEmpty() {
        double[] v1 = {};
        double[] v2 = {};

        assertThrows(IllegalArgumentException.class,
                () -> vectorUtility.dotProduct(v1, v2));
    }

}
