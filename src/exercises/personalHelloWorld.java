package exercises;

import java.util.Scanner;

public class personalHelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String name = in.next();
        System.out.println("Hello " + name + "!");
    }
}
