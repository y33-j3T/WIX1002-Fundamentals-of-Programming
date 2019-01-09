package onerandnum;

import java.util.Random;

public class OneRandNum {

    public static void main(String[] args) {
        int MAX = 10000;
        int total = 0;
        Random r = new Random();
        
        int num = r.nextInt(MAX);
        
        System.out.println("The number is " + num);
        
        do{
            total += num%10;
            num /= 10;
        }
        
        while (num >0);
        
        System.out.println("The sum of all the digits in the number is " + total);
        
        
        
        
    }
    
}
