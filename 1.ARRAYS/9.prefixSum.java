import java.util.*;

class PrefixSum{
    public static int prefixSum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i =1; i<prefix.length;i++){
            prefix[i]= prefix[i-1]+arr[i];
        }

        // max subarray sum calculation
        int sum =0;int maxSum= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for (int j=i; j<arr.length;j++){
                sum= (i==0)? prefix[j]:prefix[j]-prefix[i-1];
            }
            maxSum= (maxSum>=sum)? maxSum:sum;
        }

        return maxSum;    
    }
   
   

    public static void main(String args[]){
        int num []= {-2,-3,1,-2,-3};
        System.out.print("MAX SUBARRAY SUM = " + prefixSum(num));
    }
}