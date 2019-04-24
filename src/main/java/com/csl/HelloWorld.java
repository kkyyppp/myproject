package com.csl;

import com.csl.student.Student;

public class HelloWorld {

    public static void main(String[] args) {

        Person p = new Person();
        p.hello();

        int age =19;
        Integer age2 = 19;
        char c = 'a';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        double height = 175;
        boolean enroll = true;
        String s ="str";


        p.weight = 55.6f;
        p.height = 1.7f;
        System.out.println(p.bmi());

        Person p2 = new Person(55.6f, 1.7f);
        System.out.println(p.bmi());


        int score = 80;
        System.out.println(score>80 && score<90);
        //JAVA中 char昰數值 A=65, a=97
        char c3 = 'A';
        System.out.println(c3 > 60);



    }


    //快速鍵 Help -> keymap reference
    //VCS = alt + `
    //叫出version control = alt + 9
    //複製游標所在的該行到下一行去 = ctrl + D
    //區塊注解 = ctrl + shift + /
    //debug 執行下一行 = F8
    //debug step nito執行下一行 = F7
    //查看方法可設定之參數 = ctrl + p (多載 overloading)
    //注解單行 = crtl +/
    //叫出功能選單 = alt + iinsert
    //抽取出程method = ctrl + alt +M
    //新增Constructor/getter setter = alt + insert
    //查看function可以放什麼種類的參數 = ctrl+P
    //加入try catch = ctrl + atl + t


    //System.out.println = sout + tab
    //public static void main(String[] args)  = psvm + tab

    //八個基本資料型態 bool int short long byte float double char
    //String 是物件不是型態 因為太常使用所以自行呼叫new String()
    // +號 左右兩邊有任一個是String  另一邊若不是String會自動轉成String
    // =號 右邊只能放Expression 不能放 statement(敘述式 if~else)

}
