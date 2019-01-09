package l4q7;

import java.util.Scanner;
public class L4Q7 {

    public static void main(String[] args) {
        //M = Monthly payment
        //P = Principal amount
        //i = yearly interest rate(%)
        //N = total number of months
        
        //C = Principal portion due
        //n = month under consideration
        //L = interest due
        //R = remaining principal balance due
        Scanner in = new Scanner(System.in);
        int N, n =1;
        double M, P, i, total_interest = 0;
        double C, L, R;
        System.out.print("Enter principal amount: ");
        P = in.nextDouble();
        
        System.out.print("Enter interest in %: ");
        i = in.nextDouble();
        
        System.out.print("Enter total number of month(s): ");
        N = in.nextInt();
        
        M = ( (P * i / (12 * 100)) / (1 - Math.pow((1 + i / (12 * 100)),(-N))) );
        /*
        C = M * Math.pow((1 + i / (12*100)),(-(1 + N - n)));
        System.out.println(C);
        
        L = M - C;
        System.out.println(L);
        
        R = (L / (i / (12 * 100))) - C;
        System.out.println(R);
        */
        //
        System.out.println("Month    Monthly Payment    Principal    Interest    Unpaid Balance    Total Interest");
        for (n = 1 ; n <= N ; n++){
            System.out.printf("%-5d", n);
            
            System.out.printf("%19.2f", M);
            
            C = M * Math.pow((1 + i / (12*100)),(-(1 + N - n)));
            System.out.printf("%13.2f", C);
            
            L = M - C;
            System.out.printf("%12.2f", L);
            
            R = (L / (i / (12 * 100))) - C;
            System.out.printf("%18.2f", R);
            
            total_interest += L;
            System.out.printf("%18.2f", total_interest);

            System.out.println();
        }
        //
    }
    
}
