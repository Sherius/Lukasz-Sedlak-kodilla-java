package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
 final List<ForumUser> bookList = new ArrayList<>();

    public Forum(){

        bookList.add(new ForumUser(123456, "John Smith", 'M', 1990, 11, 17, 2));
        bookList.add(new ForumUser(234567, "Jan Kowalski", 'M', 1996, 9, 15, 4));
        bookList.add(new ForumUser(345678, "Marta Kowalska", 'F', 2000, 4, 14, 17));
        bookList.add(new ForumUser(456789, "Przemek Kowalski", 'M', 2074, 3, 17, 25));
        bookList.add(new ForumUser(567891, "Szymon Kowalski", 'M', 2013, 7, 16, 30));
        bookList.add(new ForumUser(678912, "Johny Kowalski", 'M', 1999, 10, 13, 14));


}
    public List<ForumUser>  getUserList() {
        return new ArrayList<ForumUser>(bookList);
    }

}
