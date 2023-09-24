/*

Given a number N, find the sum of all the digits of the number

Note: Use a recursive method to solve this problem.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Sum() that takes the integer N as a parameter.

Constraints:
1 ≤ T ≤ 100
0 ≤ N ≤ 1000000000
Output
Return sum of digits.

*/

import java.util.Scanner;

public class Sum_of_digits {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0) {
        long N = sc.nextLong();

        long result = Sum(N);
        System.out.println(result);
        t--;
    }

}

public static long Sum(long n) {
    if (n < 10) {
        return n;
    } else {
        return n % 10 + Sum(n/ 10);
    }
}
}
