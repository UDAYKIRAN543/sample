import java.util.*;


public class task4 {
    public static void main(String[] args){
        System.out.println("Enter the number :");
        Scanner num=new Scanner(System.in);
        int a=num.nextInt();
        int i=0;
        int sum=0;
        for(i=1;i<=a;i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }


}
