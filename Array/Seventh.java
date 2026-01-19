package Array;

import java.util.Scanner;

public class Seventh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1 ,1 };

        for(int i =0; i< arr.length; i++){
            if( i % 2 != 0){
                arr[i] *= 2;
            }else{
                arr[i] += 10;
            }
        }
        System.out.println();

        // print array 
        System.out.print("Element of the arr : ");
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}
