package degreetocelsius;

import java.util.Scanner;

public class DegreeToCelsius {

    public static void main(String[] args) {
        double fah, cel;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please input the temperature in degree Fahrenheit: ");
        fah = s.nextDouble();
        cel = (fah - 32)/1.8;
        System.out.printf("The temperature in degree Celsius is %-5.2f", cel );
    }
    
}