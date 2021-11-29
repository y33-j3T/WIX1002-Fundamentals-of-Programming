import java.util.Random;

public class L5Q2 {

    public static void main(String[] args) {
        Random r = new Random();
        boolean duplicate = false;
        int[] int_list = new int[10];
        int i = 0;
        
        do{
            do{
                int_list[i]=r.nextInt(21);

                for(int j=i-1 ; j>=0 ;j--){
                    if(int_list[i]==int_list[j]){
                        duplicate = true;
                        break;
                    } else {
                        duplicate = false;
                    }
                } 
                
            }while(duplicate);
            
            i++;
            
        } while (i<10);
            
        for (int num : int_list){
            System.out.println(num);
        }
    }
}
