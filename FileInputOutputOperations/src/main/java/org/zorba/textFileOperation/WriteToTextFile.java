package org.zorba.textFileOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class WriteToTextFile {
    public static void main(String[] args) {
        try {
            String readData = "";
            // Load the Text File
            File file = new File("/Users/abhishekgayen/Zorbra_Softed/1016_Batch/Java_1016_Batch_Class_Notes/FileInputOutputOperations/src/main/resources/sample.txt");
            //Read from text file as byte stream
            FileInputStream fileInputStream = new FileInputStream(file);
            int data;
            //Read loop through and populate the string variables
            while((data = fileInputStream.read()) != -1) {
                readData = readData + (char)data;
            }
            System.out.println(readData);

            //appending string along with the existing text from file
            readData = readData + "I am Ok!!";
            System.out.println(readData);
            //Initializing the OutputStream and write back to a file.
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            System.out.println(Arrays.toString(readData.getBytes()));
            fileOutputStream.write(readData.getBytes());//[72, ]
            fileOutputStream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
