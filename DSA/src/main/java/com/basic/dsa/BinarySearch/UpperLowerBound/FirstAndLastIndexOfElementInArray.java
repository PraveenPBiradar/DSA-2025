package com.basic.dsa.BinarySearch.UpperLowerBound;

import java.util.Arrays;

public class FirstAndLastIndexOfElementInArray {
    public static int[] searchRange(int[] nums, int target) {
        int first = firstOccur(nums, target);
        int last = lastOccur(nums, target);
        int[] res = new int[2];
        res[0] = first;
        res[1] = last;
        return res;
    }

    public static int lastOccur(int[] a, int target) {
        int low = 0;
        int last = -1;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static int firstOccur(int[] a, int target) {
        int low = 0;
        int first = -1;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        int[] res = searchRange(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
