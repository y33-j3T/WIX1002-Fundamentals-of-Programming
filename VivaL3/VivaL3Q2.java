/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vival3q2;

import java.util.Random;

/**
 *
 * @author Yee Jet Tan
 */
public class VivaL3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int randint = r.nextInt(1000);
        //System.out.println(randint);
        
        String[] ones = new String[20];
        String[] tens = new String[10];
        
        //0 - 9
        ones[0] = "zero";
        ones[1] = "one";
        ones[2] = "two";
        ones[3] = "three";
        ones[4] = "four";
        ones[5] = "five";
        ones[6] = "six";
        ones[7] = "seven";
        ones[8] = "eight";
        ones[9] = "nine";
        
        //10 - 19
        ones[10] = "ten";
        ones[11] = "eleven";
        ones[12] = "twelve";
        ones[13] = "thirteen";
        ones[14] = "fourteen";
        ones[15] = "fifteen";
        ones[16] = "sixteen";
        ones[17] = "seventeen";
        ones[18] = "eighteen";
        ones[19] = "ninteen";
        
        //20, 30, 40...90
        tens[0] = "";
        tens[1] = "";
        tens[2] = "twenty";
        tens[3] = "thirty";
        tens[4] = "fourty";
        tens[5] = "fifty";
        tens[6] = "sixty";
        tens[7] = "seventy";
        tens[8] = "eighty";
        tens[9] = "ninety";
        
        //for loop checking
        //for ( int randint = 0 ; randint < 1000 ; randint++){
        
        //---------------------------------------------------------------------
        //0 - 9
        if (randint/10 == 0){
            System.out.println(randint + " is " + ones[randint%10]);
        }
        
        //10 - 99
        else if (randint/100 == 0){
            //10 - 19
            if(randint%100 >= 10 && randint%100 <= 19){
                System.out.println(randint + " is " + ones[randint%100]);
            }
            
            //20, 30, 40... 90
            else if(randint%10 == 0 && randint%100 >= 20) {
                System.out.println(randint + " is " + tens[randint/10]);
            }
            
            //21 - 29, 31 - 39, 41 - 49... 91 - 99
            else {
                System.out.println(randint + " is " + tens[randint/10] + "-" + ones[randint%10]);
            }
        }
        
        //100 - 999
        else if (randint/1000 == 0){
            
            //100, 200, 300... 900
            if (randint%100 == 0){
                System.out.println(randint + " is " + ones[randint/100] + " hundred ");
            }
            
            //101, 102, 103... 119
            else if (randint%100 >= 1 && randint%100 <= 19){
                System.out.println(randint + " is " + ones[randint/100] + " hundred and " + ones[randint%100]);
            }
            
            //120, 130, 140... 990
            else if (randint%10 == 0 && randint%100 >= 20){
                System.out.println(randint + " is " + ones[randint/100] + " hundred and " + tens[(randint/10)%10]);
            }
            
            //121 - 129, 131 - 139, 141 - 149... 991 - 999
            else {
                System.out.println(randint + " is " + ones[randint/100] + " hundred and " + tens[(randint/10)%10] + "-" + ones[randint%10]);
            }
        }
        
        //for loop checking ends
        //}
    }
    
}
