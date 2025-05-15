package lld.design.questions.StackOverFlow.services;

import lld.design.questions.StackOverFlow.models.User;

public interface UserService {

    void createUser(User user);
    User getUser(String userId);

}
