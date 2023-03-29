package com.umc.kotilnpractice

import java.util.*
import kotlin.collections.ArrayList
import kotlin.reflect.typeOf

//fun main() {
////    val array = arrayOf(7, 5, 9, 0, 3, 1, 6, 2, 4, 8)
//    val array = arrayOf(7,5,9,0,3,1,6,2,9,1,4,8,0,5,2)
//
////    // 선택 정렬
////    for(i in array.indices){
////        var min_index = i
////        for(j in i+1 until array.size){
////            if(array[min_index] > array[j]){
////                min_index = j
////            }
////        }
////        array[i] = array[min_index].also { array[min_index] = array[i] }
////    }
//
////    // 삽입 정렬
////    for(i in 1 until array.size){
////        for(j in i downTo  1 ){
////            if(array[j] < array[j-1]){
////                array[j] = array[j-1].also { array[j-1] = array[j] }
////            }
////            else{
////                break
////            }
////        }
////    }
//
////    // 퀵 정렬 1
////    fun quick_sort(array:Array<Int>, start : Int, end : Int){
////        if(start >= end){ // 시작점과 끝점이 같거나 역전될 때 -> 사이에 원소가 하나 or 없을 때
////            return
////        }
////        var pivot = start
////        var left = start+1
////        var right = end
////        while(left <= right){
////            while(left <= end && array[left] <= array[pivot]){
////                left++
////            }
////            while(right > start && array[right] >= array[pivot]){
////                right--
////            }
////
////            if(left > right){ // left와 right가 역전되었을 때 -> right과 pivot을 교환하자
////                array[right] = array[pivot].also { array[pivot] = array[right] }
////            }else{
////                array[left] = array[right].also { array[right] = array[left] }
////            }
////
////            quick_sort(array,start,right-1)
////            quick_sort(array,right+1,end)
////        }
////
////    }
////    quick_sort(array,0,array.size - 1)
//
////    // 퀵 정렬 2
////    fun quick_sort(array: Array<Int>): Array<Int> {
////        if (array.size <= 1) {
////            return array
////        }
////
////        var pivot = array[0]
//////        var tail = array.slice(1 until array.size)
////        var tail = array.takeLast(array.size-1)
////
////        var left_side = emptyArray<Int>()
////        var right_side = emptyArray<Int>()
////
////        tail.forEach {
////            if (it <= pivot) {
////                left_side = left_side.plus(it)
////            }
////            if (it > pivot) {
////                right_side = right_side.plus(it)
////            }
////        }
////
////        return quick_sort(left_side).plus(arrayOf(pivot)).plus(quick_sort(right_side))
////    }
////
////    println(quick_sort(array).contentToString())
//
////    var count = Array<Int>(size = array.max()+1){0}
////
////    for(i in array.indices){
////        count[array[i]]++
////    }
////    println(count.contentToString())
////
////    for(i in count.indices){
////        for(j in 0 until count[i]){ // 각 원소에 저장된 중복 횟수만큼 반복해서
////            print("$i ") // 해당 원소를 보여준다.
////        }
////    }
//
////    println(array.contentToString())
//}

//// 2
//fun main(){
//    val a = readln().toInt()
//    val b = MutableList(a){
//        readln().toInt()
//    }
//    b.sortDescending()
//    println(b)
//
//    val n = readln().toInt()
//    var array = Array(n){
//        readln().toInt()
//    }
//
////    array =  array.sortedArrayDescending()
//    array.sortDescending()
//    println(array.contentToString())
//}

//// 3
//fun main(){
//    val n = readln().toInt()
//    val matrix = Array(n){
//        readln().split(" ").map{ it }
//    }
//
//    matrix.sortBy { it[1].toInt() }
//
//    for(i in matrix){
//        print("${i[0]} ")
//    }
//}

//// 4
//fun main() {
//    val (N, K) = readln().split(" ").map { it.toInt() }
//    val arrayA = readln().split(" ").map { it.toInt() }.take(N).toMutableList()
//    val arrayB = readln().split(" ").map { it.toInt() }.take(N).toMutableList()
//
//    arrayA.sort()
//    arrayB.sort()
//
//    for(i in 0 until K){
//        if(arrayA[i] >= arrayB[N-1-i]){
//            break
//        }else{
//            arrayA[i] = arrayB[N-1-i]
//        }
//    }
//
//    println(arrayA.sum())
//}

//// 이진 탐색 재귀
//fun main(){
//    fun binary_search(array:List<Int>, target:Int, start:Int, end:Int):Int?{
//        if(start>end){
//            return null
//        }
//        val mid: Int = (start+end)/2
//
//        return if(array[mid] == target){
//            mid
//        }else if(array[mid]>target){
//            binary_search(array,target,start,mid-1)
//        }else{
//            binary_search(array,target,mid+1,end)
//        }
//    }
//
//    val (n, target) = readln().split(" ").map{it.toInt()}
//    val array = readln().split(" ").map { it.toInt() }.take(n)
//
//    val result = binary_search(array, target, 0, n-1)
//    if(result == null){
//        println("원소가 존재하지 않습니다.")
//    }else {
//        println(result+1)
//    }
//}

// 이진 탐색 반복문
fun main() {
    fun binary_search(array: List<Int>, target: Int, start: Int, end: Int): Int? {
        var start = start
        var end = end
        while (start <= end) {
            val mid = (start + end) / 2
            if (array[mid] == target) {
                return mid
            } else if (array[mid] > target) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
        return null
    }

    val (n, target) = readln().split(" ").map { it.toInt() }
    val array = readln().split(" ").map { it.toInt() }.take(n)

    val result = binary_search(array, target, 0, n - 1)
    if (result == null) {
        println("원소가 존재하지 않습니다.")
    } else {
        println(result + 1)
    }

}