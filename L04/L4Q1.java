import java.util.Scanner;

public class L4Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int input = s.nextInt();
        System.out.println();
        
        System.out.print("The factors are: 1");
        for (int i = 2; i <= input; i++){
            if (input % i == 0){
                System.out.print(", " + i);
            }            
        }
        System.out.println();
    }
}
