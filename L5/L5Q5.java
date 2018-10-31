import java.util.Random;
import java.util.Scanner;

public class L5Q5 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        
        //generates 20 random integers
        int[] arr = new int[20];
        System.out.println("A list of random integer within 0 to 100");
        for(int i=0 ; i<20 ; i++){
            arr[i] = r.nextInt(101);
            System.out.print(arr[i]);
            
            if(i==19) break;
            
            System.out.print(", ");
        }
        System.out.println();
        
        //Bubble sort array in descending order
        System.out.println("Array in descending order");
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=0 ; j<arr.length-1-i ; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        //print array
        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
            
            if(i==19) break;
            
            System.out.print(", ");
        }
        System.out.println();
        
        //Get a number to search for
        System.out.print("Enter a number to search: ");
        int num = s.nextInt();
        
        //Using linear search
        for(int i=0 ; i<arr.length ; i++){
            if(num==arr[i]){
                System.out.println(num + " found");
                System.out.println("Linear Search - " + i + " loop(s)");
                break;
            } 
        }
        
        //Using binary search
        int low = 0;
        int high = arr.length-1;
        int middle;
        int loop_count = 0;
        
        while(low <= high){
            middle = (low + high)/2;
            
            if (num == arr[middle]){
                break;
            }
            
            else if (num < arr[middle])
                high = middle - 1;
            else   
                low = middle + 1;
            
            loop_count++;
        }
        System.out.println(num + " found");
        System.out.println("Binary Search - " + loop_count + " loop(s)");
    }
}
