/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q4;

/**
 *
 * @author Yee Jet Tan
 */
public class L6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("GCD(24, 8): " + gcd(24, 8));
        System.out.println("GCD(200, 625): " + gcd(200, 625));
    }
    
    public static int gcd(int a, int b) {
        if(a>b){
            if(a%b==0){
                return b;
            } else {
                return gcd(b, a%b);
            }
        } else {
            if(b%a==0){
                return a;
            } else {
                return gcd(a, b%a);
            }
        }
    }
    
}
