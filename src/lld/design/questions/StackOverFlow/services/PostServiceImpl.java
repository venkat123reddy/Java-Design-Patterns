package lld.design.questions.StackOverFlow.services;

import lld.design.questions.StackOverFlow.models.Post;
import lld.design.questions.StackOverFlow.models.PostActions;
import lld.design.questions.StackOverFlow.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostServiceImpl implements PostService{

    public static PostService postService = new PostServiceImpl();

    public UserService userService = UserServiceImpl.getUserService();

    private PostServiceImpl() {

    }

    public static PostService getPostService() {
        return postService;
    }


    @Override
    public void createPost(String userId, Post post) {
            userService.getUser(userId).postList.add(post);

    }

    @Override
    public List<Post> getPosts(String userId) {
        return userService.getUser(userId).postList;
    }

    @Override
    public void updatePost(Post post, PostActions postActions) {

    }
}
