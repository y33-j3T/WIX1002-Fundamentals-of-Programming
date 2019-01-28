import java.util.Random;
import java.util.Scanner;

public class L5Q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        //get no. of employees
        int N;
        System.out.print("Please input the number of employee(s): ");
        N = s.nextInt();
        System.out.println();
        
        for (int i=0 ; i<N ; i++){
            int totalhrs=0, hrs;
            System.out.println("Employee " + (i+1));
            
            for (int j=0 ; j<7 ; j++){
                hrs = (r.nextInt(8)+1);
                totalhrs += hrs;
                System.out.println("Day " + (j+1) + ": " + hrs + " hours");
            }
            
            System.out.println("Total hours: " + totalhrs );
            System.out.println();
        }
    }
}
