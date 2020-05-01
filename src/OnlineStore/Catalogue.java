package OnlineStore;

import java.util.*;

public class Catalogue {
    public static void main(String[] args) {
        Item shirt = new Item("Shirt", 59.99);
        Item blouse = new Item("Blouse", 159.99);
        Item trousers = new Item("Trousers", 199.99);
        Item airMax = new Item("AirMax", 499.99);
        Item airJordan = new Item("Air Jordan", 599.99);


        List<Item> listOfItems = new ArrayList<>();
        listOfItems.add(shirt);
        listOfItems.add(blouse);
        listOfItems.add(trousers);
        listOfItems.add(airMax);
        listOfItems.add(airJordan);
        System.out.println(listOfItems);
        System.out.println("====================");

        listOfItems.sort(new ItemNameComparator());
        System.out.println("Items sorted by name:");
        System.out.println(listOfItems);
        listOfItems.sort(new ItemNameComparator().reversed());
        System.out.println("Items sorted by name in reverse order:");
        System.out.println(listOfItems);

        System.out.println("====================");

        listOfItems.sort(new ItemPriceComparator());
        System.out.println("Items sorted from the cheapest to the most expensive:");
        System.out.println(listOfItems);
        listOfItems.sort(new ItemPriceComparator().reversed());
        System.out.println("Items sorted from the most expensive to the cheapest:");
        System.out.println(listOfItems);

        System.out.println("====================");

        listOfItems.sort(Comparator.naturalOrder());
        System.out.println("Items sorted from the cheapest to the most expensive:");
        System.out.println(listOfItems);
        listOfItems.sort(Comparator.reverseOrder());
        System.out.println("Items sorted from the most expensive to the cheapest:");
        System.out.println(listOfItems);


    }
}
