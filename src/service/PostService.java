package service;

import model.Post;
import model.User;

import java.util.List;

public interface PostService {

    String addPostToUser(List<Post> posts,Post post);
    String deletePostById(List<Post> posts,Long postId);
    List<Post> getAllPostByUserId(List<User> users, Long userId);

}
