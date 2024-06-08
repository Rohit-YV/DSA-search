public class searchinrange {
    public static void main(String[] args) {
    int[]arr = {1,34,2342,42,24,41,313,422};
    int target = 42;
            int ans = search(arr,target,1,4);
            System.out.println(ans);
    }
    static int  search(int[] arr, int target, int start, int end){
        if(arr.length ==0){
            return Integer.MAX_VALUE;
        }
        for(int i = start;i< arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
