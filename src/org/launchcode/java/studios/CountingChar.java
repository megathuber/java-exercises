package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingChar {
    public static void main(String[] args) {
        //Use appropriate data structure: HashMap
        //create new HashMap called characterCounts:
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        //create the hard coded text string
        String testString = ("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.");
        char[] charactersInString = testString.toCharArray();

        //loop through one character at a time, storing or updating the count for a given char
        //initialize the counts for the characters as you go through the string rather than before
        for (char character : charactersInString) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
            else {
                characterCounts.put(character, 1);
            }

        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
        }
    }
}
