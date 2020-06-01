package StreamsAndLambdas;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private  String lastName;
    private LocalDate birthday;
    private Sex sex;
    private int salary;
    private Address address;

    public Person(String firstName, String lastName, LocalDate birthday, Sex sex, int salary, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.sex = sex;
        this.salary = salary;
        this.address = address;
    }
}
