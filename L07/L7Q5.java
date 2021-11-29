import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class L7Q5 {

    public static void main(String[] args) {
        
        try{
            ObjectInputStream s = new ObjectInputStream(new FileInputStream("C:\\users\\Yee Jet Tan\\desktop\\person.dat"));
            int num = s.readInt();
            String[] name = new String[num];
            int[] age = new int[num];
            char[] gender = new char[num];
            
            for(int i=0 ; i<num ; i++){
                name[i] = s.readUTF();
                age[i] = s.readInt();
                gender[i] = s.readChar();
            }
            
            for(int i=0 ; i<num-1 ; i++){
                for(int j=0 ; j<num-1-i ; j++){
                    if(name[j].compareToIgnoreCase(name[j+1])>0){
                        String temp = name[j];
                        name[j] = name[j+1];
                        name[j+1] = temp;
                        
                        int temp1 = age[j];
                        age[j] = age[j+1];
                        age[j+1] = temp1;
                        
                        char temp2 = gender[j];
                        gender[j] = gender[j+1];
                        gender[j+1] = temp2;
                    }
                }
            }
            
            for(int i=0 ; i<num ; i++){
                System.out.println("Name: " + name[i]);
                System.out.println("Age: " + age[i]);
                System.out.print("Gender: ");
                switch(gender[i]){
                    case 'M':
                        System.out.println("Male\n");
                        break;
                    case 'F':
                        System.out.println("Female\n");
                        break;
                }
            }
            
            s.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Problem reading file");
        }
    }
}
