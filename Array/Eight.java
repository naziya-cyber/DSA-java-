// find teh target element 

package Array;
import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
          int[] arr = {23, 34, 12, 23,  232, 32, 1, 2, 3,5, 6, 7, 67,7 , };

        //? search X present in arr or not 
        //! 1 by me 
        System.out.print("Enter the number : ");
        int target = sc.nextInt();
        // for(int i =0; i<arr.length; i++){
        //     if(arr[i] == x){
        //         System.out.println(" yes " + x + " found at index no : " + i);
        //         break;
        //     } 
            // else{
            //     System.out.print("not found");
            // }
        // }
        // this is not a optimise solution 
        // here we cant use the else logic



        //! 2  Prime number logic 
        // boolean flag = false;
        // for(int i =0; i<arr.length; i++){
        //     if(arr[i] == target){
                
        //         flag = true;
        //         break;
        //     }
           
        // }
        // if(flag){
        //     System.out.println("yes found!!");
        // }else{
        //     System.out.println("not found ");
        // }
            

        // ! 3  get the index also 
        int found = -1; // -1  means target is not in the arr kiuki -1 toh index hota hi nhi hai 
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                found = i; // store index in a variable 
                break;
            }
        }
        if(found != -1){
            System.out.print(" Found at index : " + found);
        }else{
            System.out.print("not present int the arr !!!");
        }

               
                
            
            sc.close();
        }
        


    }
    

