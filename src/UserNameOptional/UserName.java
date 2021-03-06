package UserNameOptional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class UserName {
    public static void main(String[] args) {
        Person p1 = new Person("Konrad", "Berkowicz", LocalDate.of(1985, 2,10));
        Person p2 = new Person("Adam", "Ostrowski", LocalDate.of(1980, 5,18));
        Person p3 = new Person("Ryszard", "Andrzejewski", LocalDate.of(1976, 9,17));
        Person p4 = new Person("Wojciech", "Sokół", LocalDate.of(1977, 3,11));
        Person p5 = new Person("Piotr", "Siara", LocalDate.of(1983, 9,15));
        Person p6 = new Person("Jerzy", "Kiler", null);

        List<Person> people = List.of(p1,p2,p3,p4,p5,p6);

        for(Person person : people) {
                System.out.println(new UserName().userName(person));
            }
        }

    private String userName(Person person) {
        return (person.getFirstName().toLowerCase().charAt(0) + person.getLastName().toLowerCase() + Optional.ofNullable(person.getBirthday()).orElse(LocalDate.now()).getYear());
    }
}
