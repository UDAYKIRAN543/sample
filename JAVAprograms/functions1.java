import java.util.*;




public class functions1 {
    public static int printSum(int a,int b){
//        int a, b;
//        System.out.println("Enter the first number :");
//        Scanner sc=new Scanner(System.in);
//        a=sc.nextInt();
//        System.out.println("Enter the second number :");
//        b=sc.nextInt();
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        int a,b;
        a=9;
        b=20;
        int sum=printSum(a,b);
        System.out.println("The sum of two numbers "+sum);
    }



}
