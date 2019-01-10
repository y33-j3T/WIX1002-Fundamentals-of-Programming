import java.util.Scanner;
import java.util.Random;

public class L4Q5 {

    public static void main(String[] args) {
        int p1_total = 0, p1_score, p2_total = 0, p2_score;
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int MAX = 6;
        
        do{
            do{
                p1_score = r.nextInt(MAX) + 1;
                p1_total += p1_score;
                System.out.println("Player 1 scores " + p1_score);
            } while (p1_score == 6);
            
            if (p1_total <= 100) {
                do {
                    p2_score = r.nextInt(MAX) + 1;
                    p2_total += p2_score;
                    System.out.println("Player 2 scores " + p2_score);
                } while (p2_score == 6);
            }
        } while (p1_total <= 100 && p2_total <= 100);
        
        System.out.println();
        System.out.println("Player 1: " + p1_total);
        System.out.println("Player 2: " + p2_total);
        System.out.println();
        
        if (p1_total > 100){
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
    
}
