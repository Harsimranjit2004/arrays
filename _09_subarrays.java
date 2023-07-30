package array;

import java.util.Scanner;

public class _09_subarrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        

        //main logic
        for(int i = 0 ;i<arr.length;i++){
            for(int j = i ; j<arr.length;j++){
                for(int k = i;k<j;k++){
                    System.out.println(arr[k]);
                }
                System.out.println();
            }
        }
    }
}