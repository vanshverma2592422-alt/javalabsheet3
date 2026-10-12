import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter question number (1-30): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: q1(); break;
            case 2: q2(); break;
            case 3: q3(); break;
            case 4: q4(); break;
            case 5: q5(); break;
            case 6: q6(); break;
            case 7: q7(); break;
            case 8: q8(); break;
            case 9: q9(); break;
            case 10: q10(); break;
            case 11: q11(); break;
            case 12: q12(); break;
            case 13: q13(); break;
            case 14: q14(); break;
            case 15: q15(); break;
            case 16: q16(); break;
            case 17: q17(); break;
            case 18: q18(); break;
            case 19: q19(); break;
            case 20: q20(); break;
            case 21: q21(); break;
            case 22: q22(); break;
            case 23: q23(); break;
            case 24: q24(); break;
            case 25: q25(); break;
            case 26: q26(); break;
            case 27: q27(); break;
            case 28: q28(); break;
            case 29: q29(); break;
            case 30: q30(); break;
            default: System.out.println("Invalid choice");
        }
        sc.close();
    }

    // Q1. Input and display 5 integers using a 1-D array.
    static void q1() {
        int[] a = new int[5];

        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        for (int value : a)
            System.out.println(value);
    }

    // Q2. Input 10 integers and display them in reverse order.
    static void q2() {
        int[] a = new int[10];

        for (int i = 0; i < 10; i++)
            a[i] = sc.nextInt();

        for (int i = 9; i >= 0; i--)
            System.out.println(a[i]);
    }

    // Q3. Find the sum of all elements in a 1-D array.
    static void q3() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        System.out.println(sum);
    }

    // Q4. Find the maximum element in an array.
    static void q4() {
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int max = a[0];

        for (int value : a)
            if (value > max)
                max = value;

        System.out.println(max);
    }

    // Q5. Count even and odd numbers in an array.
    static void q5() {
        int n = sc.nextInt();
        int even = 0, odd = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }

    // Q6. Copy all elements from one array to another.
    static void q6() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            b[i] = a[i];

        System.out.println(Arrays.toString(b));
    }

    // Q7. Input and display a 3 x 3 matrix.
    static void q7() {
        int[][] a = new int[3][3];

        readMatrix(a);
        printMatrix(a);
    }

    // Q8. Find the sum of all elements in a matrix.
    static void q8() {
        int[][] a = new int[3][3];
        int sum = 0;

        readMatrix(a);

        for (int[] row : a)
            for (int value : row)
                sum += value;

        System.out.println(sum);
    }

    // Q9. Find the sum of each row in a matrix.
    static void q9() {
        int[][] a = new int[3][3];

        readMatrix(a);

        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int value : a[i])
                sum += value;

            System.out.println("Row " + (i + 1) + " = " + sum);
        }
    }

    // Q10. Find the sum of each column in a matrix.
    static void q10() {
        int[][] a = new int[3][3];

        readMatrix(a);

        for (int j = 0; j < 3; j++) {
            int sum = 0;

            for (int i = 0; i < 3; i++)
                sum += a[i][j];

            System.out.println("Column " + (j + 1) + " = " + sum);
        }
    }

    // Q11. Transpose a matrix.
    static void q11() {
        int[][] a = new int[3][3];

        readMatrix(a);

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++)
                System.out.print(a[i][j] + " ");

            System.out.println();
        }
    }

    // Q12. Add two matrices of the same size.
    static void q12() {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        readMatrix(a);
        readMatrix(b);

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                c[i][j] = a[i][j] + b[i][j];

        printMatrix(c);
    }

    // Q13. Multiply two 3 x 3 matrices.
    static void q13() {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        readMatrix(a);
        readMatrix(b);

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    c[i][j] += a[i][k] * b[k][j];

        printMatrix(c);
    }

    // Q14. Input and display a 2 x 2 x 2 3-D array.
    static void q14() {
        int[][][] a = new int[2][2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    a[i][j][k] = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    System.out.print(a[i][j][k] + " ");

                System.out.println();
            }

            System.out.println();
        }
    }

    // Q15. Find the sum of all elements in a 3-D array.
    static void q15() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int[][][] a = new int[x][y][z];
        int sum = 0;

        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                for (int k = 0; k < z; k++) {
                    a[i][j][k] = sc.nextInt();
                    sum += a[i][j][k];
                }

        System.out.println(sum);
    }

    // Q16. Count positive and negative numbers in a 3-D array.
    static void q16() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int positive = 0, negative = 0;

        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                for (int k = 0; k < z; k++) {
                    int value = sc.nextInt();

                    if (value > 0)
                        positive++;
                    else if (value < 0)
                        negative++;
                }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
    }

    // Q17. Find the maximum element in a 3-D array.
    static void q17() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                for (int k = 0; k < z; k++) {
                    int value = sc.nextInt();

                    if (value > max)
                        max = value;
                }

        System.out.println(max);
    }

    // Q18. Search for an element in a 3-D array.
    static void q18() {
        int[][][] a = new int[2][2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    a[i][j][k] = sc.nextInt();

        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    if (a[i][j][k] == target) {
                        System.out.println(
                            "Position: [" + i + "][" + j + "][" + k + "]"
                        );
                        found = true;
                    }

        if (!found)
            System.out.println("Element not found");
    }

    // Q19. Create and display a jagged array.
    static void q19() {
        int[][] a = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9}
        };

        for (int[] row : a)
            System.out.println(Arrays.toString(row));
    }

    // Q20. Store marks for students taking different numbers of subjects.
    static void q20() {
        int students = sc.nextInt();
        int[][] marks = new int[students][];

        for (int i = 0; i < students; i++) {
            int subjects = sc.nextInt();
            marks[i] = new int[subjects];

            for (int j = 0; j < subjects; j++)
                marks[i][j] = sc.nextInt();
        }

        for (int i = 0; i < students; i++)
            System.out.println(
                "Student " + (i + 1) + ": " + Arrays.toString(marks[i])
            );
    }

    // Q21. Rotate an array to the left by one position.
    static void q21() {
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        if (n > 0) {
            int first = a[0];

            for (int i = 0; i < n - 1; i++)
                a[i] = a[i + 1];

            a[n - 1] = first;
        }

        System.out.println(Arrays.toString(a));
    }

    // Q22. Count how many times each element appears in an array.
    static void q22() {
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean[] counted = new boolean[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (counted[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++)
                if (a[i] == a[j]) {
                    count++;
                    counted[j] = true;
                }

            System.out.println(
                a[i] + " appears " + count + " time(s)"
            );
        }
    }

    // Q23. Find the second largest distinct element in an array.
    static void q23() {
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Integer largest = null;
        Integer second = null;

        for (int value : a) {
            if (largest == null || value > largest) {
                second = largest;
                largest = value;
            } else if (value != largest &&
                       (second == null || value > second)) {
                second = value;
            }
        }

        if (second == null)
            System.out.println("Second largest element does not exist");
        else
            System.out.println(second);
    }

    // Q24. Remove duplicate elements without using collections.
    static void q24() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] unique = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int value : a) {
            boolean exists = false;

            for (int j = 0; j < size; j++)
                if (unique[j] == value)
                    exists = true;

            if (!exists)
                unique[size++] = value;
        }

        for (int i = 0; i < size; i++)
            System.out.print(unique[i] + " ");

        System.out.println();
    }

    // Q25. Sum of main and secondary diagonal elements.
    static void q25() {
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        readMatrix(a);

        int main = 0, secondary = 0;

        for (int i = 0; i < n; i++) {
            main += a[i][i];
            secondary += a[i][n - 1 - i];
        }

        System.out.println("Main diagonal sum = " + main);
        System.out.println("Secondary diagonal sum = " + secondary);
    }

    // Q26. Display upper and lower triangular parts separately.
    static void q26() {
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        readMatrix(a);

        System.out.println("Upper triangular matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((i <= j ? a[i][j] : 0) + " ");

            System.out.println();
        }

        System.out.println("Lower triangular matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((i >= j ? a[i][j] : 0) + " ");

            System.out.println();
        }
    }

    // Q27. Print only the boundary elements of a matrix.
    static void q27() {
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];

        readMatrix(a);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 ||
                    j == 0 || j == cols - 1)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }

    // Q28. Search for an element in a 2-D array.
    static void q28() {
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];

        readMatrix(a);

        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (a[i][j] == target) {
                    System.out.println(
                        "Row " + (i + 1) + ", Column " + (j + 1)
                    );
                    found = true;
                }

        if (!found)
            System.out.println("Element not found");
    }

    // Q29. Sort the elements of each row in a jagged array.
    static void q29() {
        int rows = sc.nextInt();
        int[][] a = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int cols = sc.nextInt();
            a[i] = new int[cols];

            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextInt();

            Arrays.sort(a[i]);
        }

        for (int[] row : a)
            System.out.println(Arrays.toString(row));
    }

    // Q30. Check whether a matrix is sparse.
    static void q30() {
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];

        int zeros = 0, nonZeros = 0;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] == 0)
                    zeros++;
                else
                    nonZeros++;
            }

        if (zeros > nonZeros)
            System.out.println("Sparse matrix");
        else
            System.out.println("Not a sparse matrix");
    }

    static void readMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = sc.nextInt();
    }

    static void printMatrix(int[][] a) {
        for (int[] row : a) {
            for (int value : row)
                System.out.print(value + " ");

            System.out.println();
        }
    }
}
