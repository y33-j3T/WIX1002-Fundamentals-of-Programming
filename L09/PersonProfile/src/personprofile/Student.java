package personprofile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends PersonProfile{
    protected String filename;
    protected ArrayList<String> courseCode = new ArrayList<>();
    protected ArrayList<String> courseName = new ArrayList<>();
    protected ArrayList<String> session = new ArrayList<>();
    protected ArrayList<String> semester = new ArrayList<>();
    protected ArrayList<String> grade = new ArrayList<>();
    protected ArrayList<Integer> mark = new ArrayList<>();
    
    public Student(String name, String gender, String dateOfBirth, String filename){
        super(name, gender, dateOfBirth);
        this.filename = filename;
        
        try {
            Scanner s = new Scanner(new FileInputStream(new File("course.txt")));
            while(s.hasNextLine()){
                courseCode.add(s.nextLine());
                courseName.add(s.nextLine());
                session.add(s.nextLine());
                semester.add(s.nextLine());
                
                int markCopy = Integer.parseInt(s.nextLine());
                mark.add(markCopy);
                grade.add(getGrade(markCopy));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        
        
    }
    
    public String getGrade(int mark){
        if(mark>=85)
            return "A";
        else if(mark>=75)
            return "A-";
        else if(mark>=70)
            return "B+";
        else if(mark>=65)
            return "B";
        else if(mark>=60)
            return "B-";
        else if(mark>=55)
            return "C+";
        else if(mark>=50)
            return "C";
        else if(mark>=45)
            return "D";
        else if(mark>=35)
            return "E";
        else if(mark<35)
            return "F";
        return null;
    }
    
    public void display(){
        System.out.println(super.toString()+"\n");
        for(int i=0 ; i<courseCode.size() ; i++){
            System.out.println("Course code: " + courseCode.get(i));
            System.out.println("Course name: " + courseName.get(i));
            System.out.println("Session: " + session.get(i));
            System.out.println("Semester: " + semester.get(i));
            System.out.println("Grade: " + grade.get(i));
            System.out.println();
        }
    }
}
