package gradedactivity;

import java.util.Scanner;

public class GradedActivity {
    
    protected int score;
    
    public GradedActivity(){
        
    }
    
    public GradedActivity(int score){
        this.score = score;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public int getScore(){
        return score;
    }
    
    public String getGrade(){
        if(this.score>=90)
            return "A";
        else if(this.score>=80)
            return "B";
        else if(this.score>=70)
            return "C";
        else if(this.score>=60)
            return "D";
        else if(this.score<80)
            return "F";
        return null;
    }
    
    public String toString(){
        return "Numeric score: " + this.getScore() +
                "\nGrade: " + this.getGrade();
    }
}
