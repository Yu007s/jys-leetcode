package com.jys.leetcode.jysleetcode.leetcode.num70;

class Solution {
    /**
     * f(n) =  f(n-1)  +  f(n-2)
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;


        int prev2 = 1; // f(1)
        int prev1 = 2; // f(2)

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2; // f(n) = f(n-1) + f(n-2)
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }



    public static void main(String[] args) {
        System.out.printf(String.valueOf(climbStairs(4)));
    }
}