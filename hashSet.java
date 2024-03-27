import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // adding elements in hashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);

        // size of set
        System.out.println(set.size());

        // contains method
        if (set.contains(3)) {
            System.out.println("3 is present in the set");
        }

        // deleting an element
        set.remove(6);
        set.remove(3);
        System.out.println(set);

        // iterating over set

        Iterator it = set.iterator();

        for (int i = 0; i < set.size(); i++) {
            System.out.println(it.next());
        }

        //or

        Iterator it2 = set.iterator();

        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }

        System.out.println();
        // empty method

        boolean emp = set.isEmpty();

        System.out.println(emp);



    }
    
}
