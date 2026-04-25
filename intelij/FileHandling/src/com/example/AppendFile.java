package com.example;
import java.io.FileWriter;
import java.io.IOException;
public class AppendFile {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("student.txt",true);
            writer.write("Grade:A\n");
            writer.close();
            System.out.println("Data appended successfully");
        }catch(IOException e){
            System.out.println("Eroor");
        }
    }
}
