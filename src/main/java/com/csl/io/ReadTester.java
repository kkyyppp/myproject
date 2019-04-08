package com.csl.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {

        readByte();
        readChar();

        readLine();
    }


    private static void readByte() {
        File file = new File("./testData/data.txt");
        //建立檔案,也可以使用mkdir建立一個資料節,或是mkdirs建立路徑下所有未建的子資料夾
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nFile path: "+ file.getAbsolutePath());
        System.out.println("這是一次讀取一個byte");
        try {
            FileInputStream is = new FileInputStream(file);

            //FileInputStream 一次讀一個byte(8位元)，是ASCII碼
            int readedInt = is.read();
            System.out.print(readedInt);

            while( (readedInt = is.read()) != -1) {
                System.out.print((char)readedInt);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File access failed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void readChar() {
        try {
            System.out.println("這是一次讀取一個char");
            FileReader fr = new FileReader("./testData/data.txt");
            int readedInt=-1 ;
            while ((readedInt= fr.read())!= -1 ) {
                System.out.print((char) readedInt);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void readLine() {
        System.out.println("這是一次讀取一行");
        try {
            BufferedReader br =new BufferedReader(new FileReader("./testData/data.txt"));
            String line = null;

            //readline指 一次讀取一行給你(遇到換行字元)，但是換行字元會被省略
            if ((line=br.readLine())!=null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
