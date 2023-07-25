import java.util.*;


public class functinfactorial {
    public static void printfactorial(int n){
        //negative number
        if(n<0){
            System.out.println("Inavlid");
        }
        int factorial=1;
        //factorial
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }
    public static void main(String[] args){
        System.out.println("Enter the factorial number u want :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printfactorial(n);

    }
}
