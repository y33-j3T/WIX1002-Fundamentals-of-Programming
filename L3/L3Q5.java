/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q5;

import java.util.Scanner;

/**
 *
 * @author wid180503
 */
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c, d, e, f, x, y;
        Scanner s = new Scanner(System.in);
        System.out.print("Input a: ");
        a = s.nextDouble();
        System.out.println();
        System.out.print("Input b: ");
        b = s.nextDouble();
        System.out.println();
        System.out.print("Input c: ");
        c = s.nextDouble();
        System.out.println();
        System.out.print("Input d: ");
        d = s.nextDouble();
        System.out.println();
        System.out.print("Input e: ");
        e = s.nextDouble();
        System.out.println();
        System.out.print("Input f: ");
        f = s.nextDouble();
        System.out.println();
        
        if (((a*d)-(b*c)) == 0){
            System.out.println("The equation has no solution");
        }
        
        else {
            x = ((e*d)-(b*f))/((a*d)-(b*c));
            y = ((a*f)-(e*c))/((a*d)-(b*c));
            System.out.printf("x: %.2f\ny: %.2f\n",x, y);
        
          
        }
    }
    
}
