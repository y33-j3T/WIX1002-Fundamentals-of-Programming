package l3q1;

import java.util.Scanner;

public class L3Q1 {

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
