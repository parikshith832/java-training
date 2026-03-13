package Day10;

import java.util.Scanner;

public class mouse {

    static boolean solvemaze(int arr[][], int x, int y, int sol[][], int matrix) {
        if (x == matrix - 1 && y == matrix - 1 && arr[x][y] == 1) {
            sol[x][y] = 1;
            return true;

        }
        if (x >= 0 && y >= 0 && x < matrix && y < matrix && arr[x][y] == 1) {
            sol[x][y] = 1;
            if (solvemaze(arr, x + 1, y, sol, matrix))
                return true;

            if (solvemaze(arr, x, y + 1, sol, matrix))
                return true;
            sol[x][y] = 0;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix = sc.nextInt();
        int arr[][] = new int[matrix][matrix];
        for (int n = 0; n < matrix; n++) {
            for (int m = 0; m < matrix; m++) {
                arr[n][m] = sc.nextInt();
            }
        }

        int sol[][] = new int[matrix][matrix];

        if (solvemaze(arr, 0, 0, sol, matrix)) {
            for (int n = 0; n < matrix; n++) {
                for (int m = 0; m < matrix; m++) {
                    arr[n][m] = sc.nextInt();
                }
            }
        } else {
            System.out.println("No Solution");
        }
    }

}