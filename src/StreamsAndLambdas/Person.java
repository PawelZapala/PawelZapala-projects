package StreamsAndLambdas;

import java.time.LocalDate;
import java.util.Objects;

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public int getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return salary == person.salary &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthday, person.birthday) &&
                sex == person.sex &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthday, sex, salary, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
