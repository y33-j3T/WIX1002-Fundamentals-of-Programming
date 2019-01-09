package energyheatwater;

import java.util.Scanner;

public class EnergyHeatWater {

    public static void main(String[] args) {
        double Q, tempI, tempF, M;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Weight of water in kg: ");
        M = s.nextDouble();
        System.out.print("Initial temperature in celsius: ");
        tempI = s.nextDouble();
        System.out.print("Final temperature in celsius: ");
        tempF = s.nextDouble();
        
        Q = M * (tempF - tempI) * 4184;
        System.out.printf("The energy needed to heat water is %6.6f joules\n", Q);
        
    }
    
}
