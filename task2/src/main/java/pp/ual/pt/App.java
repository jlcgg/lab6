package pp.ual.pt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class StudentRecord{
    private int number;
    private String name;
    private int grade;

    public StudentRecord(int number, String name, int grade){
        this.number = number;
        this.name = name;
        this.grade = grade;
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    @Override
    public String toString(){
        return number + " " + name;
    }
}

class PrintConsumer implements Consumer<StudentRecord> {

    @Override
    public void accept(StudentRecord studentRecord) {
        System.out.println(studentRecord.getNumber() + " " + studentRecord.getGrade());
    }
}

class TestStudent implements Predicate<Integer> {

    @Override
    public boolean test(Integer grade) {
        return grade < 10;
    }
}

public class App 
{
    public static void main( String[] args )
    {
        List<StudentRecord> studentRecordList = new ArrayList<>();
        studentRecordList.add(new StudentRecord(1, "Alice", 14));
        studentRecordList.add(new StudentRecord(2, "Trudy", 17));
        studentRecordList.add(new StudentRecord(3, "Bob", 8));
        studentRecordList.add(new StudentRecord(4, "Anna", 12));
        studentRecordList.add(new StudentRecord(5, "James", 15));
/*
        Iterator<StudentRecord> iterator = studentRecordList.iterator();

        while (iterator.hasNext()){
            StudentRecord studentRecord = iterator.next();
            new PrintConsumer().accept(studentRecord);

        }*/

        // versão curta com lambda e stream
        studentRecordList.stream().forEach(studentRecord -> new PrintConsumer().accept(studentRecord));

        studentRecordList.stream().filter(studentRecord -> new TestStudent().test(studentRecord.getGrade())).forEach(System.out::println);

    }

}
