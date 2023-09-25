/*

Bubble sort in pair array

Time Limit: 2, Memory Limit: 256000

Given an array of n pairs of integers. Your task is to sort the array on the basis of the first element of pairs in descending order. If the first element is equal in two or more pairs then give preference to the pair that has a greater second element value.
Input

User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function SortPair() that takes the array of pairs and the integer N(size of the array) as a parameter.

Custom Input
The first line of input will be a single integer N. The next line of input contains 2*N space-separated integers where unique adjacent elements are pairs. Custom input for 1st sample:-
4
1 2 3 4 5 6 7 8

Constraints:-
1<=N<=103
1<=value<=105

Output
Return the sorted array of pairs.

 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bubble_sort_in_pair_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }

        Arrays.sort(pairs, new PairComparator());

        for (int[] pair : pairs) {
            System.out.println(pair[0] + ", " + pair[1]);
        }

        scanner.close();
    }

    static class PairComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] pair1, int[] pair2) {
            // Compare the first elements in descending order
            int cmp = Integer.compare(pair2[0], pair1[0]);

            // If the first elements are equal, compare the second elements in descending order
            if (cmp == 0) {
                cmp = Integer.compare(pair2[1], pair1[1]);
            }

            return cmp;
        }
    }

}
