package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void zero() {
        Solution solution = new Solution();
        assertFalse(solution.isPowerOfThreeRecWrapper(0));
    }

    @Test
    void one() {
        Solution solution = new Solution();
        assertTrue(solution.isPowerOfThreeRecWrapper(1));
    }

    @Test
    void three() {
        Solution solution = new Solution();
        assertTrue(solution.isPowerOfThreeRecWrapper(3));
    }

    @Test
    void powerOfThree() {
        Solution solution = new Solution();
        assertTrue(solution.isPowerOfThreeRecWrapper(81));
    }

    @Test
    void notPowerOfThree() {
        Solution solution = new Solution();
        assertFalse(solution.isPowerOfThreeRecWrapper(21));
    }

    @Test
    void negative_NotPowerOfThree() {
        Solution solution = new Solution();
        assertFalse(solution.isPowerOfThreeRecWrapper(-21));
    }

    @Test
    void negative_PowerOfThree() {
        Solution solution = new Solution();
        assertFalse(solution.isPowerOfThreeRecWrapper(-27));
    }

    @Test
    void intMax() {
        Solution solution = new Solution();
        assertFalse(solution.isPowerOfThreeRecWrapper(Integer.MAX_VALUE));
    }

    @Test
    void intMin() {
        Solution solution = new Solution();
        assertFalse(solution.isPowerOfThreeRecWrapper(Integer.MIN_VALUE));
    }

}