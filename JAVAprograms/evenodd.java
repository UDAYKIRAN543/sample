import java.util.*;


public class evenodd {
    public static void main(String[] args){
        int a;
        System.out.println("Enter the number :");
        Scanner num=new Scanner(System.in);
        a =num.nextInt();
        if((a%2)==0){
            System.out.println("The given number is even number!");
        }
        else{
            System.out.println("The given number is a negative number!");
        }


    }

}
