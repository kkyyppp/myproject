package com.csl.many

fun main(args:Array<String>) {

    var list:List<Int> = listOf(5,1,2,7)
    //kotlin可直接印出list

    println(list)
    val scroes:List<Int> = listOf(66,77,88,99,100)
    //kotlin for each的用法
    for (score in scroes) {
        println(score)
    }
    //listOf建立非mutable的Llist
    println(scroes.get(0))
    println()

    //如果想新增刪除list 必須創建 mutableList
    val mutableList:MutableList<Int> = mutableListOf(1,2,3,4)
    mutableList.add(7)
    println(mutableList)

    mutableList.set(0,1)
    mutableList.add(5)
    mutableList.removeAt(0)
    println(mutableList)

    list = mutableListOf(1,2,3,4)


}