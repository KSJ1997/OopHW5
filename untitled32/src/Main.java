import Controller.Controller;
import Model.Student;
import Model.Teacher;
import Model.TrainingGroup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание контроллера
        Controller controller = new Controller();

        // Создание списка студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student(LocalDate.of(2000, 1, 1), "Иван", "Иванов"));
        students.add(new Student(LocalDate.of(2001, 2, 2), "Петр", "Петров"));

        // Создание преподавателя
        Teacher teacher = new Teacher(LocalDate.of(1980, 5, 10), "Сергей", "Сергеев");

        // Создание группы обучения с использованием сервиса
        TrainingGroup trainingGroup = controller.createTrainingGroup(students, teacher);

        // Вывод информации о группе
        System.out.println(trainingGroup);
    }
}
