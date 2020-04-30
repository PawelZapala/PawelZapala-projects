package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {
    public static void main(String[] args) {
        Map<Integer, Part> catalogue = new HashMap<>();
        catalogue.put(1, new Part(1, "rims", "Audi"));
        catalogue.put(2,new Part(2, "tires", "Michelin"));
        catalogue.put(3,new Part(3, "turbine", "Garrett"));
        catalogue.put(4,new Part(4, "wipers", "Berno"));
        catalogue.put(5,new Part(5, "brake pads", "Breyko"));
        catalogue.put(6,new Part(6, "windshield washer fluid", "Claren"));

        System.out.println(catalogue);
        System.out.println(catalogue.get(1));

    }
}
