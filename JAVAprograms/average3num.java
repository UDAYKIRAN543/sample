import java.util.*;



public class average3num {
    public static int average(int a,int b,int c){
        int average=(a+b+c)/3;
        System.out.println(average);
        return average;
    }
    public static void main(String[] args){
        System.out.println("Enter the first Number :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the Second Number :");
        int b=sc.nextInt();
        System.out.println("Enter the Third Number :");
        int c=sc.nextInt();

        average(a,b,c);

    }

}
