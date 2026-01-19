package Practic;
public class Unique {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 2, 10, 8, 6};
        int target = 7;
        for(int i =0 ; i< arr.length; i++){
            for(int j= 1; j < 1 - arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.print("Index are : { "+ i + j + " }");
                }else{
                    System.out.print(" Can not find ");
                }
            }
            System.out.println();
        }
        
    }
}
