/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q2;

import java.util.Scanner;

/**
 *
 * @author Yee Jet Tan
 */
public class L4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int total = 0;
        
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                total += j;
            }
        }
        
        System.out.println(total);
    }
    
}
