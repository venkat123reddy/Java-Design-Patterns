package lld.design.questions.linkedIn.services;

import lld.design.questions.linkedIn.models.Posts;

import java.util.ArrayList;
import java.util.List;

public class PostServiceImpl implements PostsService{

    List<Posts> postsList = new ArrayList<>();

    static PostsService postsService = new PostServiceImpl();

    private PostServiceImpl() {

    }

    public static PostsService getObject() {

        return postsService;

    }

    @Override
    public void addPost(Posts posts) {

    }

    @Override
    public List<Posts> getPost() {
        return List.of();
    }
}
