public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void isHungry() {
        System.out.println(name + " is hungry");
    }

    public void play(String toyName) {
        System.out.println(name + " is playing around with " + toyName);
    }

    public void eat(String mealName) {
        System.out.println(name + " is eating " + mealName);
    }
    public void sleep(Integer sleepTime) {
        System.out.println(name + " is going to sleep for " + sleepTime + " hours");
    }
}