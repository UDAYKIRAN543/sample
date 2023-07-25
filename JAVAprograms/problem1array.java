import java.util.*;

//elements in second array is present in 1st array or not

public class problem1array {
    public static void main(String[] args){
        System.out.print("Enter the size of the : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];

        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the size of the 2nd array : " );
        //System.out.println("The second array should be less than the first array length !!");


        int size1=sc.nextInt();
        int[] array1=new int[size1];

        for(int i=0;i<size1;i++){
            array1[i]=sc.nextInt();
        }
        int[] array3=new int[size1];
        int k=0;
        for(int i=0;i<size1;i++){
            for(int j=0;j<size;j++) {
                if (array1[i] == array[j]) {
                    k++;
                }
            }
            array3[i]=k;
            k=0;
        }
        for(int i=0;i<size1;i++){
            System.out.print("No.of ocurance of 2nd elements in 1st array " +array3[i]+" ");
        }




    }



}
