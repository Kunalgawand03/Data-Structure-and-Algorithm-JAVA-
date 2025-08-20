public class MaxSubarraySum3 {
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < numbers.length; i++){
            cs += numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum subarray sum is: " + ms);   
    }
    public static void main(String args[]) {
        int numbers[] = {1, -2, 3, 4, -5, 6};
        kadanes(numbers);
    }  
}
