package lld.design.questions.StackOverFlow.services;

import lld.design.questions.StackOverFlow.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService{

    public static UserService userService = new UserServiceImpl();

    public Map<String,User> userMap = new HashMap<>();

    private UserServiceImpl () {

    }

    public static UserService getUserService() {
        return userService;
    }


    @Override
    public void createUser(User user) {

        userMap.put(user.userId,user);
    }

    @Override
    public User getUser(String userId) {

        return userMap.get(userId);

    }
}
