package OOPPrinciples;

import OOPPrinciples.Student;

import java.time.LocalDate;

public class PersonAndStudentTester {
    public static void main(String[] args)
    {
        Student pawel = new Student("Pawel", "Zapala", LocalDate.parse("1994-05-19"), "Geodesy and Cartography", LocalDate.parse("2018-06-30"));
        pawel.getFirstName();
        pawel.setFirstName("Pawel");
        pawel.getLastName();
        pawel.setLastName("Zapala");
        pawel.getBirthDate();
        pawel.setBirthDate(LocalDate.parse("1994-05-19"));
        pawel.getFaculty();
        pawel.setFaculty("Geodesy and Cartography");
        pawel.getGraduateYear();
        pawel.setGraduateYear(LocalDate.parse("2018-06-30"));
        System.out.println(pawel);
    }
}
