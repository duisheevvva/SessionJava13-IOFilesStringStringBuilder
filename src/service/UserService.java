package service;

import model.User;

import java.util.List;

public interface UserService {
    String register (List<User>users);
    String login (List<User> users,String email,String password);
    User getUserByEmail(List<User> users,String email);
    List<User> getAllUsers(List<User> users);

}
