package com.csl.many;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ManyTester {
    public static void main(String[] args) {

        genericsTest();
        arrayTest();
    }

    //泛型 generics
    private static void genericsTest() {
        //List可以不指定 型態，預設為Object
        ArrayList list = new ArrayList();
        //因為Object為物件的最上曾父類別 故可以塞入不同型態的值
        list.add(1);
        list.add('a');
        list.add("String");

        //但是不指定型態反而造成困擾 在取值時必須清楚知道該欄位是什麼型態 否則會造成ClassCastException 轉型失敗
        int list_1 = (int) list.get(0);
        char list_2 = (char) list.get(1);
        String list_3 = (String) list.get(2);

        //故基本上一定要指定型態
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);


        //將array轉為list

    }

    private static void arrayTest() {
        int numbers[] = new int[5];
        numbers[0] = 5;
        numbers[1] = 3;

        int scores[] = {66,77,88,99,10};
        System.out.println( scores );

        for(int i=0; i<scores.length; i++) {
            System.out.println(scores[i]);
        }

        //for each可以達到和for loog一樣的效果
        for(int i : scores) {
            System.out.println(i);
        }

        //但是for each有一個重大的不同 for each的方式是複製該元素 而不是直接取用該元素
        int i=0;
        for(int j : scores) {
            j= j+100;
            System.out.println(scores[i]);
            i++;
        }
    }
}
