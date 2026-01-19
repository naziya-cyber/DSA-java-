//find the two index elements that sum is equal to target element
package Array;
import java.util.Scanner;



public class NineTargetNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {34, 2, 1 ,3, 34, 56, 7, 12, 90, 44};
        System.out.print("Enter the target number : ");
        int target = sc.nextInt();
        boolean flag = false;
        for(int i =0; i<arr.length; i++){
            for(int j =i; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                     flag = true;
                
                }
            }
        }
        if(flag){
            System.out.print("Found!!");
            
        }else{
            System.out.print("could not found!!");
        }
       

       

        sc.close();


    }
    
}
