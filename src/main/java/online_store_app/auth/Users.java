package online_store_app.auth;

public class Users {

    private int IDUser;
    private String email;
    private String password;
  //  private ESex ESex;

    public Users() {
    }
    public Users(String email, String password) {
        this();
        this.email = email;
        this.password = password;
    }

    public int getIDUser() {
        return IDUser;
    }
    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "IDUser=" + IDUser +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
