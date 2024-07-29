class Sorting{
    public static int cyclicSort(int arr[]){
        int i=0;
       while(i<=arr.length-1){
        int cor = arr[i]-1;
        if (arr[i]!=i+1 && cor!=-1){
            int temp = arr[i];
            arr[i] = arr[cor];
            arr[cor]=temp;
        }else{
            i++;
        }
       }
       int flag=0;
        for(int j=0;j<=arr.length-1;j++){
            if (arr[j]==0){
                flag=j+1;
                }
            } 
        return flag;
    }
      

    

public static void main(String[] args) {
        
       int arr[]={3,1,2,0};
       cyclicSort(arr);
       for (int i=0; i<arr.length;i++){
   System.out.print(arr[i]+" "); }
   System.out.print("\n"+  cyclicSort(arr));
}
}
