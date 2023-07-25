import java.util.*;


public class invertedhalfpyramid {
    public static void main(String[] args){
        System.out.println("Enter the number of rows want to print : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        int j=1;
        for(i=num;i>=1 ;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
