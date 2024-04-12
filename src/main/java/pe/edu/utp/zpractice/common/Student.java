package pe.edu.utp.zpractice.common;

import java.io.Serializable;
import java.util.Objects;

public class Student {
    private final String name;
    private final int age;
    private final String course;

    private Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public static Student valueOf(String name, int age, String course) {
        return new Student(name, age, course);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}
