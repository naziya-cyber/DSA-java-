//       * 
//     * * * 
//   * * * * * 
// * * * * * * *

package Pattern;

import java.util.Scanner;

public class Ques24Pyramind {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        //! Method 1 with maths 
        // for(int i = 1; i<= n; i++){
        //     for(int j = i; j<= n-1; j++){
        //         System.out.print("  ");
        //     } 
        //     for(int k = 1; k <= (2*i)-1 ; k++){
        //         System.out.print("* ");
        //     }


        //     System.out.println();
        // }

        //! Method 2 with out maths 
        int nsp = n-1 ;  // no. of spaces
        int nst = 1; // no. of stars

        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= nsp; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= nst; k++){
                System.out.print("* ");
               
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
        sc.close();
    }
}
