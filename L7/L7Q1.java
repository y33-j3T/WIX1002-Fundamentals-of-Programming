package l7q1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class L7Q1 {

    public static void main(String[] args) {
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\users\\Yee Jet Tan\\Desktop\\courses.dat"));

            String[] course_code = new String[4];
            course_code[0] = "WXES1116";
            course_code[1] = "WXES1115";
            course_code[2] = "WXES1110";
            course_code[3] = "WXES1112";

            String[] course_name = new String[4];
            course_name[0] = "Programming I";
            course_name[1] = "Data Structure";
            course_name[2] = "Operating System";
            course_name[3] = "Computing Mathematics I";
            
            for(int i=0 ; i<course_code.length ; i++){
                out.writeUTF(course_code[i]);
                out.writeChar(':');
                out.writeUTF(course_name[i]);
                out.writeChar(',');
            }
            
            out.close();
            
        } catch (IOException e){
            System.out.println("File output error");
        } 
        
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\users\\Yee Jet Tan\\Desktop\\courses.dat"));
            Scanner s = new Scanner(System.in);
            
            System.out.print("Enter a course code: ");
            String courseCode = s.next();
            while(true){
                String stuff = in.readUTF();
                in.readChar();
                
                if(stuff.equalsIgnoreCase(courseCode)){
                    System.out.println(in.readUTF());
                    in.close();
                }
            }
        } catch (EOFException e){
            
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Error reading file");
        }
    }
}
