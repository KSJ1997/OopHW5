package Model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;

    public Student(LocalDate dateOfBirth, String firstName, String lastName) {
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
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(dateOfBirth, student.dateOfBirth) &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfBirth, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "dateOfBirth=" + dateOfBirth +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
