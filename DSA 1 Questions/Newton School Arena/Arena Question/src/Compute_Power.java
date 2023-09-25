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
