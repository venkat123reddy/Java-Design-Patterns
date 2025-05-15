package lld.design.questions.StackOverFlow.services;

import lld.design.questions.StackOverFlow.models.Post;
import lld.design.questions.StackOverFlow.models.PostActions;

import java.util.List;

public interface PostService {

    void createPost(String userId,Post post);
    List<Post> getPosts(String userId);
    void updatePost(Post post, PostActions postActions);
}
