package ClassesAndObjects;

public class Cat {
    private String name;
    private boolean isHungry = true;
    public Cat(String name) {
        this.name = name;

    }
    public void isHungry() {
        if (isHungry) {
            System.out.println(name + " is hungry");
        } else {
            System.out.println(name + " is not hungry");
        }
    }

    public void play(String toyName) {
    System.out.println(name + " is playing around with " + toyName);
    }

    public void eat(String mealName) {
        if (isHungry) {
            System.out.println(name + " is eating " + mealName);
            isHungry = false;
        } else {
            System.out.println(name + " is not hungry ");
        }
    }
    public void sleep(Integer sleepTime) {
        System.out.println(name + " is going to sleep for " + sleepTime + " hours");
        isHungry = true;
    }
}