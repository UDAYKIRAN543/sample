import java.util.*;


public class stringreverse {

    public static void main(String[] args) {
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        StringBuilder st= new StringBuilder(string);

        for (int i = 0; i < st.length() / 2; i++) {
            int front = i;
            int back = st.length() - 1 - i;

            char frontchar = st.charAt(front);
            char backchar = st.charAt(back);

            st.setCharAt(front,backchar);
            st.setCharAt(back, frontchar);


        }
        System.out.println(st);


    }

}

