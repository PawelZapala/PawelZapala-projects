import java.time.LocalDate;

public class Person{
    private String FirstName;
    private String LastName;
    private LocalDate BirthDate;

    public Person (String FirstName, String LastName, LocalDate BirthDate){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.BirthDate = BirthDate;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }
}
