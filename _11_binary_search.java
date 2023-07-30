package array;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class _11_binary_search {
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int data = 50;

        int l = 0;
        int h  = arr.length-1;
        while(l<=h){
            int m = (l+h)/2;
            if(data>m){
                l = m+1;
            }
            else if(data<m){
                h = m-1;
            }else{
                System.out.println(m);
                return;
            }
        }
    }
}
