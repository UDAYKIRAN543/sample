import java.util.*;


public class task3 {
    public static void main(String[] args){
        int a;
        System.out.println("enter the number");
        Scanner num=new Scanner(System.in);
        a=num.nextInt();

        switch(a){
            case 1:
                System.out.println("Hello !");
                break;
            case 2:
                System.out.println("Namasthe!");
                break;
            case 3:
                System.out.println("Bonjur!");
            default :
                System.out.println("Invalid!");

        }
    }
}
