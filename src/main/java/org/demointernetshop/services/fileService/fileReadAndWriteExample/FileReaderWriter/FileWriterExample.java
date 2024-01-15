package org.demointernetshop.services.fileService.fileReadAndWriteExample.FileReaderWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("writerExample.txt"));

        writer.newLine();
        writer.write("Hello, World!");
        writer.newLine();
        writer.write("This is our example working with bufferWriter");
        writer.flush();
        writer.close();


    }
}
