package com.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadingFile {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("student.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }catch(IOException e){
            System.out.println("Eroor reading file");
        }
    }
}
