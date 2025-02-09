package lesson_14_homework.Task3;
import java.util.Arrays;

public class StudentInitializer {
    public void initializeStudents(StudentManager studentManager) {

        studentManager.addStudent(new Student("Иван", "Группа A", 1, Arrays.asList(3, 4, 5)));
        studentManager.addStudent(new Student("Анна", "Группа B", 2, Arrays.asList(2, 2, 4)));
        studentManager.addStudent(new Student("Петр", "Группа A", 1, Arrays.asList(5, 5, 5)));
        studentManager.addStudent(new Student("Мария", "Группа C", 3, Arrays.asList(1, 2, 2)));


        studentManager.removeLowAverageStudents();


        studentManager.printStudents(1);
    }
}
