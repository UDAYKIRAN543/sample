import javax.sound.midi.Soundbank;
import java.util.*;


public class array2d {
    public static void main(String[] args){
        int n,m;
        System.out.println("Enter the number of rows and columns required :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the number of columns u want in matrix :");
        m=sc.nextInt();
        int marks[][]=new int[n][m];
        System.out.println("Enter data u want in "+n+" rows and "+m+" columns !");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
            marks[i][j]=sc.nextInt();}
        }
        System.out.println("The resultant matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(marks[i][j]+" ");

            }
            System.out.println();
        }
        }
    }

