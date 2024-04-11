package pe.edu.utp.iac.accesible.internal;

import java.util.Objects;

public class SysUtils implements Software{

    private String name;
    private int version;
    private boolean debug;

    public SysUtils(String name, int version, boolean debug) {
        this.name = name;
        this.version = version;
        this.debug = debug;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMajorVersion() {
        return this.getVersion();
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SysUtils sysUtils)) return false;
        return getVersion() == sysUtils.getVersion() && isDebug() == sysUtils.isDebug() && Objects.equals(getName(), sysUtils.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getVersion(), isDebug());
    }

    @Override
    public String toString() {
        return "SysUtils{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", debug=" + debug +
                '}';
    }
}
