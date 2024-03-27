package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class comparable {

    public static void main(String[] args) {
        ArrayList<emp> Emps = new ArrayList<>();

        Emps.add(new emp("Amey", "123", 3));
        Emps.add(new emp("Aman", "124", 2));
        Emps.add(new emp("Anuj", "125", 1));

        System.err.println(Emps);
         
        Collections.sort(Emps);

        System.out.println(Emps);

        ArrayList<emp> Emps2 = new ArrayList<>(Emps);
        
        Collections.sort(Emps2, new nameComparator());

        System.out.println(Emps2);

    }
}
