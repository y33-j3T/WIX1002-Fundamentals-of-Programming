package l8q5;

import java.util.Random;

public class Game{
    public String name;
    public int score;
    
    public Game(String name){
        this.name = name;
        this.score = 0;
    }
    
    public void move(){
        Random r = new Random();
        int rolledNum = r.nextInt(6) + 1;
        System.out.println(this.name + " rolled " + rolledNum);
        this.score += rolledNum;
    }
    
    public int getScore(){
        return this.score;
    }
    
    @Override
    public String toString(){
        return this.name + " :" + this.score;
    }
    
    
    public static void main(String[] args) {
        Game P1 = new Game("Player 1");
        Game P2 = new Game("Player 2");
        
        while(true){
            P1.move();
            P1.toString();
            if(P1.getScore()>=100){
                System.out.println("Player 1 wins!");
                break;
            }
            
            P2.move();
            P2.toString();
            if(P2.getScore()>=100){
                System.out.println("Player 2 wins!");
                break;
            }
        }
        System.out.println("Player 1 score: " + P1.getScore());
        System.out.println("Player 2 score: " + P2.getScore());
    }
    
}
