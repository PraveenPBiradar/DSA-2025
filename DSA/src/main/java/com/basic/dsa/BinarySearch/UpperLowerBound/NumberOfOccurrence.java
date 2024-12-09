package com.basic.dsa.BinarySearch.UpperLowerBound;

public class NumberOfOccurrence {
    public static int countFreq(int[] arr, int target) {
        int rightOccur = countRightOccur(arr, target);
        int leftOccur = countLeftOccur(arr, target);
        if (rightOccur == -1 && leftOccur == -1) {
            return 0;
        }
        return rightOccur - leftOccur + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 3, 5, 5, 6, 6, 6, 7, 7, 7};
        int res = countFreq(arr, 9);
        System.out.println(res);
    }

    public static int countRightOccur(int[] arr, int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int countLeftOccur(int[] arr, int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
