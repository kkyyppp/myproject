package com.csl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//測試檔案命名規則 = 物件名稱後加Test
public class PersonTest {

    //測試方法命名規則 = 方法名稱後加Test or isCorrect
    @Test
    public void bmiTest() {
        Person person = new Person(63, 1.7f);
        Assertions.assertEquals( 63/1.7f/1.7f , person.bmi());
    }
}
