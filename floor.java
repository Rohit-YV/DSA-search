public class floor {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,14,18,20};
        int target = 15;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    //return greatest number <= target 
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid -1;

            }
        }
        return end;
    }
}
