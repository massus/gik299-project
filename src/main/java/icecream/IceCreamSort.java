
package icecream;

import java.util.Comparator;

public class IceCreamSort implements Comparator<IceCream> {
    @Override
    public int compare(IceCream a, IceCream b) {
        int sort = 0;
        if (a != null && b != null) {
            sort = a.getBrand().compareTo(b.getBrand());
        }
        return sort;
    }
}