package Generics.BoxesandShelves;


public class Tester {
    public static void main(String[] args) {
        Box<Toy> toysBox = new Box<>();
        toysBox.add("toy");
        Box<Food> foodsBox = new Box<>();
        Box<Book> booksBox = new Box<>();
        Box<Fantasy> fantasyBooksBox = new Box<>();

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