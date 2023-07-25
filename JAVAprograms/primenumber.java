import java.util.*;



public class primenumber {
    public static void main(String[] args){
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num==1){
            System.out.println("The number you entered is not a prime!");
        }
        else{
            int k=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    k++;
            }
            }
            if(k==2){
                System.out.println("The number you entered is a prime number");
            }
            else{
                System.out.println("The number you enterd is not a prime number");

            }
        }
    }
}
