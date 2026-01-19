package Practic;

import java.util.Scanner;

public class AreaAndParimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length of rectangle : ");
        float length = input.nextFloat();
        System.out.print("Enter the base of the rectangle : ");
        float base = input.nextFloat();

        float area = length * base;
        System.out.println("Area is : " + area);

        float parimeter = 2 * (length + base);
        System.out.println("Parimeter is : " + parimeter);

        if (area > parimeter) {
            System.out.println("Yes area is greater than its parimeter!!");
        } else if (area == parimeter) {
            System.out.println("Area is equal to its parimeter");
        }

        else {
            System.out.println("No area is not greater then its parimeter");
        }

        input.close();

    }

}
