import java.util.*;
import java.io.*;

class loop {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum = sum + b;
                System.out.print(sum + " ");
                b = b * 2;
            }
            System.out.println();
        }
    }
}