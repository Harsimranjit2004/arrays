package array;

import java.util.Scanner;

public class _10_subsets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i]  = sc.nextInt();
        }

        // main logic 
        int limit = (int)Math.pow(2, arr.length);
        for(int i = 0 ;i<limit;i++){
            // convert i into binary 
            int temp = i;
            String set = "";
            for(int j=arr.length-1;j>0;j--){
               int  r  = temp %2;
               temp = temp/2;
               if(r == 0){
                 set = set + " ";
               }
               else{
                set = arr[j]+set;
               }
            
            }
            System.out.println(set);
        }
    }
    
}
