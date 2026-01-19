package Array;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // create an array 
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // input the array
        System.out.println("Enter the element of the array: ");
        for(int i = 0; i<arr.length; i++){

            arr[i] = sc.nextInt();
        }

        // print the array
        for(int i =0 ; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();


    }
    
}

