package exercises;

import java.util.Scanner;

public class areaRec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rectangle dimensions.");
        System.out.println("Length: ");
        double length = in.nextDouble();
        System.out.println("Width: ");
        double width = in.nextDouble();
        double area = length*width;
        System.out.println("The area of your rectangle is " + area);
    }
}
