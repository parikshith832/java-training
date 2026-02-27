package Day5;

import java.io.*;

public class excep {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("abc.txt");

        } catch (IOException e) {
            System.out.println("File is not Readable");

        }
    }

}
