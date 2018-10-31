/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q8;

import java.util.Random;
/**
 *
 * @author Yee Jet Tan
 */
public class L4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(101);
        int count = 0;
        int num = 2;
        
        while(count != n){
            boolean prime = true;
            
            for (int i = 2 ; i <= Math.sqrt(num) ; i++){
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                count++;
                System.out.println(num);
            }
        
            num++;
        }       
    } 
}
