/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vival3q1;

import java.util.Scanner;

/**
 *
 * @author Yee Jet Tan
 */
public class VivaL3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, n3, w1 = 0, w2 = 0, ans = 0, temp = 0;
        char opr1, opr2;
        int mul = 5, div = 4, mod = 3, add = 2, sub = 1;
        
        System.out.print("Enter three integer number: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        System.out.print("Enter two operands: ");
        opr1 = in.next().charAt(0);
        opr2 = in.next().charAt(0);
        
        switch (opr1) {
            case '*':
                w1 = 5;
                break;
                
            case '/':
                w1 = 4;
                break;
                
            case '%':
                w1 = 3;
                break;
                
            case '+':
                w1 = 2;
                break;
                
            case '-':
                w1 = 1;
                break;
        }
        
        switch (opr2) {
            case '*':
                w2 = 5;
                break;
                
            case '/':
                w2 = 4;
                break;
                
            case '%':
                w2 = 3;
                break;
                
            case '+':
                w2 = 2;
                break;
                
            case '-':
                w2 = 1;
                break;
        }
        
        if (w1 == w2){
            switch (opr1) {
                case '*':
                    ans = n1*n2*n3;
                    break;

                case '/':
                    ans = n1/n2/n3;
                    break;

                case '%':
                    ans = n1%n2%n3;
                    break;

                case '+':
                    ans = n1+n2+n3;
                    break;

                case '-':
                    ans = n1-n2-n3;
                    break;
            }
        }
        
        else {
            if(w1 > w2){
                switch (opr1) {
                    case '*':
                        temp = n1*n2;
                        break;

                    case '/':
                        temp = n1/n2;
                        break;

                    case '%':
                        temp = n1%n2;
                        break;

                    case '+':
                        temp = n1+n2;
                        break;

                    case '-':
                        temp = n1-n2;
                        break;
                }
                
                switch (opr2) {
                    case '/':
                        ans = temp/n3;
                        break;

                    case '%':
                        ans = temp%n3;
                        break;

                    case '+':
                        ans = temp+n3;
                        break;

                    case '-':
                        ans = temp-n3;
                        break;
                }
                
                
            }
            
            else if (w1 < w2){
                switch (opr2) {
                    case '*':
                        temp = n2*n3;
                        break;

                    case '/':
                        temp = n2/n3;
                        break;

                    case '%':
                        temp = n2%n3;
                        break;

                    case '+':
                        temp = n2+n3;
                        break;

                    case '-':
                        temp = n2-n3;
                        break;
                }
                
                switch (opr1) {
                    case '/':
                        ans = n1/temp;
                        break;

                    case '%':
                        ans = n1%temp;
                        break;

                    case '+':
                        ans = n1+temp;
                        break;

                    case '-':
                        ans = n1-temp;
                        break;
                }
                
            }
        
        System.out.println(n1 + " " + opr1 + " " + n2 + " " + opr2 + " " + n3 + " = " + ans);
        
        }
    }
    
}
