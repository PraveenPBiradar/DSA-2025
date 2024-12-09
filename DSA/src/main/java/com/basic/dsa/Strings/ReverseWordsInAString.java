package com.basic.dsa.Strings;

//leetcode prob 151
public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        int low = 0;
        int high = str.length - 1;

        while (low <= high) {
            String temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
        return String.join(" ",str);
    }

    public static void main(String[] args) {
        String s = "hello";
        String cleanedStr = s.trim().replaceAll("\\s+", " ");
        System.out.println(cleanedStr);
        String res = reverseWords(cleanedStr);
        System.out.println(res);
    }
}
