package Pattern;
import java.util.Scanner;
public class SomeCommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = sc.nextInt();

        //!  1   Print Alphabet Square
        // A B C D E
        // A B C D E
        // A B C D E
        // A B C D E

        // for(int i = 1; i<= n; i++){
        //     for(int j = 65; j< 65 + n; j++){
        //         System.out.print((char)j + " ");
        //     }
        //     System.out.println();

        // }
        
        
        //! 2 Print number square
        // 1 1 1 1 1 
        // 2 2 2 2 2 
        // 3 3 3 3 3 
        // 4 4 4 4 4 
        // 5 5 5 5 5 



        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        

        //! 3
        // A A A A A A 
        // B B B B B B
        // C C C C C C
        // D D D D D D
        // E E E E E E


        // for(int i = 1; i < n; i++){
        //     for(int j = 1; j<= n; j++){
        //         System.out.print((char)(i + 64) + " ");
        //     }
        //     System.out.println();
        // }


        //!  4
        // A 
        // A B 
        // A B C 
        // A B C D 
        // A B C D E  


        // for(int i = 1; i<= n; i++){
        //     for(int j = 1; j<= i; j++){
        //         System.out.print((char)(j + 64) + " ");
        //     }
        //     System.out.println();
        // }


        //! 5 
        // A 
        // B B
        // C C C
        // D D D D
        // E E E E E



        for(int i =1 ; i<= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
              
        
        



        sc.close();
    }
    
}
