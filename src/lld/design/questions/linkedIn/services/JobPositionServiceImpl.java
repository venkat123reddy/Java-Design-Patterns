package lld.design.questions.linkedIn.services;

import lld.design.questions.linkedIn.models.JobPosition;

import java.util.List;

public class JobPositionServiceImpl implements JobPositionService{
    List<JobPosition> jobPositionList;

    static JobPositionService jobPositionService = new JobPositionServiceImpl();

    private JobPositionServiceImpl() {

    }

    public static JobPositionService  getObject() {
         return jobPositionService;
    }

    @Override
    public List<JobPosition> getJobs() {
        return jobPositionList;
    }

    @Override
    public void addJob(JobPosition jobPosition) {

        this.jobPositionList.add(jobPosition);

    }
}
