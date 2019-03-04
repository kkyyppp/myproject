package com.csl.student.kotlin

import com.csl.student.StudentK
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.reflect.Method
import java.util.*

class StudentTest {

    @Test
    fun highestTest() {
        var studentK:StudentK = StudentK("Chang", 80, 70)
        Assertions.assertEquals(80, studentK.highestScore())
    }

    @Test
    fun getAvgTest() {

        var studentK:StudentK = StudentK("Chang", 80, 70)

        val method:Method = studentK.javaClass.getDeclaredMethod("getAvg")
        method.isAccessible = true

        var result:Int = 0
        result = method.invoke(studentK) as Int

        println(result)
        Assertions.assertEquals((80+70)/2, result)
    }

    @Test
    fun getGradeTest() {
        var studentK:StudentK = StudentK("Chang", 80, 70)

        val method:Method = studentK.javaClass.getDeclaredMethod("getGrade", Int::class.java)
        method.isAccessible = true

        var result:Char = 'Z'
        result = method.invoke(studentK, 75) as Char

        print(result)
        Assertions.assertEquals('C', studentK.getGrade((80+70)/2))

    }
}