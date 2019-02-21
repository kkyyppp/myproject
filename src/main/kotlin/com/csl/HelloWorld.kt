package com.csl

fun main (args: Array<String>) {
        //println("Hello world")
        //Human().hello()
        val h = Human()
        h.hello()

        //var: 值可改變
        //val: 值不可改
        //變數型態自動推斷 / 或自己加入資料型態
        val v1 = 10
        var v2 = 10.5
        v2=9.5;

        var i:Int = 10
        var d:Double = 10.5
        var b:Boolean = true
        var f:Float = 10.1f
        var s:String  = "str"
        var c:Char = 'c'
        var byte:Byte = 12


}

class Human() {
        fun hello() {
                println("Hello kotlin")
        }
}