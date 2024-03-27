package comparable;

import java.util.Comparator;

public class nameComparator implements Comparator<emp>{

    @Override
    public int compare(emp o1, emp o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
