import java.util.*;


public class primenumbers2 {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int c=2;
        int n=0;

        if(num==1){
            System.out.println("The number you entered is not a prime number!");
        }
        while(c*c<=n){
            if(num%c==0){
                System.out.println("The number is not prime!");
                n=1;
                break;
            }
            c+=1;
        }if(n==0);
        {
            System.out.println("The number is a prime number!");
        }

    }
}
