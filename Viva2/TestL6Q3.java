import java.util.Scanner;

public class TestL6Q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first 10 bits: ");
        String list1 = s.next();
        byte[] arr1 = new byte[10];
        for(int i=0 ; i<arr1.length ; i++){
            if(list1.charAt(i)=='1'){
                arr1[i]=1;
            } else {
                arr1[i]=0;
            }
        }
        
        System.out.print("Enter second 10 bits: ");
        String list2 = s.next();
        byte[] arr2 = new byte[10];
        for(int i=0 ; i<arr1.length ; i++){
            if(list2.charAt(i)=='1'){
                arr2[i]=1;
            } else {
                arr2[i]=0;
            }
        }
        
        int decResult=0;
        for(int i=0 ; i<XOR(arr1, arr2).length ; i++){
            decResult += (XOR(arr1, arr2)[i]*Math.pow(2, 9-i));
        }
        System.out.println("XOR result: " + decResult);
        
    }
    
    public static byte[] XOR(byte[] arr1, byte[] arr2) {
        byte[] result = new byte[10];
        for(int i=0 ; i<result.length ; i++){
            if(arr1[i] != arr2[i]){
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }
        
        return result;
    }
}
