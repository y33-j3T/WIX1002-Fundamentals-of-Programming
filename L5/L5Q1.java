/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l5q1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Yee Jet Tan
 */
public class L5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please enter the number of students: ");
        int N = s.nextInt();
        
        int [] list_of_score = new int[N];
        
        for(int i=0 ; i<N ; i++){
            list_of_score[i] = r.nextInt(101);
        }
        
        //
        for (int score : list_of_score){
            System.out.println(score);
        }
        //
        
        double score_avg, score_hi=list_of_score[0], score_lo=list_of_score[0], sum_of_score=0;
        
        //average score
        for(int i=0 ; i<N ; i++){
            sum_of_score += list_of_score[i];
        }
        score_avg = sum_of_score/N;
        
        //highest & lowest score
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
