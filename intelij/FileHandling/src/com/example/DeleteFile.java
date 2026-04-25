package com.example;
import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File file=new File("student.txt");
        if(file.delete()){
            System.out.println("Delted successfully");
        }else{
            System.out.println("Failed to delte");
        }
    }
}
