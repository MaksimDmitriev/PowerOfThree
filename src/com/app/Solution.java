package com.app;

public class Solution {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public boolean isPowerOfThreeRecWrapper(int n) {
        if (n <= 0) {
            return false;
        }
        return isPowerOfThreeRec(n);
    }

    private boolean isPowerOfThreeRec(int n) {
        return n == 1 || (n % 3 == 0 && isPowerOfThreeRec(n / 3));
    }
}
