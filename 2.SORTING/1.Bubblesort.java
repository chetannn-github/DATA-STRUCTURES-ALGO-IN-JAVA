class Sorting{
    public static void bubbleSort(int arr[]){
        for (int turn=0;turn<arr.length-1;turn++){int swap=0;
            for (int j=0;j<arr.length-1-turn;j++){
                //swap
                if (arr[j]>arr[j+1]){swap++;
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= temp;}}
                    if (swap==0){System.out.print("GIVEN ARRAY IS ALREADY SORTED BROO");return;}
        }
    }

    public static void main(String[] args) {
        
       int arr[]={};bubbleSort(arr);
       for (int i=0; i<arr.length;i++){
   System.out.print(arr[i]+" "); }
}}