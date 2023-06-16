package Service;

import Model.TrainingGroup;
import Model.Teacher;
import Model.Student;

import java.util.List;

public class TrainingGroupService {
    public TrainingGroup createTrainingGroup(List<Student> students, Teacher teacher) {
        return new TrainingGroup(teacher, students);
    }
}
