package com.example.util;

public class StringUtil {
    public static String reverseLetters(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        int start = 0;
        int end = str.length()-1;
        char[] output = str.toCharArray();
        while (start < end) {
            if(Character.isLetter(output[start]) &&  Character.isLetter(output[end])) {
                char temp = output[start];
                output[start] = output[end];
                output[end] = temp;
                start++;
                end--;
            }
            if(!Character.isLetter(output[start])) {
                start++;
            }
            if(!Character.isLetter(output[end])) {
                end--;
            }
        }
        return new String(output);
    }
}
