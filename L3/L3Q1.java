import java.util.Scanner;

public class L3Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        String z;
        
        System.out.print("Enter two integer number: ");
        a = s.nextInt();
        b = s.nextInt();
        
        System.out.print("Enter the operand: ");
        z = s.next();
        
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
