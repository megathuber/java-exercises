package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total miles driven: ");
        Float miles = in.nextFloat();
        System.out.println("Enter the total gas used in gallons: ");
        Float gallons = in.nextFloat();
        Float mpg = miles/gallons;
        System.out.println("The average miles per gallon is: "+ mpg);
    }
}
