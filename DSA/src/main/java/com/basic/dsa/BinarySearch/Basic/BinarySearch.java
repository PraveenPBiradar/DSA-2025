package com.basic.dsa.BinarySearch.Basic;

// leetcode prob 704
// TC: o(logn)
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 10;
        int res = search(arr, target);
        System.out.println(res);
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // in some cases, adding low and high might exceed the maximum value of integers, causing an overflow. // int_max+int_max/2 overflow
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
