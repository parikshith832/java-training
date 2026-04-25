package com.example;
import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String[] args) {
        try{
            File file=new File("/Users/raushankumarbaitha/IdeaProjects/FileHandling/Student/student1.txt");
            if(file.createNewFile()){
                System.out.println("File Created: "+file.getName());

            }else{
                System.out.println("File already exits");
            }
        }catch(IOException e){
            System.out.println("EROrr occured");
        }
    }
}
