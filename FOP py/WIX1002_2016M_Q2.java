/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wix1002_2016m_q2;

import java.util.Scanner;

/**
 *
 * @author Yee Jet Tan
 */
public class WIX1002_2016M_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min_num =0, min_num_count = 0, the_int = 0;
        
        System.out.print("Enter Integer (-1 to quit) : ");
        
        //initialize the_int and min_num
        the_int = s.nextInt();
        
        if(the_int != -1){
            min_num = the_int;
        }
        
        while(the_int != -1){
            System.out.print(the_int + " ");
            
            if(min_num > the_int){
                min_num_count = 1;
                min_num = the_int;
            } 
            
            else if(the_int == min_num){
                min_num_count++;
            }
            
            the_int = s.nextInt();
        }
        
        System.out.println();
        System.out.println("The minimum number is " + min_num);
        System.out.println("The occurence count of " + min_num + " is " + min_num_count);
    }
    
}
