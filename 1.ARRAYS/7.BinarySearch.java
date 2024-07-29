class BinarySearch {

    public static int binarySearch(int sortedArr[],int key){
        int start = 0 , end = sortedArr.length-1;
        
        while (start<=end){
            // int mid = (start+end)/2;
            int mid = start + (end-start)/2;

            if (sortedArr[mid] == key){
                return mid;
            }
            if (sortedArr[mid] < key){
                start = mid +1;
            }
            else {
                end= mid -1;
            }
        }
        return -1;
        }
                        

    public static void main(String args[]){
        int marks[] ={0,2,3,3,3,2,32,643,645343,43231};
        System.out.print( "KEY FOUNND AT INDEX "+ binarySearch(marks,0));
    }

}