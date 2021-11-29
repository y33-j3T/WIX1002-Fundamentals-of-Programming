import java.util.Scanner;

public class Fraction {
   private int numerator;
   private int denominator;
   Scanner s = new Scanner(System.in);
   
   public Fraction(){
       System.out.print("Numerator: ");
       numerator = s.nextInt();
       System.out.print("Denominator: ");
       denominator = s.nextInt();
   }
   
   public void setNumerator(int num){
       this.numerator = num;
   }
   
   public void setDenominator(int num){
       this.denominator = num;
   }
   
   public int getNumerator(){
       return numerator;
   }
   
   public int getDenominator(){
       return denominator;
   }
   
   public int gcd(int a, int b){
       if(a == b)
           return a;
       else if(a > b){
           if(a%b==0)
               return b;
           else
               return gcd(b, a%b);
       } else {
           if(b%a==0)
               return a;
           else
               return gcd(a, b%a);
       }
   }
   
   public void reduced(){
       int div = gcd(numerator, denominator);
       System.out.println("Reduced fraction: " + numerator/div + "/" + denominator/div);
   }
}
