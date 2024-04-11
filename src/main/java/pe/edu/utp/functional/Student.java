package pe.edu.utp.functional;

import static com.google.common.base.Preconditions.checkArgument;

public class Student {
    private final String name;
    private final String faculty;
    private final int semester;

    private Student(String name, String faculty, int semester) {
        this.name = name;
        this.faculty = faculty;
        this.semester = semester;
    }

    public static Student of(String name, String faculty, int semester) {
        return new Student(name, faculty, semester);
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getSemester() {
        return semester;
    }

    public static boolean fromIT(Student student){
        return student.getFaculty().equalsIgnoreCase("SISTEMAS");
    }
}
