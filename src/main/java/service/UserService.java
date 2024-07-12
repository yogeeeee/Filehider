package service;

import dao.UserDAO;
import Model.User;

import java.sql.SQLException;

public class UserService {
    public static Integer saveUser(User user){
        try{
            if(UserDAO.isExists(user.getEmail())){
                return 0;
            }else{
                return UserDAO.saveUser(user);
            }
        }catch (SQLException ex){
            ex.printStackTrace();//throw new RuntimeException(ex);
        }
        return null;
    }
}
