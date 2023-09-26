/*

Palindrome

Time Limit: 2, Memory Limit: 256000

Given a string S find minimum number of changes required to make the string palindrome. In a change you can change any index of the string to any character.
A palindrome is a string that remains the same if reversed.

Input

First and only line of input contains a string S.

Constraints

1 <= |S| <= 100000

S contains only lowercase letters

Output

Output a single integer which is the minimum number  of changes required to make string palindrome.

 */

import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int changes = minPalindromeChanges(s);
        System.out.println(changes);
    }

    public static int minPalindromeChanges(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();

        int changes = 0;

        // Check each character from the start and end of the string
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                changes++;
            }
        }

        return changes;
    }
}
