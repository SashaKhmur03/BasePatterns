package factory;

public class School {
    public static void main(String[] args) {
        StudentFactory studentFactory = createStudentBySubject("Math");
        Student student = studentFactory.createStudent();

        student.study();
    }

    static StudentFactory createStudentBySubject(String subject) {
        if (subject.equalsIgnoreCase("Chemistry")) {
            return new ChemistFactory();
        } else if (subject.equalsIgnoreCase("Math")) {
            return new MathematicianFactory();
        } else {
        throw new RuntimeException(subject + "Invalid subject");
        }
    }
}
