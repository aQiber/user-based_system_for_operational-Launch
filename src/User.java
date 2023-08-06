
public class User {
   private String name;
   private int User_ID;
   private String User_Password;
   private String Email;

    public String getName() {
        return name;
    }

    public int getUser_ID() {
        return User_ID;
    }

    public String getUser_Password() {
        return User_Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser_ID(int User_ID) {
        this.User_ID = User_ID;
    }

    public void setUser_Password(String User_Password) {
        this.User_Password = User_Password;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public User(String name, int User_ID, String User_Password, String Email) {
        this.name = name;
        this.User_ID = User_ID;
        this.User_Password = User_Password;
        this.Email = Email;
    }
   
   
}
