/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vival3q3;

import java.util.Scanner;

/**
 *
 * @author Yee Jet Tan
 */
public class VivaL3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double comm;
        int salesVol;
        
        System.out.print("Enter sales volume: ");
        salesVol = in.nextInt();
        
        if (salesVol >= 0 && salesVol <= 100){
            comm = (salesVol%100) * 0.05;
            System.out.printf("%4d*0.05 = %-6.2f\n", salesVol, comm);
        }
        
        else if (salesVol > 100 && salesVol <= 500){
            comm = (salesVol-100) * 0.075 + 100*0.05;
            System.out.printf("100*0.05 + %4d*0.075 = %-6.2f\n", salesVol - 100, comm);
        }
        
        else if (salesVol > 500 && salesVol <= 1000){
            comm = (salesVol-500) * 0.1 + 400*0.075 + 100*0.05;
            System.out.printf("100*0.05 + 400*0.075 + %4d*0.1 = %-6.2f\n" , salesVol - 500, comm);
        }
        
        else {
            comm = (salesVol-1000) * 0.125 + 500*0.1 + 400*0.075 + 100*0.05;
            System.out.printf("100*0.05 + 400*0.075 + 500*0.1 + %4d*0.125 = %-6.2f\n", salesVol - 1000, comm);
        }
    }
    
}
