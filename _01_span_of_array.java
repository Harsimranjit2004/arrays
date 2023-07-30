package array;

import java.util.Scanner;

public class _01_span_of_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        arr[0] = 53;
        arr[1]= 33;
        arr[2]  = 44;
        arr[3] = 67;
        arr[4]  = 98;
        int max = arr[0];
         int min = arr[0];
        for(int i = 0 ;i<arr.length;i++){
            
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        
        System.out.println(max);
        System.out.println(min);
        
        
    }
}
