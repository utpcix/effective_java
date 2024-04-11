package pe.edu.utp.zpractice.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TextUTP {

    public enum OS {WINDOWS, LINUX};
    public enum ENCONDING {ISO_8859_1, UTF_8};

    private static String getEncoding(ENCONDING enc){
        return switch (enc){
            case ISO_8859_1 -> "ISO-8859-1";
            case UTF_8 -> "UTF-8";
            default -> "UTF-8";
        };
    }

    public static String read(String filename) throws IOException {
        try(BufferedInputStream in = new BufferedInputStream(
                new FileInputStream(filename))
        ){
            String data = new String(in.readAllBytes(), StandardCharsets.UTF_8);
            return data;
        } catch (IOException e) {
            throw e;
        }
    }

    public static String read(String filename,
                              ENCONDING src,
                              ENCONDING dst) throws IOException {
        try(BufferedInputStream in = new BufferedInputStream(
                new FileInputStream(filename))
        ){
            byte[] data_raw = new String(in.readAllBytes(), getEncoding(src)).getBytes();
            String data = new String(data_raw, getEncoding(dst));
            return data;
        } catch (IOException e) {
            throw e;
        }
    }

    public static List<String> readlines(String filename, OS os) throws IOException {
        String delim = (os == OS.WINDOWS) ? "\r\n" : "\n";
        String data = read(filename);
        List<String> res = new LinkedList<>();
        if (data.length() > 0){
            res = Arrays.asList(data.split(delim));
        }
        return res;
    }

    public static List<String> readlines(String filename, OS os,
                                         ENCONDING src, ENCONDING dst) throws IOException {
        String delim = (os == OS.WINDOWS) ? "\r\n" : "\n";
        String data = read(filename, src, dst);
        List<String> res = new LinkedList<>();
        if (data.length() > 0){
            res = Arrays.asList(data.split(delim));
        }
        return res;
    }

    public static List<String> readlines(String filename) throws IOException {
        return readlines(filename, OS.LINUX);
    }

    public static List<String> readlines(String filename,
                                         ENCONDING src, ENCONDING dst) throws IOException {
        return readlines(filename, OS.LINUX, src, dst);
    }

    public static String[] readlinesAsArray(String filename, OS os) throws IOException {
        String delim = (os == OS.WINDOWS) ? "\r\n" : "\n";
        String data = read(filename);
        String[] res = new String[]{};
        if (data.length() > 0){
            res = data.split(delim);
        }
        return res;
    }

    public static String[] readlinesAsArray(String filename, OS os,
                                            ENCONDING src, ENCONDING dst)
            throws IOException {
        String delim = (os == OS.WINDOWS) ? "\r\n" : "\n";
        String data = read(filename, src, dst);
        String[] res = new String[]{};
        if (data.length() > 0){
            res = data.split(delim);
        }
        return res;
    }

    public static String[] readlinesAsArray(String filename) throws IOException {
        return readlinesAsArray(filename, OS.LINUX);
    }

    public static String[] readlinesAsArray(String filename,
                                            ENCONDING src, ENCONDING dst) throws IOException {
        return readlinesAsArray(filename, OS.LINUX, src, dst);
    }

    private static void writeText(byte[] data, String filename)
            throws IOException{
        try(BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream(filename,true))
        ){
            out.write(data);
        } catch (IOException e) {
            throw e;
        }
    }

    public static void append(String data, String filename) throws IOException {
        writeText(data.getBytes(), filename);
    }

    public static void append(String data, String filename, ENCONDING dst) throws IOException {
        writeText(data.getBytes(getEncoding(dst)), filename);
    }

    public static void append(String[] data, String filename, boolean withNewLine, OS os) throws IOException {
        String delim = (os == OS.WINDOWS) ? "\r\n" : "\n";
        StringBuilder sb = new StringBuilder();
        for (String item : data) {
            if (withNewLine == true) {
                sb.append(item + delim);
            }else{
                sb.append(item);
            }
        }
        writeText(sb.toString().getBytes(), filename);
    }

    public static void append(String[] data, String filename, boolean withNewLine, OS os, ENCONDING dst) throws IOException {
        String delim = (os == OS.WINDOWS) ? "\r\n" : "\n";
        StringBuilder sb = new StringBuilder();
        for (String item : data) {
            if (withNewLine == true) {
                sb.append(item + delim);
            }else{
                sb.append(item);
            }
        }
        writeText(sb.toString().getBytes(getEncoding(dst)), filename);
    }

    public static void append(String[] data, String filename, boolean withNewLine) throws IOException {
        append(data, filename, withNewLine, OS.LINUX);
    }

    public static void append(String[] data, String filename, boolean withNewLine, ENCONDING dst) throws IOException {
        append(data, filename, withNewLine, OS.LINUX, dst);
    }

    public static void append(String[] data, String filename) throws IOException {
        append(data, filename, true);
    }

    public static void append(String[] data, String filename, ENCONDING dst) throws IOException {
        append(data, filename, true,dst);
    }

    public static void append(List<String> data, String filename, boolean withNewLine, OS os) throws IOException {
        String delim = (os == OS.WINDOWS) ? "\r\n" : "\n";
        StringBuilder sb = new StringBuilder();
        for (String item : data) {
            if (withNewLine == true) {
                sb.append(item + delim);
            }else{
                sb.append(item);
            }
        }
        writeText(sb.toString().getBytes(), filename);
    }

    public static void append(List<String> data, String filename, boolean withNewLine, OS os, ENCONDING dst) throws IOException {
        String delim = (os == OS.WINDOWS) ? "\r\n" : "\n";
        StringBuilder sb = new StringBuilder();
        for (String item : data) {
            if (withNewLine == true) {
                sb.append(item + delim);
            }else{
                sb.append(item);
            }
        }
        writeText(sb.toString().getBytes(getEncoding(dst)), filename);
    }

    public static void append(List<String> data, String filename, boolean withNewLine) throws IOException {
        append(data, filename, withNewLine, OS.LINUX);
    }

    public static void append(List<String> data, String filename, boolean withNewLine, ENCONDING dst) throws IOException {
        append(data, filename, withNewLine, OS.LINUX, dst);
    }

    public static void append(List<String> data, String filename) throws IOException {
        append(data, filename, true);
    }

    public static void append(List<String> data, String filename, ENCONDING dst) throws IOException {
        append(data, filename, true, dst);
    }

}
