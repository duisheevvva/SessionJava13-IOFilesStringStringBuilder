package service.serviceImpl;

import enums.Gender;
import model.GenerateId;
import model.User;
import service.UserService;

import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    @Override
    public String register(List<User> users) {
        User user = new User();
        user.setId(GenerateId.genUserId());
        System.out.println("Write full name:");
        user.setFullName(new Scanner(System.in).nextLine());
        System.out.println("Write email: ");
        user.setEmail(new Scanner(System.in).nextLine());
        System.out.println("Write password: ");
        user.setPassword(new Scanner(System.in).nextLine());

        System.out.println("Choose gender (MALE/FEMALE):");
        String genderInput = new Scanner(System.in).nextLine().toUpperCase();
        if (genderInput.equals("MALE")) {
            user.setGender(Gender.MALE);
        } else if (genderInput.equals("FEMALE")) {
          user.setGender(Gender.FEMALE);
        }
        users.add(user);
        return "Successfully register";
    }

    @Override
    public String login(List<User> users, String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return "Login successfully";
            }
        }
        return "Login failed: invalid email or password";
    }

    @Override
    public User getUserByEmail(List<User> users, String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAllUsers(List<User> users) {
        return users;
    }
}
