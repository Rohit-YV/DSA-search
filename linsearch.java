public class linsearch {
    public static void main(String[] args) {
        int[] num = {1, 23, 45, 56, 89, 90, 98};
        int target = 0;
        int ans = linearsearch(num, target);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}