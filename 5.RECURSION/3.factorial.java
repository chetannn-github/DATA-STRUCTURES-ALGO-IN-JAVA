class Factorial {
    public static void main(String[] args) {
      System.out.print  (factorial(6));
    }

    static int factorial(int n) {
    if (n ==1 || n ==0){
        return 1;
    }
    return n* factorial(n-1);
}
}