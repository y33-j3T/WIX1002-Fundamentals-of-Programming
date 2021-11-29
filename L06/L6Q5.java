import java.util.Random;
import java.util.Scanner;

public class L6Q5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int score = 0;
        
        while (true){
            int a = r.nextInt(13);
            int b = r.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.print(a + " x " + b + " = ");
            int c = s.nextInt();
            
            if(c<0){
                break;
            }
            
            if(multCheck(a, b, c)){
                score++;
            }
        }        
        System.out.println("Your score is " + score);
    }
    
    public static boolean multCheck(int a, int b, int c) {
        boolean valid = false;
        if (c == a*b){
            valid = true;
        }        
        return valid;
    }    
}
