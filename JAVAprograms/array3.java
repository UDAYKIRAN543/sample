import java.util.*;



public class array3{
    public static void main(String args[]){
        System.out.println("Enter the size of array :");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int marks[]=new int[size];


        //input
        System.out.println("Enter the numbers in array :");
        for (int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("The numbers u  entered in array:");
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Enter the number u want to search :");
        Scanner num=new Scanner(System.in);
        int search=num.nextInt();
        int flag=0;
        for(int i=0;i<size;i++){
            if(marks[i]==search) {
                System.out.println("The number u entered found at index" + " "+i);
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Invalid number");
        }



    }
}
