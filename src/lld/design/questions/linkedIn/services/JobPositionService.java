package lld.design.questions.linkedIn.services;

import lld.design.questions.linkedIn.models.JobPosition;

import java.util.List;

public interface JobPositionService {

    public List<JobPosition> getJobs();
    public void addJob(JobPosition jobPosition);
}
