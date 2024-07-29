class sum {
    public static void main(String[] args) {
      System.out.print  (sumn(100));
    }

    static int sumn(int n) {
    if (n ==1 ){
        return 1;
    }
    return n+ sumn(n-1);
}
}