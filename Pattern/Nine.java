package Pattern;
import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        int n = sc.nextInt();


            //! method 1  most approprite 
        // for(int i = 1; i<= n; i++){
        //     for(int j = i; j<= n; j++){
        //         System.out.print(j + " ");

        //     }
        //     System.out.println();

            // //! Method 2 
            // for(int i = 1; i<= n; i++){
            // for(int j = 1; j<= n - i; j++){
            //       // input = 5 but print 4 lines 
            //     System.out.print(j + " ");

            // }
            // System.out.println();

            //! method 3 
             
            // for(int i = 1; i<= n; i++){
            //     for(int j = 1; j<= n-1-i ; j++){  // not apropriate input = 5 but print 3 lines 
            
            //     System.out.print(j + " ");

            // }
            // System.out.println();

            
            //!Ques 2 
            // 1 2 3 4 5 
            // 1 2 3 4 
            // 1 2 3 
            // 1 2 
            // 1 

        //     for(int i = 1; i<= n; i++){
        //         int a = 1;
        //     for(int j = i; j<= n; j++ ){
        //     System.out.print(a + " ");
        //     a++;


        //     }
        //     System.out.println();
        // }
        
           //! Ques 3 
                // a b c d e 
                // a b c d 
                // a b c 
                // a b 
                // a 

        //    for(int i = 1; i<=n ; i++){
        //     int a = 97;
        //     for(int j = i; j<=n; j++){
        //         System.out.print((char)a + " ");
                
        //         a++;
                

        //     }
        //     System.out.println();

        //    }

        //! Question 4 
        // A A A A A 
        // B B B B
        // C C C
        // D D
        // E

        for(int i = 1; i<=n; i++){
            for(int j = i; j<=n; j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
     

        sc.close();

        



    }
    
}
