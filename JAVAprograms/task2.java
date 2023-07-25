import java.util.*;


public class task2{
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter the numbers a and b :");
        Scanner num=new Scanner(System.in);
        a =num.nextInt();
        b =num.nextInt();
        if(a==b){
            System.out.println(" a and b are equal!");
        }
        else if(a<b) {
            System.out.println(" a is less than b!");
        }
        else if(a>b) {
            System.out.println(" a is greater than b!");
        }

    }

}
