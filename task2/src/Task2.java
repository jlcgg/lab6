import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class StudentRecord {
    private final String number;
    private final String name;
    private final int grade;

    public StudentRecord(final String number, final String name, final int grade) {
        this.number = number;
        this.name = name;
        this.grade = grade;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

class StudentRecordPrint implements Consumer<StudentRecord> {
    @Override
    public void accept(final StudentRecord studentRecord) {
        System.out.println(studentRecord.getNumber() + " " + studentRecord.getGrade());
    }
}

public class Task2 {
    public static void main(String[] args) {
        List<StudentRecord> records = Arrays.asList(
                new StudentRecord("1", "Alice", 14),
                new StudentRecord("2", "Trudy", 17),
                new StudentRecord("3", "Bob", 8),
                new StudentRecord("4", "Anna", 12),
                new StudentRecord("5", "James", 15)
        );

        StudentRecordPrint studentRecordPrint = new StudentRecordPrint();
        records.forEach(studentRecord -> System.out.println(studentRecord.getNumber() + " " + studentRecord.getGrade()));
    }
}
