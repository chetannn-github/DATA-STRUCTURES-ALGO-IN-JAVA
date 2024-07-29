class recurse {
    
    public static void main(String[] args) {
    print(22);
}

 static void print(int n){
    if (n==1){
        System.out.print(1+" ");
        return;
    }
    print(n-1);
    System.out.print(n+" ");
 }
}