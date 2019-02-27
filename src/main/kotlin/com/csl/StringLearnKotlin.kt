package com.csl

fun main(args:Array<String>) {
    var s:String = "abcde"
    println("s length: "+ s.length)
    println("s index 3: "+ s.get(3))
    println("s sub string: "+ s.substring(3))


    //變數預設為非null  如果要讓變數可以為null(預設為非null 你不能assign該變數為null 會compile error)
    //則要在宣告變數後的資料型態加入 "?"
    //使用時也要加"?"  -> 此時如果存取該變數時該值為null 會一併都吐null 而不會cursh
    //如果想自行處理null 則在其後加入
    var s2:String?="abcde"
    s2 = null
    println("s2 length: "+ s2?.length)
    println("s2 index 3: "+ s2?.get(3))
    println("s2 sub string: "+ s2?.substring(3))

    var s3:String?="abcde"
    s3=null
   // println("s2 length: "+ s2!!.length)

    var man:Man = Man(null, 15)
    man.print()

}


class Man(var name:String?, var age:Int) {
    init {

    }

    fun print() {
        println("name: "+ name+  "age: "+ age)
    }

}