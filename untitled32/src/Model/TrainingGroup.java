package Model;

import java.util.List;
import java.util.Objects;

public class TrainingGroup {
    private Teacher teacher;
    private List<Student> students;

    public TrainingGroup(Teacher teacher, List<Student> students) {
        this.teacher = Objects.requireNonNull(teacher);
        this.students = Objects.requireNonNull(students);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TrainingGroup)) return false;
        TrainingGroup group = (TrainingGroup) o;
        return Objects.equals(teacher, group.teacher) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacher, students);
    }

    @Override
    public String toString() {
        return "TrainingGroup{" +
                "teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
