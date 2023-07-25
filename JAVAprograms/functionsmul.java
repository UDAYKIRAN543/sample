import java.util.*;


public class functionsmul {
    public static int calculatemul(int a,int b){
        int mul = a * b;
        return mul;
    }
    public static void main(String[] args ){
        int a,b;
        System.out.println("Enter the first number :");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter the second number :");
        b=sc.nextInt();
        int mul=calculatemul(a,b);
        System.out.println("The multiplicatin of two numbers :"+mul);



    }

}
