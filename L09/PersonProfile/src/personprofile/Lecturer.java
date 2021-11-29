package personprofile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lecturer extends PersonProfile{
    protected ArrayList<String> courseCode = new ArrayList<>();
    protected ArrayList<String> courseName = new ArrayList<>();
    protected ArrayList<String> session = new ArrayList<>();
    protected ArrayList<String> semester = new ArrayList<>();
    protected ArrayList<Double> originalCr = new ArrayList<>();
    protected ArrayList<Double> updatedCr = new ArrayList<>();
    protected ArrayList<Integer> numOfStudents = new ArrayList<>();
    
    public Lecturer(String name, String gender, String dateOfBirth){
        super(name, gender, dateOfBirth);
        
        try{
            Scanner s = new Scanner(new FileInputStream(new File("lecturer.txt")));
            
            while(s.hasNextLine()){
                courseCode.add(s.nextLine());
                courseName.add(s.nextLine());
                session.add(s.nextLine());
                semester.add(s.nextLine());
                
                Double originalCrCopy = Double.parseDouble(s.nextLine());
                originalCr.add(originalCrCopy);
                
                Integer numOfStudentsCopy = Integer.parseInt(s.nextLine());
                numOfStudents.add(numOfStudentsCopy);
                
                updatedCr.add(computeUpdatedCr(originalCrCopy, numOfStudentsCopy));
                
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
    
    public Double computeUpdatedCr(Double originalCr, Integer numOfStudents){
        if(numOfStudents>=150)
            return originalCr*3;
        else if(numOfStudents<150 && numOfStudents>=100)
            return originalCr*2;
        else if(numOfStudents<100 && numOfStudents>=50)
            return originalCr*1.5;
        else 
            return originalCr;
    }
    
    public void display(){
        System.out.println(super.toString());
        System.out.println();
        for (int i=0 ; i<courseCode.size() ; i++){
            System.out.println("Course code: " + courseCode.get(i));
            System.out.println("Course name: " + courseName.get(i));
            System.out.println("Session: " + session.get(i));
            System.out.println("Semester: " + semester.get(i));
            System.out.println("Original credit hours: " + originalCr.get(i));
            System.out.println("Updated credit hours: " + updatedCr.get(i));
            System.out.println("Number of students: " + numOfStudents.get(i));
            System.out.println();
        }
    }
}
