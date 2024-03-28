package book;

import java.util.Comparator;

public class authComparator implements Comparator<book>{

    @Override
    public int compare(book o1, book o2) {
        return o1.getAuthName().compareTo(o2.getAuthName());
    }
    
}
