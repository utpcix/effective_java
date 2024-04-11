package pe.edu.utp.iac.inmutable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestInmutable {
    public static void main(String[] args) {

        List<String> authors_list = new ArrayList<>();
        authors_list.add("Alejandro Dumas");
        Book b1 = new Book("Los 3 mosqueteros",1844, authors_list);

        List<String> authors = b1.getAuthors();
        authors.add("Yo");  // INSECURE !
        authors_list.add("Tu");

        System.out.println("b1 = " + b1);

        // Test Secure Project
        List<String> project_members = new ArrayList<>();
        project_members.add("Carlitos");
        project_members.add("Anita");
        Project p1 = new Project("Project ABC","Juan", LocalDate.now(),project_members);


        // Try to change members
        List<String> members = p1.getMembers();
        members.add("Rosita");
        members.add("Miguelito");
        project_members.add("Julito");

        System.out.println("p1 = " + p1);

        Project p1a = p1.addMember("Matias");
        System.out.println("p1a = " + p1a);
        System.out.println("p1 = " + p1);

    }
}
