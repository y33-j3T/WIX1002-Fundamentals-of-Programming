package personprofile;

public class PersonProfile {
    protected String name, gender, dateOfBirth;

    public PersonProfile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
    
    public String toString(){
        return "Name: " + name +
               "\nGender: " + gender +
               "\nDate of Birth: " + dateOfBirth;
    }

    public static void main(String[] args) {
        Student a = new Student("Choon Eung", "Female", "060699", "Choon Eung Profile");
        a.display();
        
        Lecturer b = new Lecturer("Alvin Wong", "Male", "070799");
        b.display();
        
    }
    
}
