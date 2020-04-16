package ClassesAndObjects;

import ClassesAndObjects.Cat;

public class CatTester {
    public static void main(String[] args) {
            Cat tom = new Cat("Tom");

        tom.eat("Milk");
        tom.eat("Mouse");
        tom.sleep(5);
        tom.isHungry();
        tom.eat("Mouse");
        tom.isHungry();
        tom.play("Ball");

        }
}
