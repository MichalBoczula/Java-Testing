package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1, "A", 'M',  1990, 11));
        forumUsersList.add(new ForumUser(2, "B", 'M',  1999,0));
        forumUsersList.add(new ForumUser(3, "C", 'M',  1998,2));
        forumUsersList.add(new ForumUser(4, "D", 'M',  1997,31));
        forumUsersList.add(new ForumUser(5, "E", 'M',  1996,0));
        forumUsersList.add(new ForumUser(6, "F", 'M',  1995,51));
        forumUsersList.add(new ForumUser(7, "G", 'M',  1994,4));
        forumUsersList.add(new ForumUser(8, "H", 'M',  1993,6));
        forumUsersList.add(new ForumUser(9, "I", 'M',  1992,0));
        forumUsersList.add(new ForumUser(10, "J", 'M',  1991,12));
        forumUsersList.add(new ForumUser(11, "K", 'M',  2000,32));
        forumUsersList.add(new ForumUser(12, "L", 'M',  2001,98));
        forumUsersList.add(new ForumUser(13, "M", 'M',  2000,54));
        forumUsersList.add(new ForumUser(14, "N", 'M',  2004,0));
        forumUsersList.add(new ForumUser(15, "O", 'M',  2002,0));
        forumUsersList.add(new ForumUser(16, "P", 'M',  2000,23));
        forumUsersList.add(new ForumUser(17, "R", 'M',  1998,15));
        forumUsersList.add(new ForumUser(18, "S", 'M',  1999,0));
        forumUsersList.add(new ForumUser(19, "T", 'M',  1994,7));
        forumUsersList.add(new ForumUser(20, "U", 'M',  1993,0));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUsersList);
    }
}
