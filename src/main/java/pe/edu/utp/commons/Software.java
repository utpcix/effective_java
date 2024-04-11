package pe.edu.utp.commons;

import java.util.Objects;

public class Software {

    private String name;
    private int major_version;

    public Software(String name, int major_version) {
        this.name = name;
        this.major_version = major_version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMajor_version() {
        return major_version;
    }

    public void setMajor_version(int major_version) {
        this.major_version = major_version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Software software))
            return false;
        return getMajor_version()
                == software.getMajor_version()
                && Objects.equals(getName(),
                software.getName());
    }

    @Override
    public int hashCode() {
        // Joshua Bloch Method
//        int result = Objects.hashCode(getName());
//        result = 31 * result + Objects.hashCode(getMajor_version());
//        return result;

        // Primes Method
        int P = 16908799;
        int hash = 0;
        String key = getName() + getMajor_version();
        for (int i = 0; i < key.length(); i++) {
            hash = (127 * hash + key.charAt(i)) % P;
        }
        return hash;

        // IntelliJ IDEA method
//        return Objects.hash(getName(), getMajor_version());
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", major_version=" + major_version +
                '}';
    }
}
