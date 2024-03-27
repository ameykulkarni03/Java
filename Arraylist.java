import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // adding
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        //accessing
        int num = list.get(0);

        System.out.println(num);

        //adding num in between
        list.add(1, 15);
        System.out.println(list);

        //changing element of list
        list.set(2,21);
        System.out.println(list);

        //deleting element
        list.remove(2);
        System.out.println(list);

        ArrayList<String> str = new ArrayList<>();

        str.add("my");
        str.add("name");
        str.add("is");
        str.add("amey");

        System.out.println(str);

        //sorting arraylist
        Collections.sort(str);
        System.out.println(str);

    }
}
