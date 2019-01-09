package l4q1;

import java.util.Scanner;

public class L4Q1 {

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        
        System.out.println();
        
        System.out.print("The factors are: 1");
        for (int i = 2; i <= input; i++){
            if (input % i == 0){
                System.out.print(", " + i);
            }            
        }
        
        System.out.println();
    }
    
}
