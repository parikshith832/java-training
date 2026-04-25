package com.example;
import java.nio.file.*;
import java.io.IOException;
public class NIO {
    public static void main(String[] args) throws IOException {
        Path path=Paths.get("student.txt");
        //Write
        Files.write(path,"Hello JAva".getBytes());
        //Read
        String data=Files.readString(path);
        System.out.println(data);
    }
}
