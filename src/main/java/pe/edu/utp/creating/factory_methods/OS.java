package pe.edu.utp.creating.factory_methods;

public class OS {
    public enum Type {LINUX, WINDOWS, MACOS, ANDROID, FREEBSD}
    private String name;
    private Type type;
    private String version;

    public OS(String name, Type type, String version) {
        this.name = name;
        this.type = type;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
