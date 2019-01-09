package l3q6;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class L3Q6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = s.nextInt();
        System.out.print("Enter coordinate x: ");
        int x = s.nextInt();
        System.out.print("Enter coordinate y: ");
        int y = s.nextInt();
        
        if (sqrt((x*x) + (y*y)) <= r){
            System.out.println("Inside of circle");
        } else {
            System.out.println("Outside of circle");
        }
    }
}
