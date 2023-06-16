package Model;

import java.time.LocalDate;
import java.util.Objects;

public class Teacher {
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;

    public Teacher(LocalDate dateOfBirth, String firstName, String lastName) {
        this.dateOfBirth = Objects.requireNonNull(dateOfBirth);
        this.firstName = Objects.requireNonNull(firstName);
        this.lastName = Objects.requireNonNull(lastName);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(dateOfBirth, teacher.dateOfBirth) &&
                Objects.equals(firstName, teacher.firstName) &&
                Objects.equals(lastName, teacher.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfBirth, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "dateOfBirth=" + dateOfBirth +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
