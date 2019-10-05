package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
private final List<ForumUser> bookList = new ArrayList<>();

    public Forum(){

        bookList.add(new ForumUser(123456, "John Smith", 'M', 1990, 2));
        bookList.add(new ForumUser(234567, "Jan Kowalski", 'M', 1996,  4));
        bookList.add(new ForumUser(345678, "Marta Kowalska", 'F', 2000,  17));
        bookList.add(new ForumUser(456789, "Przemek Kowalski", 'M', 2074,  25));
        bookList.add(new ForumUser(567891, "Szymon Kowalski", 'M', 2013,  30));
        bookList.add(new ForumUser(678912, "Johny Kowalski", 'M', 1999,  14));


}
    public List<ForumUser>  getUserList() {
        return new ArrayList<ForumUser>(bookList);
    }

}
