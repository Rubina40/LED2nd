package led_project;

public class user {

    String username;
    String password;

    
 
    public user(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }
// creating getter and setter method
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}
