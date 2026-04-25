package com.example;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class IOStreams {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("data.bin");
            fos.write(65);
            fos.close();

            FileInputStream fis=new FileInputStream("data.bin");
            int data=fis.read();
            System.out.println("Read: " + data);
            fis.close();
        }catch(IOException e){
            System.out.println("Eroor");
        }
    }
}
