package pe.edu.utp.commons;

import java.util.HashMap;

public class TestHashCode {

    public static void main(String[] args) {

        HashMap<Software, String> softwareHashMap = new HashMap<>();
        Software linux_redhat = new Software("Linux RedHat", 9);
        softwareHashMap.put(new Software("Linux CentOS",8),"Linux CentOS");
        softwareHashMap.put(linux_redhat,"Linux RedHat");
        softwareHashMap.put(new Software("Linux Debian", 12),"Linux Debian");

        // Test if differents instances give the same hash
        String redhat = softwareHashMap.get(new Software("Linux RedHat", 9));
        String distro = softwareHashMap.get(linux_redhat);
        System.out.println("redhat = " + redhat);
        System.out.println("distro = " + distro);

    }
}
