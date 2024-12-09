package com.basic.dsa.recursion;

public class PrintN {
    public static void main(String[] args) {
        printN(54);
    }

    private static void printN(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printN(n - 1);
    }
}
