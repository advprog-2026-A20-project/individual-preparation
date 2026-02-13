package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
}
