import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L7Q6 {

    public static void main(String[] args) {
        String[] prodID = new String[7];
        String[] prodName = new String[7];
        String[] prodID_ord = new String[5];
        int[] qty = new int[5];
        double[] prodPrice = new double[10];
        int i=0, j=0;
        
        try{
            Scanner sp = new Scanner(new FileInputStream("product.txt"));
            Scanner so = new Scanner(new FileInputStream("order.txt"));
            
            while(sp.hasNextLine()){
                String[] prod = sp.nextLine().split(",");
                prodID[i] = prod[0];
                prodName[i] = prod[1];
                prodPrice[i] = Double.parseDouble(prod[2]);
                i++;
            }
            
            while(so.hasNextLine()){
                String[] ord = so.nextLine().split(",");
                prodID_ord[j] = ord[1];
                qty[j] = Integer.parseInt(ord[2]);
                j++;
            }
            
            System.out.print("ProductID       ");
            System.out.print("ProductName       ");
            System.out.print("Quantity       ");
            System.out.print("PricePerUnit       ");
            System.out.print("Total\n");
            
            for(j=0 ; j<prodID_ord.length ; j++){
                for(i=0 ; i<prodID.length ; i++){
                    if(prodID_ord[j].equals(prodID[i])){
                        System.out.printf("%-9s", prodID[i]);
                        System.out.printf("%-27s", prodName[i]);
                        System.out.printf("%-2d", qty[j]);
                        System.out.printf("%21.2f", prodPrice[i]);
                        System.out.printf("%14.2f\n", qty[j]*prodPrice[i]);
                        break;
                    }
                }
            }
            
            sp.close();
            so.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }    
    }
}
