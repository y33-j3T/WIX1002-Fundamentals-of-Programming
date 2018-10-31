/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energyheatwater;

import java.util.Scanner;

/**
 *
 * @author wid180503
 */
public class EnergyHeatWater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Q, tempI, tempF, M;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Weight of water in kg: ");
        M = s.nextDouble();
        System.out.print("Initial temperature in celsius: ");
        tempI = s.nextDouble();
        System.out.print("Final temperature in celsius: ");
        tempF = s.nextDouble();
        
        Q = M * (tempF - tempI) * 4184;
        System.out.printf("The energy needed to heat water is %6.6f joules\n", Q);
        
    }
    
}
