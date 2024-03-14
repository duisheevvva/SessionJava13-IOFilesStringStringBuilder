import model.GenerateId;
import model.Post;
import model.User;
import service.PostService;
import service.UserService;
import service.serviceImpl.PostServiceImpl;
import service.serviceImpl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainInsta {
    public static void main(String[] args) {
        PostService postService = new PostServiceImpl();
        UserService userService = new UserServiceImpl();
        List<User> users = new ArrayList<>();
        List<Post> posts = new ArrayList<>();

        while (true) {
            System.out.println("""
                    Choice command: 
                    1.register
                    2.login
                    3.getUserByEmail
                    4.getAllUser                 
                    """);
            int command = new Scanner(System.in).nextInt();
            switch (command) {
                case 1 -> System.out.println(userService.register(users));
                case 2 -> {
                    System.out.println("Please write email and password: ");
                    userService.login(users, new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine());
                    while (true) {
                        System.out.println("""
                                Choice command: 
                                1.add post to user
                                2.delete post by id
                                3.get all post by user id       
                                """);
                        int action = new Scanner(System.in).nextInt();
                        switch (action) {
                            case 1 -> {
                                Post post = new Post();
                                post.setId(GenerateId.genPostId());
                                System.out.println("Add image:");
                                post.setImageUrl(new Scanner(System.in).nextLine());
                                System.out.println("Write description:");
                                post.setDescription(new Scanner(System.in).nextLine());
                                System.out.println(postService.addPostToUser(posts, post));
                            }
                            case 2 -> {
                                System.out.println("Please write id :");
                                System.out.println(postService.deletePostById(posts, new Scanner(System.in).nextLong()));
                            }
                            case 3-> {
                                System.out.println("Please write user id");
                                System.out.println(postService.getAllPostByUserId(users, new Scanner(System.in).nextLong()));
                            }
                        }
                    }
                }
                case 3 -> System.out.println(userService.getUserByEmail(users, new Scanner(System.in).nextLine()));
                case 4 -> System.out.println(userService.getAllUsers(users));
            }
        }
    }
}
