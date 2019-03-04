package com.csl.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentTest {

    //一次測試全部的測試案例時，IDE不一定會按照順序執行測試方法
    //測試private method/property https://www.puritys.me/docs-blog/article-404-%E5%A6%82%E4%BD%95%E6%B8%AC%E8%A9%A6-Java-Private-Method-Property.html


    @Test
    public void highestTest() {
        Student student = new Student("Chang", 90, 80);
        Assertions.assertEquals( 90, student.highest());
    }

    @Test
    public void getAvgTest() {

        Student student = new Student("Chang", 90, 80);
        int result = 0;

        try {
            Method method = student.getClass().getDeclaredMethod("getAvg", null);
            method.setAccessible(true);
            result = (int) method.invoke(student, null);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            System.out.println("\"getAvg\" no such method");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Assertions.assertEquals((90+80)/2, result);
    }

    @Test
    public void getGradeTest() {
        Student student = new Student("Chang", 90, 80);

        char grade = 'Z';

        try {
            //設定private方法為可存取
            Method method = student.getClass().getDeclaredMethod("getGrade", int.class);
            method.setAccessible(true);

            //設定方法input的參數
            Object[] parameters = new Object[1];
            parameters[0] = (90+80)/2;

            grade = (char) method.invoke(student, parameters    );

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            System.out.println("\"getGrade\" no such method");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        Assertions.assertEquals( 'B', grade);

    }
}
