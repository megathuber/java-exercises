package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashStudentsID {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newName;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and IDs
        do {
            System.out.print("Name: ");
            newName = in.nextLine();

            if (!newName.equals("")) {
                System.out.print("Id: ");
                int newId = in.nextInt();
                students.put(newId, newName);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newName.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }

}

//code not done - finish later


