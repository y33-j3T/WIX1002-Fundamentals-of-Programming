import java.util.Scanner;

public class L6Q1 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of triangular numbers to display: ");
        int n = s.nextInt();
        
        for(int nums : triangular_nums(n)){
            System.out.println(nums);
        }        
    }
    
    public static int[] triangular_nums(int n){
        int[] nums = new int[n];
        
        for(int i=1 ; i<=n ; i++){
            int sum = 0;
            for(int j=1 ; j<=i ; j++){
                sum += j;
            }
            nums[i-1] = sum;
        }        
        return nums;
    }    
}
