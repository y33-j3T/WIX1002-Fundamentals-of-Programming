import java.util.Random;
import java.util.Scanner;

public class L5Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Please enter the number of students: ");
        int N = s.nextInt();
        
        int [] list_of_score = new int[N];
        
        for(int i=0 ; i<N ; i++){
            list_of_score[i] = r.nextInt(101);
        }
        
        for (int score : list_of_score){
            System.out.println(score);
        }
        
        double score_avg, score_hi=list_of_score[0], score_lo=list_of_score[0], sum_of_score=0;
        
//        average score
        for(int i=0 ; i<N ; i++){
            sum_of_score += list_of_score[i];
        }
        score_avg = sum_of_score/N;
        
//        highest & lowest score
        for(int i=1 ; i<N ; i++){
            if(score_hi<list_of_score[i]){
                score_hi=list_of_score[i];
            }
            else if (score_lo>list_of_score[i]){
                score_lo=list_of_score[i];
            }
        }
        
        System.out.printf("The highest score is: %-6.2f \n", score_hi);
        System.out.printf("The lowest score is: %-6.2f \n" , score_lo);
        System.out.printf("The average score is: %-6.2f \n", score_avg);
    }
}
