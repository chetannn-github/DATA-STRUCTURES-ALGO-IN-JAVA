class Sorting{
    public static void cyclicSort(int arr[]){
        int i=0;
       while(i<=arr.length-2){
        int cor = arr[i]-1;
        if (arr[i]!=arr[cor]){
            int temp = arr[i];
            arr[i] = arr[cor];
            arr[cor]=temp;
        }else{
            i++;
        }
       }
            
    }
      

    

public static void main(String[] args) {
        
       int arr[]={3,1,2,5,7,6,4};
       cyclicSort(arr);
       for (int i=0; i<arr.length;i++){
   System.out.print(arr[i]+" "); }
}
}
