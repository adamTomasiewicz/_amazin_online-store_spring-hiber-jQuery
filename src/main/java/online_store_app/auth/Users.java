package online_store_app.auth;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name="email", nullable = false, length = 50)
    private String email;
    @Column(name="password", nullable = false, unique = true, length = 50)
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
        return idUser;
    }
    public void setIDUser(int IDUser) {
        this.idUser = IDUser;
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
                "IDUser=" + idUser +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
