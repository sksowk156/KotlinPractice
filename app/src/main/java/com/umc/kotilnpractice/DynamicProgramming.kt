package com.umc.kotilnpractice

import android.os.Build.VERSION_CODES.P
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

// 2
fun main() {
//    var n = readln().toInt()
//    val temp = arrayOf(5, 3, 2, 1)
//    val array = Array(n + 1) { 100 }
//    array[0] = 0
//    array[1] = 0
//
//    for (i in 2..n) {
//        for (j in temp) {
//            if (j == 1) {
//                if (array[i] > array[i - 1] + 1) {
//                    array[i] = array[i - 1] + 1
//                }
//            } else {
//                if (i % j == 0 && array[i] > array[(i / j)] + 1) {
//                    array[i] = array[(i / j)] + 1
//                }
//            }
//        }
//    }
//    println(array[n])

    val x = readln().toInt()
    val d = Array<Int>(100){0}

    for(i in 2..x){
        d[i] = d[i-1]+1

        if(i%5==0){
            d[i] = min(d[i],d[i/5]+1)
        }
        if(i%3==0){
            d[i] = min(d[i],d[i/3]+1)
        }
        if(i%2==0){
            d[i] = min(d[i],d[i/2]+1)
        }
    }
    print(d[x])
}