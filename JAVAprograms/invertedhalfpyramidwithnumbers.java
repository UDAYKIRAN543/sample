import java.util.*;



public class invertedhalfpyramidwithnumbers {
    public static void main(String[] args){
        System.out.println("Enter the number of pyramid numbers you want to : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,j;
        for (i=num;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
