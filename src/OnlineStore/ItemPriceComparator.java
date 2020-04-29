package OnlineStore;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {
        return Double.compare(item1.getPrice(), item2.getPrice());
    }
}
