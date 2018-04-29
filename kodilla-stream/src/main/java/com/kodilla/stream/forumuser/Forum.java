package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1, "John Smith", 'M', 1982, 1587));
        forumUserList.add(new ForumUser(2, "Dylan Murphy", 'M', 1994, 258));
        forumUserList.add(new ForumUser(3, "Madelynn Carson", 'F', 2003, 15));
        forumUserList.add(new ForumUser(4, "Morgan Walsh", 'M', 2008, 0));
        forumUserList.add(new ForumUser(5, "Aimee Murphy", 'F', 1971, 0));
        forumUserList.add(new ForumUser(6, "Ryan Talley", 'M', 1999, 5));
        forumUserList.add(new ForumUser(7, "Giancarlo Guerrero", 'M', 2005, 5));
        forumUserList.add(new ForumUser(8, "Marie Stuart", 'F', 2001, 0));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUserList);
    }
}
