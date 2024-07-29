import java.util.*;

class KadanesAlgo{
    public static int kadanesAlgo(int arr[]){

        int cs=0 , ms = Integer.MIN_VALUE;
        for (int i=0, count=0;i<arr.length;i++){
            if (arr[i]<0){count++; ms=Math.max(ms,arr[i]);}
            if (count== arr.length){return ms;}
        }
    
        cs =0; ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs += arr[i];
            if (cs<0){
                cs=0;
            }
            ms=Math.max(ms,cs);
        }
        
        return ms;
    }

    public static void main(String args[]){
        int num []= {-2,-3,-1,-2,-3};
        System.out.print("MAX SUBARRAY SUM = " +kadanesAlgo(num));
    }
}