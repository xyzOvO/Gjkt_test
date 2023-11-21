package jihe_test;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int height;

    public Student(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && height == student.height && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //如果左边对象大于右边对象返回正整数
        //如果左边对象大于右边对象返回负整数
        //如果左边对象大于右边对象返回0
        //需求：按照年龄升序排序
        return this.age - o.age;
    }
}
