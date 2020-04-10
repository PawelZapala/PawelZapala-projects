import java.time.LocalDate;

public class Student extends Person {
    private String Faculty;
    private LocalDate GraduateYear;
    public Student (String FirstName, String LastName, LocalDate BirthDate, String Faculty, LocalDate GraduateYear){
        super(FirstName, LastName, BirthDate);
        this.Faculty = Faculty;
        this.GraduateYear = GraduateYear;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public LocalDate getGraduateYear() {
        return GraduateYear;
    }

    public void setGraduateYear(LocalDate graduateYear) {
        GraduateYear = graduateYear;
    }
    
}
