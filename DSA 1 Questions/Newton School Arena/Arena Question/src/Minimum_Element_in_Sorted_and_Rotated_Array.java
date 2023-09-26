/*

Minimum Element in Sorted and Rotated Array

Time Limit: 5, Memory Limit: 256000

Loki is one mischievous guy. He would always find different ways to make things difficult for everyone. After spending hours sorting a coded array of size N (in increasing order), you realise it’s been tampered with by none other than Loki. Like a clock, he has moved the array thus tampering the data.  The task is to find the minimum element in it.

Input

The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of two lines. The first line of each test case consists of an integer N, where N is the size of array.
The second line of each test case contains N space separated integers denoting array elements.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= A[i] <= 10^6

Sum of "N" over all testcases does not exceed 10^5

Output

Corresponding to each test case, in a new line, print the minimum element in the array.

 */

import java.util.Scanner;

public class Minimum_Element_in_Sorted_and_Rotated_Array {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int minElement = findMinElement(arr);
            System.out.println(minElement);
        }
    }

    public static int findMinElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else if (arr[mid] < arr[right]) {
                right = mid;
            } else {
                // Handles the case when arr[mid] == arr[right]
                right--;
            }
        }

        return arr[left];
    }
}
