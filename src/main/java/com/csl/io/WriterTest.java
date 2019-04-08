package com.csl.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {

    public static void main(String[] args) {
        try {
            File file = new File("./testData");
            if (!file.exists())
                file.mkdirs();

            FileWriter fw = new FileWriter(file.getAbsolutePath()+"/output.txt");
            fw.write("這是測試");
            fw.flush();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
