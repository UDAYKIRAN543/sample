import java.util.*;


public class selectionsort {
    public static void  printresult(int size,int array[]) {
        System.out.println("And the bubble sorted array is :");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the array size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int array[] = new int[size];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for(int i=0;i<size-1;i++){
            int smallest=i;
            for(int j=i+1;j<size;j++){
                if(array[smallest]>array[j]){
                smallest=j;}
            }
            int temp=array[smallest];
            array[smallest]=array[i];
            array[i]=temp;
        }
        printresult(size,array);

    }
}
