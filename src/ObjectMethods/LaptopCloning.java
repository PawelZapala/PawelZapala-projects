package ObjectMethods;

public class LaptopCloning extends Object{
    public static void main(String[] args) throws CloneNotSupportedException {
        Processor processor = new Processor("Intel Core i5", 1.8, 4);
        HardDrive hardDrive = new HardDrive("Hard Drive", "SSD", 256);
        Laptop laptop = new Laptop("ASUS", processor, hardDrive, 15.2, 2, 8);
        Laptop clonedLaptop = (Laptop) laptop.clone();
        System.out.println(clonedLaptop);
        System.out.println(laptop);
        clonedLaptop.name = ("Lenovo");
        System.out.println(clonedLaptop);
    }
}
