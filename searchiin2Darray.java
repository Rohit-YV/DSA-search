import java.util.Arrays;

public class searchiin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 4},
                {18, 19, 70},
                {34, 78, 87},
                {1},
        };
        int target = 19;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        int[] a = max(arr);
        System.out.println(Arrays.toString(a));
    }

    static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }

        }
        return new int[]{-1, -1};
    }


    static int[] max(int[][] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {

                if (element > maxi) {
                    maxi = element;
                }
            }

        }
        return new int[]{maxi};
    }
}
