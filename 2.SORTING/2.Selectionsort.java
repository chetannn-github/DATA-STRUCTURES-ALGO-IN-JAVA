class Sorting{
    public static void selectionSort(int arr[]){
        for (int i=0;i<=arr.length-2;i++){
            int min = Integer.MAX_VALUE;
            int temp, pos=0;
            for (int j=i;j<=arr.length-1;j++){
                
                if (min>arr[j]){
                    min=arr[j];
                    pos = j; 
                 }}
                
                temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;

                }}

    public static void main(String[] args) {
        
       int arr[]={3,1,-3,5,23,Integer.MIN_VALUE,20,2,12 , Integer.MAX_VALUE};
       selectionSort(arr);
       for (int i=0; i<arr.length;i++){
   System.out.print(arr[i]+" "); }
}
}
// min ko pos ki trh treat krrr min=j; j=i+1 se l-1 tk iif arr[min]>arr[j] then min = j then swap arr [i]& arr [min]