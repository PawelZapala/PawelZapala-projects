package Generics.BoxesandShelves;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Box<T> {

    Collection<T> items = new ArrayList<>();

    public void add(T item) {
            items.add(item);
    }

    public Collection<T> getItems() {
        return new ArrayList<>(items);
    }
}