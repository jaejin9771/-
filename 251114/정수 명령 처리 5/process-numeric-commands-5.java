import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        ArrayList<Integer> arr = new ArrayList<>();
        int a;

        for(int i=0; i<n; i++){
            String cm = sc.next();

            switch (cm) {
                case "push_back":
                a = sc.nextInt();
                arr.add(a);
                break;

                case "pop_back":
                if(arr.size()==0) break;
                arr.remove(arr.size()-1);
                break;

                case "size":
                System.out.println(arr.size());
                break;

                case "get":
                a = sc.nextInt();
                System.out.println(arr.get(a-1));
                break;
            }
        }

    }
}