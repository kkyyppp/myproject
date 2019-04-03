package com.csl.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoTester {
    public static void main(String[] args) {

        File file = new File("./testData/data.txt");
        //建立檔案
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File path: "+ file.getAbsolutePath());

        try {
            FileInputStream is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File access failed");
        }
    }
}
