package Array;
public class MissingEle14 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 7, 6, 9, 8, 10, 12, 13, 14, 11};
        int n = arr.length + 1; // because one element is missing that's why there is +1 
        int sum = n*(n+1)/2;
        int arrSum = 0;
        for(int ele : arr){
            arrSum += ele;

        }
        int missingEle = sum - arrSum;
        System.out.print("Missing element is  : "+ missingEle);

    }
    
}
