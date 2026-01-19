package Pattern;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        //!1
        // ****
        // ****
        // ****
        // ****
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //!2
        // *
        // **
        // ***
        // ****
        // *****


        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

       

        
        //! 3
        //! print  number(odd)
        
        // for(int i = 1; i<=n; i++){
        //     int odd = 1;
        //     for(int j = 1; j<= i; j++){
                
        //         System.out.print(odd + "_");
        //         odd += 2;
                
                
        //     }
        //     System.out.println();
        // }
        
        
        
        sc.close();
        
    }
}
