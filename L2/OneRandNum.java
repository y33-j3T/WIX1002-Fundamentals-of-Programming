/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onerandnum;

import java.util.Random;

/**
 *
 * @author wid180503
 */
public class OneRandNum {

    /**
     * @param args the command line arguments
     */
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
