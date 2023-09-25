/*
Compute power
Time Limit: 2, Memory Limit: 256000

You are given two numbers n and p. You need to find n raised to the power p.

Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function RecursivePower that takes the integer n and p as a parameter.

Constraints:
1 <= T <= 10
1 <= n, p <= 9

Output
Return n^p.

 */



import java.util.Scanner;

public class Compute_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int result = power(n, p);
            System.out.println(result);
            t--;
        }
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        } else {
            int reciprocal = 1 / base;
            return reciprocal * power(reciprocal, -exponent - 1);
        }
    }

}
