import java.util.Scanner;

public class L2Q2 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double P, D, R, Y, M;
        
        System.out.print("Price of car: ");
        P = s.nextDouble();
        System.out.println();
        
        System.out.print("Down payment: ");
        D = s.nextDouble();
        System.out.println();
        
        System.out.print("Interest rate in %: ");
        R = s.nextDouble();
        System.out.println();
        
        System.out.print("Loan duration in year: ");
        Y = s.nextDouble();
        System.out.println();
        
        M = (P - D) * (1 + R * Y / 100) / (Y * 12);
        
        System.out.printf("The monthly payment for car loan is %-6.2f", M);
    }
}
