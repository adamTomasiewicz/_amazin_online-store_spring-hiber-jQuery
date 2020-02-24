package online_store_app.bin;
import online_store_app.auth.Users;

import java.util.List;

public interface IUserAuthService {

    public void saveUser(Users user);
    public void updateUser(Users user);
    public void deleteUser(Users user);
    public Users getUserByID(Integer id);
    public List<Users> getAllUsers();
}
