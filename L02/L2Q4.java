import java.util.Scanner;

public class L2Q4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, hr, min, sec;
        
        System.out.print("Enter the number of seconds: ");
        num = s.nextInt();
        
        hr = num/3600;
        min = (num/60) - (hr*60);
        sec = num - hr*3600 - min*60;
            
        System.out.print(num + " seconds is " + hr + " hours, " + min + " minutes and " + sec + " seconds\n");
    }
}
