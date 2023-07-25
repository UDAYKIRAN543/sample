import java.util.*;


public class age {
    public static void main(String args[]){
        System.out.println("Enter your age:");
        Scanner num=new Scanner(System.in);
        int age=num.nextInt();
        if(age>18){
            System.out.println("You are Major!");
        }
        else{
            System.out.println("You are under age!");
        }

    }
}
