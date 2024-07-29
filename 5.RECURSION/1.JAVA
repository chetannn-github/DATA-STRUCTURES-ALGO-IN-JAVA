class recurs{ 
     public static void main(String args[]){
    int n = 100000;
      printfn(n);
  }
   
   
   
static void printfn(int n){
        if (n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        printfn(n-1);

    }



  
  
  
  
}