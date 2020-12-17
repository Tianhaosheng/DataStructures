package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {


        Student student1 = new Student("张三", 12, 23);
        Student student2 = new Student("李四", 13, 45);
        Student student3 = new Student("王五", 12, 11);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        List<Student> collect = students.stream()
                .filter(student -> student.getAge() == 12)
                .collect(Collectors.toList());

        for(Student s : collect){
            System.out.println(s);
        }


    }
}
