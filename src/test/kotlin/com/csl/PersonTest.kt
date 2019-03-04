package com.csl.kotlin

import com.csl.Human
import com.csl.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test



class PersonTest {

    //可以用kotlin寫java的測試程式
    @Test
    fun personBmiTest() {
        var person:Person = Person(62f, 1.7f)
        Assertions.assertEquals( 62f/1.7f/1.7f, person.bmi())
    }

    @Test
    fun humanBmiTest() {
        var human:Human = Human("Chang", 62f, 1.7f)
        Assertions.assertEquals(62f/1.7f/1.7f, human.bmi())
    }
}