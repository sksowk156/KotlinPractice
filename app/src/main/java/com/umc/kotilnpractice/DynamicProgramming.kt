package com.umc.kotilnpractice

import android.os.Build.VERSION_CODES.P
import java.lang.Integer.max
import kotlin.math.min

//fun main(){
////    // 재귀적 구현
////    val array = Array<Int>(100){0}
////    fun fibo(x : Int):Int{
////        if(x==1 || x==2){
////            return 1
////        }
////
////        if(array[x] != 0){
////            return array[x]
////        }
////
////        array[x] = fibo(x-1) + fibo(x-2)
////        return array[x]
////    }
////    println(fibo(99))
//
////    // 반복문 구현
////    val array = Array<Int>(1000){0}
////    array[1] = 1 // 초기 입력값을 인덱스로 배열에 초기값을 넣는다. -> 초기 값부터 시작
////    array[2] = 1
////    val n = 60
////
////    for( i in 3 until n+1){ // 반복문 설정
////        array[i] = array[i-1]+array[i-2]
////    }
////
////    println(array[n])
//}

//// 2
//fun main() {
////    var n = readln().toInt()
////    val temp = arrayOf(5, 3, 2, 1)
////    val array = Array(n + 1) { 100 }
////    array[0] = 0
////    array[1] = 0
////
////    for (i in 2..n) {
////        for (j in temp) {
////            if (j == 1) {
////                if (array[i] > array[i - 1] + 1) {
////                    array[i] = array[i - 1] + 1
////                }
////            } else {
////                if (i % j == 0 && array[i] > array[(i / j)] + 1) {
////                    array[i] = array[(i / j)] + 1
////                }
////            }
////        }
////    }
////    println(array[n])
//
////    val x = readln().toInt()
////    val d = Array<Int>(100){0}
////
////    for(i in 2..x){
////        d[i] = d[i-1]+1
////
////        if(i%5==0){
////            d[i] = min(d[i],d[i/5]+1)
////        }
////        if(i%3==0){
////            d[i] = min(d[i],d[i/3]+1)
////        }
////        if(i%2==0){
////            d[i] = min(d[i],d[i/2]+1)
////        }
////    }
////    print(d[x])
//}

//3
//fun main(){
//    val n = readln().toInt()
//    val array = readln().split(" ").map{it.toInt()}.take(n)
//
//    val temp = Array(100){0}
//
//    temp[0] = 0
//    if(n == 1){
//        temp[1] = array[0]
//    }else if(n==2){
//        temp[1] = array[0]
//        temp[2] = max(array[0], array[1])
//    }else if(n>2){
//        temp[1] = array[0]
//        temp[2] = max(array[0], array[1])
//        for(i in 3..n){
//            temp[i] = max(temp[i-1], temp[i-2]+array[i-1])
//        }
//    }
//    print(temp[n])
//}

//// 4
//fun main(){
//    val n = readln().toInt()
//    val temp = Array(100){0}
//
//    temp[1] = 1
//    temp[2] = 3
//    for(i in 3..n){
//        temp[i] = temp[i-1] + temp[i-2]*2
//    }
//
//    print(temp[n])
//}

////5
//fun main() {
////    val (n, m) = readln().split(" ").map { it.toInt() }
////    val array = Array(n) {
////        readln().toInt()
////    }
////    val temp = Array(100) { 100 }
////
////    temp[0] = 0
////    for (i in 1..m) {
////        for (j in array) {
////            if (temp[i % j] != -1) {
////                temp[i] = min(temp[i], temp[i % j] + (i/j))
////            }
////        }
////        if (temp[i] == 100) {
////            temp[i] = -1
////        }
////    }
////
////    println(temp[m])
//
//
////    val (n, m) = readln().split(" ").map { it.toInt() }
////    val array = Array(n) {
////        readln().toInt()
////    }
////
////    val d = Array(m + 1) { 10001 }
////
////    d[0] = 0
////    for (i in 0 until n) {
////        for (j in array[i]..m) {
////            if (d[j - array[i]] != 10001) {
////                d[j] = min(d[j], d[j - array[i]] + 1)
////            }
////        }
////    }
////
////    if (d[m] == 10001) {
////        println(-1)
////    } else {
////        println(d[m])
////    }
//}