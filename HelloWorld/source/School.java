import java.util.ArrayList;
import java.util.List;

public class School {
    private final List<Student> students = new ArrayList<>();
    private final List<String> teachers = new ArrayList<>();

    public class Student {
        private final String name;
        private final int age;
        private final String classes;

        public Student(String name, int age, String classes) {
            this.name = name;
            this.age = age;
            this.classes = classes;
        }

        @Override
        public String toString() {
            return String.format("Studerende: %s, Alder: %d, Klasser: %s", name, age, classes);
        }
    }

    public void addStudent(String name, int age, String classes) {
        students.add(new Student(name, age, classes));
        System.out.println(name + " er tilføjet til skolen.");
    }

    public void addTeacher(String name) {
        teachers.add(name);
        System.out.println(name + " er tilføjet som lærer.");
    }

    public void displayStudents() {
        students.forEach(student -> System.out.println(student));
    }

    public static void main(String[] args) {
        School school = new School();

        school.addStudent("Bailey", 18, "Matematik");
        school.addStudent("Cris", 21, "Engelsk");
        school.addStudent("Matthew", 19, "Naturvidenskab");

        school.addTeacher("Hr. Smith");
        school.addTeacher("Fru. Johnson");

        school.displayStudents();
    }
}
