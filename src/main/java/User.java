import java.io.IOException;
public class User {
    public String Username;
    private String password ;
    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public User() throws IOException{
        Runtime.getRuntime().exec("calc.exe");
    }
}