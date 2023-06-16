package Controller;

import Model.TrainingGroup;
import Model.Teacher;
import Model.Student;
import Service.TrainingGroupService;

import java.util.List;

public class Controller {
    private TrainingGroupService trainingGroupService;

    public Controller() {
        trainingGroupService = new TrainingGroupService();
    }

    public TrainingGroup createTrainingGroup(List<Student> students, Teacher teacher) {
        return trainingGroupService.createTrainingGroup(students, teacher);
    }
}
