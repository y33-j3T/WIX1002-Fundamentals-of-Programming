/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q3;

import java.util.Scanner;

/**
 *
 * @author wid180503
 */
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input sales volume: ");
        int salesVol = s.nextInt();
        
        double commission;
        
        if (salesVol <= 100){
            commission = salesVol*0.05;
        }
        
        else if (salesVol > 100 && salesVol <= 500){
            commission = salesVol*0.075;
        }
        
        else if (salesVol > 500 && salesVol <= 1000){
            commission = salesVol*0.1;
        }
        
        else {
            commission = salesVol*0.125;
        }
        
        System.out.printf("Commission: %.2f\n", commission);
    }
    
}
