import java.util.*;

class passingArrayAsArgument {
    public static void changeMarks(int marks[]){
        for (int i=0;i<marks.length;i++){
            marks[i]+= 1;
        }
    }


    public static void main(String[] args) {
        int marks[] = new int [3];
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS OF P ,C, M ");

        for(int i=0;i<marks.length;i++){
            marks[i]= scn.nextInt();
        }
    
        changeMarks(marks);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}