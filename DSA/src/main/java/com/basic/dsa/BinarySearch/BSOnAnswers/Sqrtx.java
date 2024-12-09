package com.basic.dsa.BinarySearch.BSOnAnswers;

public class Sqrtx {
    public static int mySqrt(int x) {
        int low = 1;
        int high = x;
        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid <= x) {
                ans = mid;
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int res = mySqrt(0);
        System.out.println(res);
    }
}
