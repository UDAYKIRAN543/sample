import java.util.*;


public class bublesort {
            public static void  printtheresult(int size,int array[]) {
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
//        Time complexity=O(n^2)

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }

        }printtheresult(size,array);

        }
}
