class Sorting{
    public static int[] cyclicSort(int arr[]){
        int i=0;
       while(i<=arr.length-1){
        int cor = arr[i]-1;
        
        if (arr[i]!=i+1 && arr[cor]!=arr[i]){
            int temp = arr[i];
            arr[i] = arr[cor];
            arr[cor]=temp;
        }else{
            i++;
        }
       }
       int ret[] = new int[arr.length];
          for(int k=0,j=0;k<arr.length;k++){
            if (arr[k]!=k+1){
                ret[j]=k+1;
                j++;
            }

          }  
               for (int l=0; l<ret.length;l++){
 System.out.print(ret[l]+" "); }
          return ret;
    }
      

    

public static void main(String[] args) {
        
       int arr[]={4,3,2,7,8,2,3,1};
       cyclicSort(arr);
  
  
}
}
