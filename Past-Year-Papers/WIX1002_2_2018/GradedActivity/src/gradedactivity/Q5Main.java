package gradedactivity;

import java.util.Scanner;

public class Q5Main {

    public static void main(String[] args) {
        int grammar, spelling, length, content;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        grammar = s.nextInt();        
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        spelling = s.nextInt();        
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        length = s.nextInt();        
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        content = s.nextInt();        
        System.out.println();
        
        Essay a = new Essay(grammar, spelling, length, content);
        
        System.out.println(a.toString());
    }
    
}
