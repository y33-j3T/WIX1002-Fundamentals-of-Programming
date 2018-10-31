import java.util.Scanner;

public class L4Q3 {

    public static void main(String[] args) {
        double avg, std;
        int max = 0, min = 0, N = 0,  score = 0, sum = 0, sum_sq = 0, temp;
        Scanner s = new Scanner(System.in);
        
        do{
            System.out.print("Enter a score (negative score to quit): ");
            score = s.nextInt();
            
            if (score >= 0){
                
                N++;
                
                if (N == 1){
                    max = score;
                    min = score;
                }
                
                temp = score;
                sum += score;
                sum_sq += score*score;

                if (temp < min){
                    min = temp;
                }

                else if (temp > max) {
                    max = temp;
                }
            }
        }
        while(score >= 0);
            
        if (score == -1 && N > 0){
            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            
            avg = sum / N;
            std = Math.sqrt((sum_sq-((sum*sum)/N))/(N - 1));
            
            System.out.printf("Average Score: %-6.2f\n", avg);
            System.out.printf("Standard Deviation: %-6.2f\n", std);
        }
        
    }
    
}
