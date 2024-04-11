package pe.edu.utp.iac.accesible.non_internal;

import pe.edu.utp.iac.accesible.internal.Software;

import java.util.Objects;

// Another developer use your API in a bad way

public class OperatingSystem implements Software {
    private String distro;
    private int ver;

    @Override
    public String getName() {
        return distro;
    }

    @Override
    public int getMajorVersion() {
        return ver;
    }

    public OperatingSystem(String distro, int ver) {
        this.distro = distro;
        this.ver = ver;
    }

    public String getDistro() {
        return distro;
    }

    public void setDistro(String distro) {
        this.distro = distro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OperatingSystem that)) return false;
        return Objects.equals(getDistro(), that.getDistro());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDistro());
    }

    @Override
    public String toString() {
        return "OperatingSystem{" +
                "distro='" + distro + '\'' +
                '}';
    }


}
