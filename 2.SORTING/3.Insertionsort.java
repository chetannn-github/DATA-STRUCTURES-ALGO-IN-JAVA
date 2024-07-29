class Sorting{
    public static void insertionSort(int arr[]){
        for(int i=0;i<=arr.length-2;i++){
            int temp;
        
            for (int j=i+1;j>=1;j--){
                if (arr[j-1]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{break;}
            
            }
                
               
               
        }       

        }
    

    public static void main(String[] args) {
        
       int arr[]={3,1,-3,5,23,Integer.MIN_VALUE,20,2,12 , Integer.MAX_VALUE};
       insertionSort(arr);
       for (int i=0; i<arr.length;i++){
   System.out.print(arr[i]+" "); }
}
}
