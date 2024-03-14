package service.serviceImpl;

import model.Post;
import model.User;
import service.PostService;

import java.util.List;

public class PostServiceImpl implements PostService {

    @Override
    public String addPostToUser(List<Post> posts, Post post) {
        posts.add(post);
        return "Successfully added!";
    }

    @Override
    public String deletePostById(List<Post> posts, Long postId) {
        for (Post post : posts) {
            if (post.getId() == postId) {
                posts.remove(post);
            }
        }
        return "Successfully delete!";
    }

    @Override
    public List<Post> getAllPostByUserId(List<User> users, Long userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                return user.getPosts();
            }
        }
        return null;
    }
}
