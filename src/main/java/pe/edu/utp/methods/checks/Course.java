package pe.edu.utp.methods.checks;

import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;

public class Course {
    private final String name;
    private final String faculty;
    private final int semester;

    private Course(String name, String faculty, int semester) {
        this.name = name;
        this.faculty = faculty;
        this.semester = semester;
    }

    public static Course of(String name, String faculty, int semester) {
        // Checking arguments
        checkArgument(semester > 0 && semester <= 10,
                String.format("invalid semester: %d (must be 1-10)",semester));
        checkArgument(name != null, "name cannot be null");
        checkArgument(faculty != null, "faculty cannot be null");
        return  new Course(name, faculty, semester);
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

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", semester=" + semester +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return getSemester() == course.getSemester() && Objects.equals(getName(), course.getName()) && Objects.equals(getFaculty(), course.getFaculty());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFaculty(), getSemester());
    }
}
