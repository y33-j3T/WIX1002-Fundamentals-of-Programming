public class L6Q6 {

    public static void main(String[] args) {
        System.out.println("Palindromic prime");
        for(int arg=0, i=0; i<20 ; arg++){
            if(isPalinPrime(arg)){
                System.out.print(arg + " ");
                i++;
            }
        }
        
        System.out.println("\nEmirp");
        for(int arg=0, i=0; i<20 ; arg++){
            if(isEmirp(arg)){
                System.out.print(arg + " ");
                i++;
            }
        }
        
        System.out.println();
    }
    
    public static boolean isPalinPrime(int arg) {
        return isPalin(arg) && isPrime(arg);
    }
    
    public static boolean isPalin(int arg) {
        int argCopy = arg;
        int reverse = 0;

        while(arg > 0){
            reverse = reverse * 10 + arg % 10;
            arg /= 10;
        }

        return (argCopy == reverse);
    }
    
    public static boolean isPrime(int arg) {
        for (int i = 2 ; i <= Math.sqrt(arg) ; i++){
            if (arg % i == 0) 
                return false;
        }
        return true;
    }
    
    public static boolean isEmirp(int arg) {
        int reverse = 0;
        
        while(arg > 0){
            reverse = reverse * 10 + arg % 10;
            arg = arg / 10;
        }
        return isPrime(arg) && isPrime(reverse);
    }
}
