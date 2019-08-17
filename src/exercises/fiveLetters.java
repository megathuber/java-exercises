package exercises;

import java.util.ArrayList;

public class fiveLetters {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("Beach");
        wordList.add("Water");
        wordList.add("Free");
        wordList.add("Bread");
        wordList.add("Shawn");
        wordList.add("Bridge");
        wordList.add("Java");
        wordList.add("Coffee");
        wordList.add("Sleep");
        wordList.add("Jennifer");
        wordList.add("Jeffrey");
        wordList.add("Poster");

        printFive(wordList);


    }

    public static void printFive(ArrayList<String> alist) {

        //loop through and get each word
        for (String word : alist) {
            if (word.length() == 5) {
                System.out.println(word);
            }

        }
    }

}
