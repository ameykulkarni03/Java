package book;

import java.util.Comparator;

public class priceComparator implements Comparator<book>{

    @Override
    public int compare(book o1, book o2) {
        return o1.getPrice() - o2.getPrice();
    }

}
