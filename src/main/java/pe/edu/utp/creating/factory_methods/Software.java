package pe.edu.utp.creating.factory_methods;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.google.common.base.Preconditions.checkArgument;

public class Software {
    public enum Type {UTILITY, APP, SECURITY, OPERATING_SYSTEM, CUSTOM}
    private final String name;
    private final int major;
    private final int minor;
    private final Type type;
    private static HashMap<String,Software> instances = new LinkedHashMap<>();

    static {
        instances.put("office",new Software("Office", 10,0, Type.UTILITY));
        instances.put("redhat",new Software("Red Hat Linux", 9,0, Type.OPERATING_SYSTEM));
        instances.put("pdf",new Software("Adobe Acrobat Reader", 18,0, Type.UTILITY));
    }

    private Software(String name, int major, int minor, Type type) {
        this.name = name;
        this.major = major;
        this.minor = minor;
        this.type = type;
    }

    public static Software valueOf(String name, int major, int minor, Type type) {
        // Chech Arguments
        checkArgument(major > 0,"major version cannot be negative");
        checkArgument(minor >= 0, "minor version cannot be negativa");
        return new Software(name, major, minor, type);
    }

    public static Software from(OS os) {
        // Chech Arguments
        Pattern pattern = Pattern.compile("[0-9]+[.][0-9]+[.][0-9]+");
        Matcher eval = pattern.matcher(os.getVersion());
        checkArgument( eval.matches(), "os version is invalid" );

        int major = Integer.parseInt( os.getVersion().split("\\.")[0] );
        int minor = Integer.parseInt( os.getVersion().split("\\.")[1] );
        return valueOf(os.getName(),major,minor,Type.OPERATING_SYSTEM);
    }

    public static Set<Software> of(List<Software> list){
        Set<Software> res = new HashSet<>();
        list.forEach(res::add);
        return res;
    }

    public static Software getInstance(String name){
        return instances.get(name.toLowerCase());
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", major=" + major +
                ", minor=" + minor +
                ", type=" + type +
                '}';
    }
}
