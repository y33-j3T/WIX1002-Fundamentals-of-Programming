import java.util.Scanner;

public class L4Q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = s.nextInt();
        int total = 0;
        
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                total += j;
            }
        }
        
        System.out.println(total);
    }    
}
