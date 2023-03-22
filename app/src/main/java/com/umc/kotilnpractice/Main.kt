package com.umc.kotilnpractice

import java.util.*
import kotlin.math.max
import kotlin.random.Random

//fun main() {
//    println("값을 입력하세요")
//    val price = readln().toInt()
//
//    val count = countingcoin(price)
//    println(count)
//
//    val count2 = countingcoin2(price)
//    println(count2)
//
//}
//
//fun countingcoin(price: Int): Int {
//    var count = 0
//    var implprice = price
//    while (implprice > 0) {
//        if ((implprice / 500) > 0) {
//            count += (implprice / 500)
//            implprice %= 500
//        } else if ((implprice / 100) > 0) {
//            count += (implprice / 100)
//            implprice %= 100
//        } else if ((implprice / 50) > 0) {
//            count += (implprice / 50)
//            implprice %= 50
//        } else if ((implprice / 10) > 0) {
//            count += (implprice / 10)
//            implprice %= 10
//        } else {
//            count
//        }
//    }
//    return count
//}
//
//fun countingcoin2(price: Int): Int {
//    val coin_type = listOf(500, 100, 50, 10)
//    var implprice = price
//    var count = 0
//    for (coin in coin_type) {
//        count += (implprice / coin)
//        implprice %= coin
//    }
//    return count
//}
//
//fun main(){
//    println("배열의 크기 : ")
//    val size = readln().toInt()
//    println("숫자가 더해지는 횟수 : ")
//    val count = readln().toInt()
//    println("연속해서 더해질 수 있는 최대 횟수 : ")
//    val max = readln().toInt()
//
//    var a = mutableListOf<Int>()
//    repeat(size) {
//        val aa = readln().toInt()
//        a.add(aa)
//    }
//
//    a.sort()
//    a.reverse()
//    var maxnum = 0
//    var impl = mutableListOf<Int>()
//    repeat(max){
//        impl.add(a[0])
//    }
//    impl.add(a[1])
//
//    for(i in 0..count-1){
//        var temp = i % (impl.size)
//        maxnum += impl[temp]
//    }
//    println(maxnum)
///////////////////////////////////////////////////////////////////////////////////////////////////////
//    val (size, count , max) = readln().split(' ').map{it.toInt()}
//    println("size : ${size}, count : ${count}, max : ${max}")
//
////    var list = mutableListOf<Int>()
////    repeat(size){
////        list.add(readln().toInt())
////    }
//
//    val list = MutableList(size) {
//        readln().toInt()
//    }
//
//    list.sort()
//    val first = list[size-1]
//    val second = list[size-2]
//
//    var allcount = (count / (max+1))
//    var firstcount = allcount * max
//    firstcount += (count % (max+1))
//
//    var result = 0
//    result += firstcount * first
//    result += allcount * second
//
//    println(result)
//}

//fun main() {
//    val (row, column) = readln().split(" ").map { it.toInt() }
//    println(row.toString() + " " + column.toString())
//
//    // 2차원 입력은 이렇게!!
//    val matrix = Array(row) {
//        readln().split(" ").map { it.toInt() }.toIntArray()
//    }
//
////    var minarray = mutableListOf<Int>()
////    for(row in matrix){
////        minarray.add(row.min())
////    }
////
////    println(minarray.max())
//    var result = 0
//    for (i in 0..column - 1) {
//        result = max(result, matrix[i].min())
//    }
//
//}

//fun main(){
//    val (N, K) = readln().split(" ").map{it.toInt()}
//    var num = N
//    var count = 0
//
////    while(num != 1){
////
////        if(num%K == 0){
////            num /= K
////            count++
////        }else{
////            num -= 1
////            count++
////        }
////    }
//
//    while(num!=1){
//        var temp = (num%K)
//        if(temp == 0){
//            num /= K
//            count++
//        }else{
//            num -= (temp)
//            count += temp
//            if(num ==0){ // 한번에 빼게될 경우 마지막 순간 1을 지나쳐 0으로 바로간다. 그래서 무한 루프에 빠짐
//                num = 1
//                count -= 1
//            }
//        }
//    }
//
//    println(count)
//}

//fun main() {
//
//    val size = readln().toInt()
//
//    val planner = readln().split(" ").map { it.toString() }.toTypedArray()
//
////    var point = Pair<Int, Int>(1, 1)
////    for (i in planner) {
////        when (i) {
////            "R" -> {
////                if (point.second < size) {
////                    point = Pair(point.first, point.second+1)
////                }
////            }
////            "L" -> {
////                if (1 < point.second ) {
////                    point = Pair(point.first, point.second-1)
////                }
////            }
////            "U" -> {
////                if (1 < point.first ) {
////                    point = Pair(point.first-1, point.second )
////                }
////            }
////            "D" -> {
////                if (point.first < size) {
////                    point = Pair(point.first+1, point.second )
////                }
////            }
////            else -> {
////                println("?!")
////            }
////        }
////    }
////
////    println(point)
//
//    var x = 1
//    var y = 1
//    val move_types = arrayOf("L", "R", "U", "D")
//    val dx = arrayOf(0, 0, -1, 1)
//    val dy = arrayOf(-1, 1, 0, 0)
//
//    for (plan in planner) {
//        var nx = 0
//        var ny = 0
//        for (i in 0..move_types.size - 1) {
//            if (move_types[i] == plan) {
//                nx = x + dx[i]
//                ny = y + dy[i]
//            }
//        }
//        if(nx < 1 || ny < 1 || nx > size || ny > size){
//            continue
//        }
//        x = nx
//        y = ny
//    }
//    println(x.toString()+" "+y)
//}

fun main(){
    val hour = readln().toInt()

//    var count = 0
//
//    var hflag = false
//    var mflag = false
//    var sflag = false
//    for(i in 0..hour){
//        hflag = i.toString().contains('3')
//        for(min in 0..59){
//            mflag = min.toString().contains('3')
//            for(sec in 0 .. 59){
//                sflag = sec.toString().contains('3')
//
//                if((hflag || mflag || sflag))
//                    count++
//            }
//        }
//    }
//    println(count)

    var count = 0

    for(i in 0..hour){
        for(min in 0..59){
            for(sec in 0 .. 59){
                var temp = i.toString()+min.toString()+sec.toString()

                if( temp.contains('3'))
                    count++
            }
        }
    }
    println(count)
}