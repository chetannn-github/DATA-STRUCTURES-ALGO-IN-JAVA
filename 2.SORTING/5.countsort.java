public class test {
    public static void main(String[] args) {
    int a[]={1,4,1,3,2,40000,3,7};
    int n = a.length , max = a[0];
    for (int i =1; i<=n-1;i++){
        if (a[i]>max){
            max = a[i];
        }
    }
    int f[] = new int[max+1];

    for (int i =0; i<=n-1;i++){
        f[a[i]]++;
    }
  // for(int i =0; i<=f.length-1;i++){
    // System.out.print(f[i]+" ");
  // }
  // System.out.println();
 
  for (int i =0, j=0; i<f.length;){
    if (f[i]!=0){
      a[j]=i;
      j++;f[i]--;
    }else{
      i++;
    }
  }
 
 
 
 
 
 
 

     for(int i =0; i<=a.length-1;i++){
   System.out.print( "      "+a[i]+" ");
 }
    
    
    
    }
    
}
