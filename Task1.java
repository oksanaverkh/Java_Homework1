// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String s = sc.nextLine();
        System.out.printf("Reversed string: %s", reverseWords(s));
    }

    public static String reverseWords(String str) {
        String result = "";
        for (int i = (str.split("\\s+")).length - 1; i >= 0; i--) {
            result += (str.split("\\s+"))[i];
            if (i > 0) {
                result += " ";
            }
        }
        return result;
    }
}