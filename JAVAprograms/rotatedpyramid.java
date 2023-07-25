import java.util.*;




public class rotatedpyramid {
    public static void main(String[] args){
        System.out.println("Enter the number of rows want to print : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        int j=1;
        //outer loop
        for(i=1;i<=num ;i++){
            //print space
            for(j=1; j<=num-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
