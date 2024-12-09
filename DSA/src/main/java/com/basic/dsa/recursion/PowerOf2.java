package com.basic.dsa.recursion;

public class PowerOf2 {
    public static void main(String[] args) {
        int res = pow2(5);
        System.out.println(res);
    }

    public static int pow2(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * pow2(n - 1);
    }
}
