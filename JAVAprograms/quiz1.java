import java.util.*;

public class quiz1 {
    public static void main(String args[]) {
        System.out.println("Enter the first number a:");
        Scanner first=new Scanner(System.in);
        int a=first.nextInt();
        System.out.println("Enter the second number b:");
        Scanner second=new Scanner(System.in);
        int b=second.nextInt();
        int mul=a*b;
        int sum=a+b;
        int task=(mul/sum);
        System.out.println(task);


    }
}

