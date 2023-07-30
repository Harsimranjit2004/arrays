package array;

import java.util.Scanner;

public class _08_inverse_array {
    public static void inverse(int[] arr){
        
        for(int i  = 0;i<arr.length;i++){
            int v = arr[i];
            arr[v]  = i;
        }
        
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i = 0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
         inverse(arr);
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
