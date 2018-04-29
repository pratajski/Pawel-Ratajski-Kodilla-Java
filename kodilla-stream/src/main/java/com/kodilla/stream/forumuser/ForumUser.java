package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final int dateOfBirth;
    private final int postNumbers;

    public ForumUser(final int userId, final String userName, final char sex, final int dateOfBirth, final int postNumbers) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postNumbers = postNumbers;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostNumbers() {
        return postNumbers;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postNumbers=" + postNumbers +
                '}';
    }
}
