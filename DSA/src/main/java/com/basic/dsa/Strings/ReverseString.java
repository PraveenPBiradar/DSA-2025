package com.basic.dsa.Strings;

//leetcode prob 344
public class ReverseString {
    public static void main(String[] args) {
        char[] ch = {'H', 'a', 'n', 'n', 'a' , 'h'};
        reverseString(ch);
    }

    public static void reverseString(char[] ch) {
        int low = 0;
        int high = ch.length - 1;

        while (low <= high) {
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }

        System.out.println(ch);
    }
}
