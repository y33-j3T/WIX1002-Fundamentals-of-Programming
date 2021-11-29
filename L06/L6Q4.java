public class L6Q4 {

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
