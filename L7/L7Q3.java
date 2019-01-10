import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L7Q3 {

    public static void main(String[] args) {
        try{
            PrintWriter p = new PrintWriter(new FileOutputStream("C:\\users\\Yee Jet Tan\\desktop\\reverse.txt"));
            Scanner s = new Scanner(new FileInputStream("C:\\users\\Yee Jet Tan\\desktop\\Integer.txt"));
            
            while(s.hasNextLine()){
                String str = s.nextLine();
                for (int i=str.length()-1 ; i>=0 ; i--){
                    p.print(str.charAt(i));
                }
                p.println();
            }
            
            s.close();
            p.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("File output error");
        }
    }
}
