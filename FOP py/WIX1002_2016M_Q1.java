/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wix1002_2016m_q1;

import java.util.Scanner;

/**
 *
 * @author Yee Jet Tan
 */
public class WIX1002_2016M_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter nine digit integer : ");
        int isbn = s.nextInt();
        System.out.print("10-digit ISBN : ");
        
        System.out.print(isbn/100000000);
        System.out.print("-");
        System.out.print((isbn/100000)%1000);
        System.out.print("-");
        System.out.print(isbn%100000);
        System.out.print("-");
        
        int sum_of_digit = 0;
        for(int i=9 ; i>=1 ; i--){
            sum_of_digit += ((isbn%10)*i)%11;
            isbn /= 10;
        }
        int checksum = sum_of_digit%11;
        if (checksum == 10){
            System.out.print("X");
        } else {
            System.out.print(checksum);
        }
        
        System.out.println();
        
    }
    
}
