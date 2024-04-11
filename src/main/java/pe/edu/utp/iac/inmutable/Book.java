package pe.edu.utp.iac.inmutable;

import java.util.List;

// Insecure Design

public class Book {
    private String name;
    private Integer year;
    private List<String> authors;

    public Book(String name, Integer year, List<String> authors) {
        this.name = name;
        this.year = year;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", authors=" + authors +
                '}';
    }
}
