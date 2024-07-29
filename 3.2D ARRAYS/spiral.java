 class spiral {
    public static void main(String []args){
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int re= a.length-1;
        int ce =a[0].length-1;
        int rs= 0,cs=0;

while(true){
        int r,c;
        r=rs ;c=cs;
       while (r==rs&& c<=ce){
        System.out.print(a[r][c]+" ");
        c++;}
         r=rs+1;c=ce;

        while(r<=re&& c==ce){
             System.out.print(a[r][c]+" ");
             r++;}

       r=re; c= ce-1;

       while(c>=cs && r==re){
         System.out.print(a[r][c]+" ");
          c--;}
       
       
       c=cs;  r= re-1;

         while(r>=rs+1&& c==cs){
       System.out.print(a[r][c]+" ");
                r--;}

            rs++;
            cs++;
            re--;
            ce--;
         }



        }

    }

