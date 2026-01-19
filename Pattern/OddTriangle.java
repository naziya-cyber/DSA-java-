// 1 
// 1 3 
// 1 3 5 
// 1 3 5 7 
// 1 3 5 7 9
package Pattern;

import java.util.Scanner;

public class OddTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Length(odd no.) : ");
        int n = sc.nextInt();
        //! Method 1 
        // for(int i =1; i<= n; i++){
        //     for(int j = 1; j<= i; j++){
        //         System.out.print((j*2)-1 + " ");
        //     }
        //     System.out.println();
        // }

        //! Method 2 
        for(int i =1; i<= n; i++){
            int a = 1; 
            for(int j = 1; j<= i; j++){
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
        
        
        sc.close();
    }
    
}
