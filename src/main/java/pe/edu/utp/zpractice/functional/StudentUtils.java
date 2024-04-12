package pe.edu.utp.zpractice.functional;

import pe.edu.utp.zpractice.common.Student;
import java.util.List;

import java.util.function.Predicate;

public class StudentUtils {

   public static boolean isTakingJava(Student student){
       return student.getCourse().equalsIgnoreCase("java");
   }

    public static boolean isTakingPython(Student student){
        return student.getCourse().equalsIgnoreCase("python");
    }

    public static boolean testRequirements(List<Predicate<Student>> requirements,
                                           Student student){
        for (Predicate<Student> requirement : requirements) {
            if ( requirement.test(student) == false ) return false;
        }
        return true;
    }

}
