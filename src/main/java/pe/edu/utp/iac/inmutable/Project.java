package pe.edu.utp.iac.inmutable;

import org.apache.commons.lang3.SerializationUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// 2. Class can't be extended
public final class Project {
    // 1. Make all fields final and private
    private final String name;
    private final String manager;
    private final LocalDate init_date;
    private final List<String> members;

    // 3. Use defensive copies
    public Project(String name, String manager,
                   LocalDate init_date,
                   List<String> members) {
        this.name = new String(name);
        this.manager = new String(manager);
        this.init_date = LocalDate.of(init_date.getYear(),
                init_date.getMonth(),
                init_date.getDayOfMonth());
        this.members = members.stream()
                // From Apache Commons Lang
                .map(SerializationUtils::clone)
                .collect(Collectors.toList());
    }

    // No setters

    public String getName() {
        return new String(name);
    }

    public String getManager() {
        return new String(manager);
    }

    public LocalDate getInit_date() {
        return LocalDate.of(init_date.getYear(),
                init_date.getMonth(),
                init_date.getDayOfMonth());
    }

    public List<String> getMembers() {
        List<String> res = new ArrayList<>();
        res.addAll(members);
        return res;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", manager='" + manager + '\'' +
                ", init_date=" + init_date +
                ", members=" + members +
                '}';
    }

    public Project addMember(String member) {
        String new_name = getName();
        String new_manager = getManager();
        LocalDate new_init_date = getInit_date();
        List<String> new_members = getMembers();
        new_members.add(member);

        return new Project(new_name, new_manager, new_init_date, new_members);
    }

}
