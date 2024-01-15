package org.demointernetshop.services.fileService.fileReadAndWriteExample.FileReaderWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("test_stream.txt");

        int character;

//        while ((character = fileReader.read()) != -1) {
//        System.out.print((char) character + " ");}


       BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        int counter = 0;

        while ((line = bufferedReader.readLine()) != null) {
            counter++;
            System.out.println("Line # " + counter + " : " + line);
        }


    }
}
