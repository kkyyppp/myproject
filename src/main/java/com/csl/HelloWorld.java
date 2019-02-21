package com.csl;

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

    }


    //快速鍵
    //VCS = alt + `
    //叫出version control = alt + 9
    //複製游標所在的該行到下一行去 = ctrl + D
    //區塊注解 = ctrl + shift + /
    //debug 執行下一行 = F8
    //debug step nito執行下一行 = F7
    //查看方法可設定之參數 = ctrl + p (多載 overloading)
    //注解單行

    //System.out.println = sout + tab
    //public static void main(String[] args)  = psvm + tab
}
