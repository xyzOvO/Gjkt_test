package jihe_test;

import java.util.HashSet;
import java.util.Set;

public class test_07 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student s1 = new Student("1",1,1);
        Student s2 = new Student("2",2,2);
        Student s3 = new Student("3",3,3);
        Student s4 = new Student("3",3,3);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
