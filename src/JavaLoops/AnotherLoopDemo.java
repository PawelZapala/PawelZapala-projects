package JavaLoops;

public class AnotherLoopDemo {
    public static void main(String[] args) {
        String[] listOfItemsToBuy = {"Makarony", "Papier toaletowy", "Mięso", "Parówki"};
        for (int i = 0; i< listOfItemsToBuy.length; i++) {
            System.out.println(listOfItemsToBuy[i]);
        }
        System.out.println("=========ENHANCED FOR LOOP BELOW========");
        for (String item : listOfItemsToBuy) {
            System.out.println(item);
        }

        int[][] numbers = {{1, 2, 3}, {4,5}, {6}, {7, 8, 9, 10}};
    }
}
