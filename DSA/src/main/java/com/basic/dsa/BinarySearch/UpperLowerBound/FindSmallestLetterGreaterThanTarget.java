package com.basic.dsa.BinarySearch.UpperLowerBound;

public class FindSmallestLetterGreaterThanTarget {

    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        char ans = letters[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
             if (letters[mid] > target) {
                ans = letters[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        char[] ch = {'c', 'f', 'j'};
        char target = 'c';
        char res = nextGreatestLetter(ch, target);
        System.out.println(res);
    }
}
