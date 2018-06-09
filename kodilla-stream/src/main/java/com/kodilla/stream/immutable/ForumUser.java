package com.kodilla.stream.immutable;

public class ForumUser {

    private final String realName;
    private final String userName;

    public ForumUser(String realName, String userName) {
        this.realName = realName;
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getUserName() {
        return userName;
    }

}
