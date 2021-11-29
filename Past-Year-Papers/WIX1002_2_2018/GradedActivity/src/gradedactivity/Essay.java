package gradedactivity;

import java.util.Scanner;

public class Essay extends GradedActivity {
    
    protected int grammar, spelling, length, content;
    
    public Essay(int grammar, int spelling, int length, int content){
       this.grammar = grammar;
       this.spelling = spelling;
       this.length = length;
       this.content = content;
       
       score = grammar + spelling + length + content;
    }
    
//    public void getUserInput(){
//         Scanner s = new Scanner(System.in);
//        
//        do{
//            System.out.print("Enter grammar score (max 30): ");
//            grammar = s.nextInt();
//        } while (grammar > 30 || grammar < 0);
//        do{
//            System.out.print("Enter spelling score (max 20): ");
//            spelling = s.nextInt();
//        } while (spelling > 20 || spelling < 0);
//        do{
//            System.out.print("Enter length score (max 20): ");
//            length = s.nextInt();
//        } while (length > 20 || length < 0);
//        do{
//            System.out.print("Enter content score (max 30): ");
//            content = s.nextInt();
//        } while (content > 30 || content < 0);
//        
//        score = grammar + spelling + length + content;
//    }
    
    public String toString(){
        return "Essay score: " + 
                "\nGrammar: " + grammar +
                "\nSpelling: " + spelling + 
                "\nLength: " + length +
                "\nContent: " + content +
               "\n\nTotal score: " + this.getScore() +
                "\nEssay grade: " + this.getGrade();
        
    }
}
