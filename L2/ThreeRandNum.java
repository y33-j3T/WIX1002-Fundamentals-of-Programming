/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threerandnum;

import java.util.Random;

/**
 *
 * @author wid180503
 */
public class ThreeRandNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        double total = 0;
        double avg;
        int MAX = 40;
        double [] list = new double [3];
        
        System.out.println("The numbers are");
        for (int i = 0 ; i < 3 ; i++){
            list[i] = r.nextInt(MAX) + 10;
            System.out.printf("%-6.2f\n", list[i]);
        }
        
        System.out.println();
        
        for (int i = 0 ; i < 3 ; i++){
            total += list[i];
        }
        
        System.out.printf("The sum of numbers is %-6.2f\n\n", total);
        
        avg = total/3;
        System.out.printf("The average of numbers is %-6.2f\n", avg);
        
        
        
    }
    
}
