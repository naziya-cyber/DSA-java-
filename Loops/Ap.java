package Loops;

import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        //! method 1 
        // when we know ki last term konsi hone wali hai and ye formula se pta chalega (3*n-1)
        // for(int i= 2; i<= 3*number-1 ; i += 3){
        //     System.out.print("_" + i);
        // }


        //! method 2
        // when we know ki kitni number of term aane wali hai 
        int a = 2;
        int d = 3;
        for(int i = 1; i<= number; i++){
            System.out.print("_" +a);
            a += d;

        }
        sc.close();
    }
    
}
