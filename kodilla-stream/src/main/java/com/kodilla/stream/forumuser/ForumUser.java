package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class ForumUser {

    private final int id;
    private final String userName;
    private final Character gender;
    private final int birthDate;
    private final int postNumber;

    public ForumUser(int id, String userName, Character gender,int birthDate, int postNumber) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
//        String text = birthDate.format(formatter);
        this.id = id;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.postNumber = postNumber;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public Character getGender() {
        return gender;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", postNumber=" + postNumber +
                '}';
    }
}
