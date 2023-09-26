/*

Chess Board

Time Limit: 2, Memory Limit: 256000

Tom loves Chess boards. He admires its symmetry and how the black and white colors are placed adjacently along both axis.
More formally, a chessboard-like coloring implies that no two adjacent cells have the same color and all the cells are painted either white or black.
On his birthday, Tom has been gifted a board which is in the form of an N*N grid. Every cell is painted either black or white. Since Tom loves the placement of colors in a chessboard, he will try to convert the board that has been gifted to him, identical to a chessboard. He has both black and white colors available to him. Help him find out the minimum number of cells he will have to recolor to paint his board similar to a chessboard.

Input

The first line contains an integer N, denoting the size of the board
Each of the next N lines contains N space-separated integers and each integer being either '0' or '1'
'1' represent black cell
'0' represents white cell

Constraints

1 ≤ N ≤ 1000

Output

A single integer that is the minimum number of cells that Tom will have to re-color in his board to convert the given board to a chess board like coloring.

 */

import java.util.Scanner;

public class Chess_Board {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int result = minRecolorCells(n, board);
        System.out.println(result);
    }

    public static int minRecolorCells(int n, int[][] board) {
        int color1Changes = 0;
        int color0Changes = 0;

        // Calculate the number of changes needed for color 1 (starting with 1)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0 && board[i][j] != 1) {
                    color1Changes++;
                } else if ((i + j) % 2 == 1 && board[i][j] != 0) {
                    color1Changes++;
                }
            }
        }

        // Calculate the number of changes needed for color 0 (starting with 0)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0 && board[i][j] != 0) {
                    color0Changes++;
                } else if ((i + j) % 2 == 1 && board[i][j] != 1) {
                    color0Changes++;
                }
            }
        }

        return Math.min(color1Changes, color0Changes);
    }
}
