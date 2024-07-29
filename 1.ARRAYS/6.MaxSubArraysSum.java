import java.util.*;

class MaxSubArraysSum{
    public static void main(String args[]) {
   
       int arr[]= {2,4,-6,8,-10};
       int maxSum= Integer.MIN_VALUE; 
       
       for(int i=0;i<arr.length;i++){
           for(int j=i;j<arr.length;j++){
               int sum =0;
            for (int k=i;k<=j;k++){
              sum+=arr[k];}
              System.out.println(sum); 
              maxSum = (sum>=maxSum)? sum:maxSum;}

            }
            System.out.print("MAX SUBARRAY SUM FOR GIVEN ARRAY IS = "+ maxSum); 
         
            
            }
            }