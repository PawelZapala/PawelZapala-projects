import java.time.LocalDate;

public class Student extends Person {
    private String faculty;
    private LocalDate graduateYear;
    public Student (String firstName, String lastName, LocalDate birthDate, String faculty, LocalDate graduateYear){
        super(firstName, lastName, birthDate);
        this.faculty = faculty;
        this.graduateYear = graduateYear;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public LocalDate getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(LocalDate graduateYear) {
        this.graduateYear = graduateYear;
    }
}
