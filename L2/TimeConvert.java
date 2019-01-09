package timeconvert;

import java.util.Scanner;

public class TimeConvert {

    public static void main(String[] args) {
        int num, hr, min, sec;
        System.out.print("Enter the number of seconds: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        
        hr = num/3600;
        min = (num/60) - (hr*60);
        sec = num - hr*3600 - min*60;
            
        System.out.print(num + " seconds is " + hr + " hours, " + min + " minutes and " + sec + " seconds\n");
    }
    
}
