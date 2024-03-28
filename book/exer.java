package book;

import java.util.ArrayList;
import java.util.Collections;

public class exer {
    
    public static void main(String[] args) {
        
        ArrayList<book> books1 = new ArrayList<>();

        books1.add(new book("RD Sharma", "Amey Kulkarni", 1000));
        books1.add(new book("NCERT", "XYZ", 300));
        books1.add(new book("Exemplar", "ABC", 200));
        books1.add(new book("RS Aggarwal", "Ramesh Sharma", 800));

        ArrayList<book> books2 = new ArrayList<>(books1);

        ArrayList<book> books3 = new ArrayList<>(books1);

        Collections.sort(books1, new titleComparator());

        Collections.sort(books2, new authComparator());

        Collections.sort(books3, new priceComparator());

        System.out.println(books1);
        System.out.println(books2);
        System.out.println(books3);


    }
}
