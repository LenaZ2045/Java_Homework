package com.telran.prof.lesson_12.inmemorydb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserExampleApp {

    public static void main(String[] args) {
        List<UserAction> userActionList = Arrays.asList(
                new UserAction(),
                new UserAction()
        );
        Map<User,List<UserAction>> userListMap = new HashMap<>();
        Map<String, List<UserAction>> userDataList = new HashMap<>();
        userDataList.put("20240320", userActionList);
        Map<User, Map<String, List<UserAction>>> userLog = new HashMap<>(); // collection of collections
    }
}