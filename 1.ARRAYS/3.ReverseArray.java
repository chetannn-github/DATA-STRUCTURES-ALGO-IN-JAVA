import java.util.*;

class ReverseArray{
   public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      
      System.out.print("ENTER LENGTH OF THE ARRAY = ");
      int length = scn.nextInt();
      int arr[]= new int[length];
      System.out.print("ENTER ELEMENTS OF THE ARRAY = ");
      for(int i=0;i<arr.length;i++){
         arr[i]= scn.nextInt();
      }
      
      for(int i=0;i<arr.length/2;i++){
         int temp=0;
         temp = arr[i];
         arr[i]= arr[arr.length-i-1];
         arr[arr.length-i-1]= temp;
      }

      System.out.print("ELEMENTS OF THE REVERSE ARRAY  {"  );

      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i] +" " );
      }

      System.out.print("}" );

   }
    
        
    }
