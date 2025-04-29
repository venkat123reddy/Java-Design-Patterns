package lld.design.questions.linkedIn.services;

import lld.design.questions.linkedIn.models.Posts;

import java.util.List;

public interface LinkedInService {

    void addPost(Posts post);
    List<Posts> viewPosts();
}
