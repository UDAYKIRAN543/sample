import java.util.*;



public class problem2arrayduplicate {
    public static void main(String[] args) {
        System.out.print("Enter the size of the : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("And the duplicate array elements from the given array are : ");


//        int[] arr1;
//        int k=0;
        for (int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if (array[j]>array[j+1]){
//                    swap
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        int[] arr=new int[size];
        int p=0;
        for (int i = 0; i < size-1; i++){
            for(int j=i+1;j<size;j++){
                if(array[i]==array[j]){
                    arr[p]=array[j];
                    p++;
                }
            }
        }
        int m=0;
        for(int i=0;i<p-1;i++){
            if(arr[i]!=arr[i+1]){
                array[m]=arr[i];
                m++;
            }
        }
        array[m]=arr[p-1];
        m++;
        for(int i=0;i<m;i++) {
            System.out.print(array[i] + " ");

        }
    }
}


