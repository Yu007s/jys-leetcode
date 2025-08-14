package com.jys.leetcode.jysleetcode.leetcode.num1137;

class Solution {
    /**
     * f(n) =  f(n-1)  +  f(n-2)
     * @param n
     * @return
     */
    public static int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;

        int x = 0; int y = 1; int z = 1 ;int r = 2;

        for (int i = 3; i <= n; i++) {
            x = y;
            y = z;
            z = r;
            r = x + y + z;
        }

        return z;
    }

    // 0 1 2 3 4 5

    // 0 1 1 2 4 7

    public static void main(String[] args) {
        System.out.printf(String.valueOf(fib(5)));
    }


}