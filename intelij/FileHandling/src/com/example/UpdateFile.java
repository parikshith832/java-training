package com.example;
import java.io.*;
public class UpdateFile {
    public static void main(String[] args) {
        try{
            File file=new File("student.txt");
            BufferedReader reader=new BufferedReader(new FileReader(file));
            StringBuilder content=new StringBuilder();
            String line;
            while((line=reader.readLine())!=null){
                if(line.contains("Raushan")){
                    line=line.replace("Raushan","XYZ");
                }
                content.append(line).append("\n");
            }
            reader.close();
            FileWriter writer=new FileWriter(file);
            writer.write(content.toString());
            writer.close();
            System.out.println("File updated successfully");
        }catch(IOException e){
            System.out.println("Eroor updating file");
        }
    }
}
