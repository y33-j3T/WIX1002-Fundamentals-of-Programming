import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L7Q4 {

    public static void main(String[] args) {
        int char_num=0, word_num=0, line_num=0;
        
        try{
            Scanner s = new Scanner(new FileInputStream("C:\\users\\Yee Jet Tan\\desktop\\test_text.txt"));
            
            while(s.hasNextLine()){
                String line = s.nextLine();
                line_num++;
                char_num += line.length();
                word_num += line.split(" ").length;
            }            
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        
        System.out.println("Number of characters: " + char_num);
        System.out.println("Number of words: " + word_num);
        System.out.println("Number of lines: " + line_num);
    }    
}
