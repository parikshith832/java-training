package com.example;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("student.txt");
            writer.write("ID: 101 \n Name: Raushan\n Course: JAVA\n");
            writer.close();
            System.out.println("data is written successfully");
        }catch(IOException e){
            System.out.println("Eroor writing the file ");
        }
    }
}
