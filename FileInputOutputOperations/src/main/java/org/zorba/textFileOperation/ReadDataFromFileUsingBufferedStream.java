package org.zorba.textFileOperation;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromFileUsingBufferedStream {
    public static void main(String[] args) {
        try {
            String readData = "";
            // Load the Text File
            File file = new File("/Users/abhishekgayen/Zorbra_Softed/1016_Batch/Java_1016_Batch_Class_Notes/FileInputOutputOperations/src/main/resources/sample.txt");
            //Read from text file as byte stream
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int data;
            while((data = bufferedInputStream.read()) != -1) {
                readData = readData + (char)data;
            }
            System.out.println(readData);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
