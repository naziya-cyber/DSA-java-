// print
// 1
// n

// 2
// n-1

// 3
// n-2

package Loops;

import java.util.Scanner;
public class Imp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int number2 = number;
        for(int i = 1; i<=number2; i++){
            System.out.println(i);
            System.out.println(number);
            number -= 1;
            System.out.println();

        }

        sc.close();
        
        
    }
}
