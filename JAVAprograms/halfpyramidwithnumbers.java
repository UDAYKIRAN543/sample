import java.util.*;



public class halfpyramidwithnumbers {
    public static void main(String[] args){
        System.out.println("Enter the number of rows want to print : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        int j=1;
        for(i=1;i<=num ;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
