package exercises;

import java.util.Scanner;

public class alice {
    public static void main(String[] args) {
        String wonderland = ("Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'").toLowerCase();
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a term to search for: ");
        String term = in.next().toLowerCase();
        System.out.println(wonderland.contains(term));
    }
}
