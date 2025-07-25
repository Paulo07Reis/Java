package poo.exercise.exercise11.Application;

import poo.exercise.exercise11.Domain.Comment;
import poo.exercise.exercise11.Domain.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome");

        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful contry",
                12
        );

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        System.out.println();

        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the force be with you");

        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5
        );

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);
    }
}
