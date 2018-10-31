/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q1;

import java.util.Scanner;

/**
 *
 * @author Yee Jet Tan
 */
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
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
            
            else continue;
        }
        
        System.out.println();
        
        
    }
    
}
