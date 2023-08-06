
public class Employee extends User {
    
   private int date_of_joining;
   private float salary;
   private int  date_of_birth;


    
    public Employee(String name, int User_ID, String User_Password, String Email) {
        super(name, User_ID, User_Password, Email);
    }
    
}
