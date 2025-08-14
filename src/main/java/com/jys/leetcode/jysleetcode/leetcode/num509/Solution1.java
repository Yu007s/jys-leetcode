package com.jys.leetcode.jysleetcode.leetcode.num509;

class Solution1 {
    /**
     * f(n) =  f(n-1)  +  f(n-2)
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int p = 0; int q = 0; int r =1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = p +q;
        }

        return r;
    }


    public static void main(String[] args) {
        System.out.printf(String.valueOf(fib(2)));
    }
}