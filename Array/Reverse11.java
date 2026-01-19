package Array;
 import java.util.Scanner;
public class Reverse11 {

static void Print(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // reverse
        // int i = 0;
        // int j = arr.length-1;
        // while(i<j){
        //     //swaping the numbers 
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;

        // }

        // // print the array 
        //  for(int a = 0; a<arr.length; a++){
        //     System.out.print(arr[a]+ "  ");
        //  }



        //?  reverse the arr    //by me
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            // swap 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
            
        }
        Print(arr);
        
        
        sc.close(); 
    }
    
    
    
   
    
}
