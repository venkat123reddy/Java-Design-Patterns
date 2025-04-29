package lld.design.questions.linkedIn.services;

import lld.design.questions.linkedIn.models.Posts;

import java.util.List;

public interface PostsService {

    public void addPost(Posts posts);
    public List<Posts> getPost();
}
