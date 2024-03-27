package comparable;

import java.util.Comparator;

public class IdComparator implements Comparator<emp>{

    @Override
    public int compare(emp o1, emp o2) {
        return o1.getID() - o2.getID();
    }
    
}
