class PairsInAnArray{
    public static void main(String args[]) {

        int arr[]= {0,1,2,3,4,5,6};
        System.out.print("PAIRS OF ARRAY = ");
    
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print ("(" +arr[i]+"," + arr[j]+") "  );  
            }
           
            System.out.println();
        }
    }
}