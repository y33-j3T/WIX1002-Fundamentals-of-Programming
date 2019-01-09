/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Yee Jet Tan
 */
public class L6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int score = 0;
        
        while (true){
            int a = r.nextInt(13);
            int b = r.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.print(a + " x " + b + " = ");
            int c = s.nextInt();
            
            if(c<0){
                break;
            }
            
            if(multCheck(a, b, c)){
                score++;
            }
        }
        
        System.out.println("Your score is " + score);
    }
    
    public static boolean multCheck(int a, int b, int c) {
        boolean valid = false;
        if (c == a*b){
            valid = true;
        } 
        
        return valid;
    }
    
}
