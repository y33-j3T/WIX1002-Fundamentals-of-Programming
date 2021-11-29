import java.util.Random;

public class TestL3Q4 {

    public static void main(String[] args) {
        Random r = new Random();
        int MAX = 6;
        int p1 =0, p2 = 0, p11, p12, p21, p22;
        
        do{
            p11 = r.nextInt(MAX) + 1;
            p12 = r.nextInt(MAX) + 1;
            p1 += p11 + p12;
            System.out.println("Player 1 first roll: " + p11);
            System.out.println("Player 1 second roll: " + p12);
            System.out.println("Player 1: " + p1 + "\n");
            
        } while (p11 == 3 && p12 == 3);
        
        if (p11 % 2 != 0 && p12 % 2 != 0){
            p1 += 5;
            System.out.println("Player 1: +5 scores");
            System.out.println("Player 1: " + p1 + "\n");
        }
        else if (p11 == 6 && p12 == 6){
            p1 -= 5;
            System.out.println("Player 1: -5 scores");
            System.out.println("Player 1: " + p1 + "\n");
        }
        
        do{
            p21 = r.nextInt(MAX) + 1;
            p22 = r.nextInt(MAX) + 1;
            p2 += p11 + p12;
            System.out.println("Player 2 first roll: " + p21);
            System.out.println("Player 2 second roll: " + p22);
            System.out.println("Player 2: " + p2 + "\n");
            
        } while (p21 == 3 && p22 == 3);
        
        if (p21 % 2 != 0 && p22 % 2 != 0){
            p2 += 5;
            System.out.println("Player 2: +5 scores");
            System.out.println("Player 2: " + p2 + "\n");
        }
        else if (p21 == 6 && p22 == 6){
            p2 -= 5;
            System.out.println("Player 2: -5 scores");
            System.out.println("Player 2: " + p2 + "\n");
        }
        
        if(p1 > p2){
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }   
    }
}
