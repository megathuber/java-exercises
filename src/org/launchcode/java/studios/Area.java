package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle: ");
        Double radius = in.nextDouble();
        Double area = 3.14*(radius*radius);
        System.out.println("The area of your circle is: "+ area);
    }
}
