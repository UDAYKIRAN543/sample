import java.util.*;



public class array2{
    public static void main(String args[]){
        System.out.println("Enter the size of array :");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int marks[]=new int[size];


        //input
        System.out.println("Enter the numbers in array :");
        for (int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }



    }
}
