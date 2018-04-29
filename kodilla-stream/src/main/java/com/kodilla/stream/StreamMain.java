package com.kodilla.stream;

import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
   public static void main(String[] args) {
      Forum theForum = new Forum();

      Map<Integer, ForumUser> theFoumList = theForum.getList().stream()
              .filter(forumUser -> forumUser.getSex() == 'F')
              .filter(forumUser -> forumUser.getDateOfBirth() > 1998)
              .filter(forumUser -> forumUser.getPostNumbers() < 1)
              .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser))
              ;

         System.out.println("Result: " +theFoumList);
   }
}