import java.util.Scanner;

public class L3Q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int salesVol;
        double commission;
        
        System.out.print("Input sales volume: ");
        salesVol = s.nextInt();
        
        if (salesVol <= 100){
            commission = salesVol*0.05;
        }
        else if (salesVol > 100 && salesVol <= 500){
            commission = salesVol*0.075;
        }
        else if (salesVol > 500 && salesVol <= 1000){
            commission = salesVol*0.1;
        } 
        else {
            commission = salesVol*0.125;
        }
        
        System.out.printf("Commission: %.2f\n", commission);
    }   
}
