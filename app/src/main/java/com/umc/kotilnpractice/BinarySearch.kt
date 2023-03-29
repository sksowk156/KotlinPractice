package com.umc.kotilnpractice

import java.util.*
import kotlin.collections.ArrayList

//// contains, any, binarySearch 비교
//fun main() {
//
//    val rand1 = Random()
//    val a = ArrayList<Int>()
//    val b = ArrayList<Int>()
//
//    repeat(100) {
//        a.add(rand1.nextInt(100))
//        b.add(rand1.nextInt(100))
//    }
//
//
//    // binarySearch
//    var new_data = kotlin.collections.ArrayList<Int>()
//    var start = System.currentTimeMillis()
//    val c = a.sorted()
//    for (i in b) {
//        if (c.binarySearch(i) < 0) {
//            new_data.add(i)
//        }
//    }
//    var measuredTime = System.currentTimeMillis() - start
//    println("toArray.binarySearch time ==>$measuredTime")
//    println(new_data.size)
//
//    // contain
//    var new_data2 = kotlin.collections.ArrayList<Int>()
//    start = System.currentTimeMillis()
//    for (i in b) {
//        if (!a.any { it == i }) {
//            new_data2.add(i)
//        }
//    }
//    measuredTime = System.currentTimeMillis() - start
//    println("toArray.cotains time ==>$measuredTime")
//    println(new_data2.size)
//
//    // contain
//    var new_data3 = kotlin.collections.ArrayList<Int>()
//    start = System.currentTimeMillis()
//    for (i in b) {
//        if (!a.contains(i)) {
//            new_data3.add(i)
//        }
//    }
//    measuredTime = System.currentTimeMillis() - start
//    println("toArray.cotains time ==>$measuredTime")
//    println(new_data3.size)
//}