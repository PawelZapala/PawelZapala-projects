package StreamsAndLambdas;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Tester {
    public static void main(String[] args) {
        Person p1 = new Person
                ("Aleksandra", "Budziosz", LocalDate.of(1994, 7, 30),
                        Sex.FEMALE, 2000, new Address("Kraków"));

        Person p2 = new Person
                ("Robert", "Koza", LocalDate.of(1944, 12, 12),
                        Sex.MALE, 3500, new Address("Kielce"));

        Person p3 = new Person
                ("Zofia", "Dąbek", LocalDate.of(1932, 3, 25),
                        Sex.FEMALE, 2500, new Address("Poznań"));

        Person p4 = new Person
                ("Jolanta", "Pachoń", LocalDate.of(2004, 4, 7),
                        Sex.FEMALE, 3000, new Address("Kraków"));

        Person p5 = new Person
                ("Dorota", "Kowalska", LocalDate.of(1970, 10, 10),
                        Sex.FEMALE, 5500, new Address("Gdańsk"));

        Person p6 = new Person
                ("Wojciech", "Gola", LocalDate.of(1987, 9, 19),
                        Sex.MALE, 4000, new Address("Warszawa"));

        Person p7 = new Person
                ("Arnold", "Schwarzenegger", LocalDate.of(1947, 7, 30),
                        Sex.MALE, 10000, new Address("Kraków"));

        List<Person> people = List.of(p1, p2, p3, p4, p5, p6, p7);

        List<String> menOver65 = people.stream()
                .filter(p -> p.getBirthday().isBefore(LocalDate.now().minusYears(65)))
                .filter(p -> p.getSex().equals(Sex.MALE))
                .map(p -> p.getLastName())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Men over 65 years old sorted in reverse order by last name: ");
        System.out.println(menOver65);

        System.out.println("===============");

        List<String> femaleSalaryUnder5000 = people.stream()
                .filter(p -> p.getSalary() < 5000)
                .filter(p -> p.getSex().equals(Sex.FEMALE))
                .map(Person::getFirstName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Females earning less than 5000 PLN");
        System.out.println(femaleSalaryUnder5000);

        System.out.println("===============");

        List<LocalDate> peopleUnder18 = people.stream()
                .filter(p -> p.getBirthday().isAfter(LocalDate.now().minusYears(18)))
                .filter(p -> p.getAddress().getCity().equals("Kraków"))
                .map(Person::getBirthday)
                .collect(Collectors.toList());
        System.out.println("People under 18 years old from Kraków:");
        System.out.println(peopleUnder18);

        System.out.println("===============");

        Stream<Person> stream= people.stream();
        List<String> outsideOfKrakow = stream
                .filter(p -> !p.getAddress().getCity().equals("Kraków"))
                .map(Person::getFirstName)
                .collect(Collectors.toList());
        System.out.println("People outside of Kraków:");
        System.out.println(outsideOfKrakow);

        System.out.println("===============");

        OptionalDouble avgSalary = people.stream()
                .mapToInt(p -> p.getSalary())
                .average();
        if (avgSalary.isPresent()){
            System.out.println("Average salary: ");
            System.out.println(avgSalary.getAsDouble());
        }

        System.out.println("===============");

        long numberOfWomenInKrk = people.stream()
                .filter(p -> p.getAddress().getCity().equals("Kraków"))
                .filter(p -> p.getSex().equals(Sex.FEMALE))
                .count();
        System.out.println("Number of women in Kraków:");
        System.out.println(numberOfWomenInKrk);

        System.out.println("===============");

        long numberOfMenOver65 = people.stream()
                .filter(p -> p.getBirthday().isBefore(LocalDate.now().minusYears(65)))
                .filter(p -> p.getSex().equals(Sex.MALE))
                .count();
        System.out.println("Number of men over 65 years old:");
        System.out.println(numberOfMenOver65);

        System.out.println("===============");

        Optional<LocalDate> oldestPerson = people.stream()
                .map(p -> p.getBirthday())
                .min(Comparator.naturalOrder());
        System.out.println(oldestPerson);
    }
}
