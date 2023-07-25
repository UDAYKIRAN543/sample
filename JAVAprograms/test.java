import java.util.*;


public class test {

    public static void main(String[] args){
        String name="uday kiran";
        System.out.println(name);

        String name1="tej";
        System.out.println(name+" "+name1);

        System.out.println(name.length());

        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));

        }
        if(name.compareTo(name1) == 0){
            System.out.println("They are equal");}
        else{
            System.out.println("They are not equal");
        }

        String sub=name.substring(0,6);
        System.out.println(sub);

    }
}
