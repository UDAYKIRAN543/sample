import java.util.*;

//*******
//*******
//*******


public class solidrectanglejava {
    public static void main(String[] args) {
        int i, j,n,m;
        System.out.println("Enter number of rows :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter number columns :");
        m=sc.nextInt();
        //outer loop
        for (i = 0; i < n; i++) {
            //inner loop
            for (j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
