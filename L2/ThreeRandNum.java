package threerandnum;

import java.util.Random;

public class ThreeRandNum {

    public static void main(String[] args) {
        Random r = new Random();
        double total = 0;
        double avg;
        int MAX = 40;
        double [] list = new double [3];
        
        System.out.println("The numbers are");
        for (int i = 0 ; i < 3 ; i++){
            list[i] = r.nextInt(MAX) + 10;
            System.out.printf("%-6.2f\n", list[i]);
        }
        
        System.out.println();
        
        for (int i = 0 ; i < 3 ; i++){
            total += list[i];
        }
        
        System.out.printf("The sum of numbers is %-6.2f\n\n", total);
        
        avg = total/3;
        System.out.printf("The average of numbers is %-6.2f\n", avg);
    }
}
