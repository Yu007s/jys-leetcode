package com.jys.leetcode.jysleetcode.leetcode.num509;

class Solution {
    /**
     * f(n) =  f(n-1)  +  f(n-2)
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }



}