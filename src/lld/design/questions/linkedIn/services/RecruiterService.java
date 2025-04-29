package lld.design.questions.linkedIn.services;

import lld.design.questions.linkedIn.models.JobPosition;
import lld.design.questions.linkedIn.models.Posts;
import lld.design.questions.linkedIn.models.Profile;

import java.util.List;

public class RecruiterService implements  LinkedInService{

     public Profile profile;

     public PostsService postsService;

     public JobPositionService jobPositionService;
     RecruiterService(Profile profile, PostsService postsService, JobPositionService jobPositionService) {
         this.profile = profile;
         this.postsService = postsService;
         this.jobPositionService = jobPositionService;

     }

    public void addJobPosition(JobPosition jobPosition) {

         this.jobPositionService.addJob(jobPosition);
    }

    public List<JobPosition> getJobs() {

         return this.jobPositionService.getJobs();
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
