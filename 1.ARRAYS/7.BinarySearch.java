import java.util.*;
class BinarySearch {
        public static int binarySearch(int arr[],int key){
            int start=0 ,end = arr.length-1;
            while (start<=end){
                int mid = (start+end)/2;
                if (arr[mid]== key){
                    return mid;}
                    if (arr[mid] <key){
                        start = mid +1;}
                        else {
                        end= mid -1;} }
                        return -1;}
                        


        



    public static void main(String args[]){
        int marks[] = {2,4,6,7,8,9};
       System.out.print( "KEY FOUNND AT INDEX "+binarySearch(marks,8));
    }

}