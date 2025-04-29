package lld.design.questions.linkedIn.services;

import lld.design.questions.ATM.models.User;
import lld.design.questions.linkedIn.models.Posts;
import lld.design.questions.linkedIn.models.Profile;

import java.util.List;

public class UserServiceImpl implements LinkedInService{

    Profile profile;

    JobPositionService jobPositionService;

    PostsService postsService;

    UserServiceImpl(Profile profile, JobPositionService jobPositionService, PostsService postsService) {
        this.profile = profile;
        this.jobPositionService = jobPositionService;
        this.postsService = postsService;
    }

    @Override
    public void addPost(Posts post) {
          this.postsService.addPost(post);
    }

    @Override
    public List<Posts> viewPosts() {

        return postsService.getPost();

    }
}
