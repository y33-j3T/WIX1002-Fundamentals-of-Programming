package l6q2;

public class L6Q2 {

    
    public static void main(String[] args) {
        multiPrint(2, ' ');
        multiPrint(1, '*');
        System.out.println();
        multiPrint(1, ' ');
        multiPrint(3, '*');
        System.out.println();
        multiPrint(5, '*');
        System.out.println();
    }
    
    public static void multiPrint(int n, char c) {
        for(int i=0 ; i<n ; i++)
            System.out.print(c);
    }
    
}
