import java.util.*;

public class Spiralmatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0)
            return result;

        int top = 0;
        int bottom = matrix.length - 1;

        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // Traverse Left -> Right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse Right -> Left
            if (top <= bottom) {

                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }

                bottom--;
            }

            // Traverse Bottom -> Top
            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }

                left++;
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {

        System.out.println("Matrix:");

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix[i][j] = sc.nextInt();

            }
        }

        printMatrix(matrix);

        List<Integer> answer = spiralOrder(matrix);

        System.out.println("\nSpiral Traversal:");

        for (int num : answer) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}