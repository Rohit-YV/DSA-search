public class find_even_num_of_integer {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static int digit(int nums){
       int count = 0;
       while(nums > 0){
           count++;
           nums = nums / 10;
       }
        return count;
    }
    static boolean even(int nums){
        int number_of_digit = digit(nums);
        if(number_of_digit %2 == 0){
            return true;
        }
        return false;
    }
}
