package Array;

public class Segregate0s1s {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1};
        int zeros = 0;
        int ones = 0; 
        // traverse the array 
        for(int ele : arr){
            if(ele == 0){
                zeros++;
            }else{
                ones++;
            }
        }
        System.out.print(zeros+ "  ");
        System.out.println(ones);

        // fill the arr  with zeros
        for(int i = 0; i<zeros; i++){
            arr[i] = 0;
        }
        
        for(int i = zeros; i<arr.length; i++){
            arr[i] = 1;
        }
        // print the arr 
    //    for(int ele: arr){
    //     System.out.print(arr[ele]+ "  ");
    //    }  //? this it printing only 0s
    //? because ele is associated with the value of the array not the index of the array 
    //? so when we do arr[ele] it is trying to access arr[o] and arr[1] only because there are only 0s and 1s in the arr



       for(int i =0; i<arr.length; i++){
        System.out.print(arr[i] + "  ");
       }

    }
    
}
