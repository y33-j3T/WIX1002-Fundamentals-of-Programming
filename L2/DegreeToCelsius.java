/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degreetocelsius;

import java.util.Scanner;

/**
 *
 * @author wid180503
 */
public class DegreeToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double fah, cel;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please input the temperature in degree Fahrenheit: ");
        fah = s.nextDouble();
        cel = (fah - 32)/1.8;
        System.out.printf("The temperature in degree Celsius is %-5.2f", cel );
    }
    
}