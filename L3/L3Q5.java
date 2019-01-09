package l3q5;

import java.util.Scanner;

public class L3Q5 {

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
        } else {
            x = ((e*d)-(b*f))/((a*d)-(b*c));
            y = ((a*f)-(e*c))/((a*d)-(b*c));
            System.out.printf("x: %.2f\ny: %.2f\n",x, y);  
        }
    }
}
