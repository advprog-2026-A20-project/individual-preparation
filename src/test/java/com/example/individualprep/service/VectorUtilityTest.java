package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class VectorUtilityTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
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
}
