package Generics.BoxesandShelves;


public class Tester {
    public static void main(String[] args) {
        Box<Toy> toysBox = new Box<>();
        toysBox.add(new Toy("LEGO"));
        toysBox.add(new Toy("Hot wheels"));
        Box<Food> foodsBox = new Box<>();
        foodsBox.add(new Food("Bułka"));
        foodsBox.add(new Food("Banan"));
        Box<Book> booksBox = new Box<>();
        booksBox.add(new Book("JAVA. HEAD FIRST"));
        booksBox.add(new Book("Czysty kod"));
        Box<Fantasy> fantasyBooksBox = new Box<>();
        fantasyBooksBox.add(new Fantasy("Harry Potter"));
        fantasyBooksBox.add(new Fantasy("The Lord of the rings"));

        Shelf<Toy> shelf1 = new Shelf<>();
        shelf1.add(toysBox);
        System.out.println(shelf1);

        System.out.println("=========");

        Shelf<Book> shelf2 = new Shelf<>();
        shelf2.add(booksBox);
        shelf2.add(fantasyBooksBox);
        System.out.println(shelf2);

        System.out.println("===========");

        Shelf<Item> shelf3 = new Shelf<>();
        shelf3.add(toysBox);
        shelf3.add(foodsBox);
        shelf3.add(booksBox);
        shelf3.add(fantasyBooksBox);
        System.out.println(shelf3);

    }
}