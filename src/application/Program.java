package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import entities.Comment;
import entities.Post;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		
		Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);		
		Comment comment1_Post1 = new Comment("Have a nice trip");
		Comment comment2_Post1 = new Comment("Wow that's awesome");
		post1.addComment(comment1_Post1);
		post1.addComment(comment2_Post1);
		
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		Comment comment1_Post2 = new Comment("Good night");
		Comment comment2_Post2 = new Comment("May the force be with you");
		post2.addComment(comment1_Post2);
		post2.addComment(comment2_Post2);
		
		post1.showInformation();
		System.out.println();
		post2.showInformation();
		sc.close();
	}
}