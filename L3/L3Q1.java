/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q1;

import java.util.Scanner;

/**
 *
 * @author wid180503
 */
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c;
        System.out.print("Enter the operand: ");
        String z = s.next();
        char i = z.charAt(0);
        switch (i){
            case '+':
                c = a + b;
                System.out.println(a + " + " + b + " = " + c);
                break;
            
            case '-':
                c = a - b;
                System.out.println(a + " - " + b + " = " + c);
                break;
            
            case '*':
                c = a * b;
                System.out.println(a + " * " + b + " = " + c);
                break;
                
            case '/':
                c = a / b;
                System.out.println(a + " / " + b + " = " + c);
                break;
                
            case '%':
                c = a % b;
                System.out.println(a + " % " + b + " = " + c);
                break;
        }
    }
    
}
