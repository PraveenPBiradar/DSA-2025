package com.basic.dsa.BinarySearch.UpperLowerBound;

public class FirstBadVersion {
    private static final int FIRST_BAD_VERSION = 7;

    public static void main(String[] args) {
        int res = firstBadVersion(10);
        System.out.println(res);
    }

    public static int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int firstBad = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            boolean res = isBadVersion(mid);
            if (res) {
                firstBad = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return firstBad;
    }

    public static boolean isBadVersion(int version) {
        return version >= FIRST_BAD_VERSION;
    }
}
