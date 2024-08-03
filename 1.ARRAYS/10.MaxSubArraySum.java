
class MaxSubArraysSumOptimised{ 
  public static void main(String args[]) {
    int arr[] = {2,4,-6,8,-10};
    int maxSum = Integer.MIN_VALUE; 
    int count = 0;
    for(int i=0;i<arr.length;i++){
        int sum = 0;
        for(int j=i;j<arr.length;j++){
            sum += arr[j];
            count++;
          System.out.println(sum +" "+ count); 
          maxSum = (sum>=maxSum)? sum:maxSum;
          }
      }
    System.out.print("MAX SUBARRAY SUM FOR GIVEN ARRAY IS = "+ maxSum); 
         
            
            }
}