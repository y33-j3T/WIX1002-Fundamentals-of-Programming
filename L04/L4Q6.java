import java.util.Random;

public class L4Q6 {

    public static void main(String[] args) {
        Random r = new Random();
        int num, num_digit = 1;
        
        do {
            num = r.nextInt();
        } while (num < 0);
        
        if (num / 10 != 0){
            do {
                num /= 10;
                num_digit += 1;
            } while (num / 10 != 0);
        } else {
            num_digit = 1;
        }
        
        System.out.println("The integer is " + num);
        System.out.println("The number of digits in the integer is " + num_digit);           
    }
}
