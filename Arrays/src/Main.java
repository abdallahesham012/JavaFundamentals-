import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[3];
        boolean[] flags = new boolean[3];
        String[] names = new String[3];
        System.out.println(nums[0]);   // 0
        System.out.println(flags[0]);  // false
        System.out.println(names[0]);  // null
        /*
        Type	Default Value
        int	    0
        double	0.0
        boolean	false
        String	null
         */

        System.out.println();

        int[] numbers = {10, 20, 30, 40};
        System.out.println(numbers); // It's reference type so will print an address >> [I@27716f4
        System.out.println(numbers[0]); // 10

        System.out.println();

        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");

        System.out.println();

        // Enhanced For Loop (for-each)
        for (int num : numbers)
            System.out.print(num + " ");

        System.out.println();
        System.out.println();

        System.out.println(Arrays.toString(numbers));
        System.out.println();

        numbers = new int[]{20, 4, 28, 63, 5}; // >> numbers = {20, 4, 28, 63, 5} >> ERROR
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println();

        // >> Important: array must be sorted first
        int index = Arrays.binarySearch(numbers, 20);
        System.out.println(index); // position of 2
        index = Arrays.binarySearch(numbers, 1);
        System.out.println(index); // position of -1 not found

        System.out.println();

        int[] copy = Arrays.copyOf(numbers, 10);
        System.out.println(Arrays.toString(copy)); // [4, 5, 20, 28, 63, 0, 0, 0, 0, 0]

        System.out.println();

        int[] numbers2 = new int[5];
        Arrays.fill(numbers2, 7);
        System.out.println(Arrays.toString(numbers2)); // [7,7,7,7,7]

        System.out.println();

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b)); // true

        System.out.println();

        // Multi-Dimensional Array

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        System.out.println(matrix[1][0]); // 3 >> matrix[row][column]

        System.out.println();

        int[][] matrix2 = new int[2][3]; // 2 rows, 3 columns

        System.out.println(matrix2.length);     // rows = 2
        System.out.println(matrix2[0].length);  // columns = 3

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {           // rows
            for (int j = 0; j < matrix[i].length; j++) {    // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }
}