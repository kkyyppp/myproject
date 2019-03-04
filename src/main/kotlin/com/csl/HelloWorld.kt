package com.csl

//kotlin 和 Java 在同一個package底下能有相同的Class

fun main (args: Array<String>) {
        //println("Hello world")
        //Human().hello()
        val h = Human(weight = 1.0f, height = 0f)

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
        var c:Char = 'c';
        var byte:Byte = 12

        var h2 = Human(weight = 55.6f, height = 1.7f)
        println(h2.bmi())


        var h3 = Human("abc", 5f, 10f)

        //kotlon Char不是數值，若要轉成int使用 toInt()
        val score = 88
        println(score>60)
        val c2:Char = 'A'
        println( c2.toInt() > 60)

}

//如果不想讓constructor的參數成為property, 就不要加var/val
class Human(var name:String="jack", var weight:Float, var height:Float) {

        //建構後執行的內容
        init {
                //字串裡要有變數 直接加$
                println("weight = $weight")
        }

        //次要建構子(secondary constructor) 傳入參數不使用var,
        // 且如傳入參數primary constructor已設定，要加屬性-主建構子 this()
        // 且一樣會執行 init()
      //  constructor(name: String, weight: Float, height: Float): this(weight, height)

        fun bmi(): Float {
                var bmi = weight / (height*height)
                return bmi
        }

        fun hello() {
                println("Hello kotlin")
        }
}

// kotlin 沒有三元運算式  因為 =號/return/字串+法 後面可以放if~else~(JAVA if else 是statement Kotlin則變成Expression)
// 字串裡呼叫方法 ${ method }