package book;

import java.util.Comparator;

public class titleComparator implements Comparator<book>{

    @Override
    public int compare(book o1, book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
    
}
