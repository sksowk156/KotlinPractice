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

//// 1
//fun main(){
//}

//// 2
//fun main(){
//    val n = readln().toInt()
//    val array = readln().split(" ").map{it.toInt()}.toMutableList()
//    array.sort()
//
//    fun find(start:Int, end:Int, array:MutableList<Int>):Int?{
//        if(start>end){
//            return null
//        }
//        var mid = (start+end)/2
//
//        if(array[mid]==mid) return mid
//        else if(array[mid]<mid){
//            return find(mid+1,end,array)
//        }else{
//            return find(start,mid-1,array)
//        }
//    }
//
//    println(find(0,n-1,array))
//}

//fun main() {
//    val n = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }.toMutableList()
//    val m = readln().toInt()
//    val find = readln().split(" ").map { it.toInt() }
//
//    array.sort()
//    fun binary_search(find: Int, start:Int, end:Int): Int {
//        if(start>end) return 0
//
//        val mid = (start+end)/2
//
//        return if(array[mid]>find){
//            binary_search(find, start, mid-1)
//        }else if(array[mid]<find){
//            binary_search(find, mid+1,end)
//        }else{
//            array[mid]
//        }
//    }
//
//    for (i in find) {
//        if(binary_search(i,0,n-1)>0){
//            println("YES")
//        }else{
//            println("NO")
//        }
//    }
//}

//fun main() {
//    val (n, x) = readln().split(" ").map { it.toInt() }
//    val array = readln().split(" ").map { it.toInt() }.toMutableList()
//
//    var result = 0
//
//    fun binary_search(find: Int, start: Int, end: Int): Boolean {
//        if (start >= end) return false
//
//        val mid = (start + end) / 2
//
//        if (array[mid] == find) {
//            array.removeAt(mid)
//            result++
//            return true
//        } else if (array[mid] > find) {
//            return binary_search( find, start, mid - 1)
//        } else {
//            return binary_search( find, mid+1, end)
//        }
//    }
//
//    while(true){
//        if(!binary_search(x,0,array.size-1)){
//            break
//        }
//    }
//    println(result)
//}

//fun main(){
//    val n = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }
//
//    fun binary_search(find:Int, start:Int, end:Int):Int{
//        if(start>end) return -1
//        val mid = (start+end)/2
//
//        return if(array[mid] == find){
//            if(mid == find) mid
//            else -1
//        }else if(array[mid]>find){
//            binary_search(find, start, mid-1)
//        }else {
//            binary_search(find, mid+1, end)
//        }
//    }
//
//    var result = -1
//    for(i in array.indices){
//        result = binary_search(i, 0, n-1)
//        if(result>=0) break
//    }
//    println(result)
//}

//fun main(){
//    val n = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }
//
//    fun binary_search(array:List<Int>, start:Int, end:Int):Int{
//        if(start>end) return -1
//        val mid = (start+end)/2
//
//        return if(array[mid] == mid){
//            mid
//        }else if(array[mid]>mid){
//            binary_search(array, start, mid-1)
//        }else {
//            binary_search(array, mid+1, end)
//        }
//    }
//
//    val result = binary_search(array,0, n-1)
//    println(result)
//}

//fun main(){
//    val (house, wifi) = readln().split(" ").map { it.toInt() }
//    val houses = MutableList<Int>(house){
//        readln().toInt()
//    }
//
//    houses.sort()
//
//    fun find_min(array:MutableList<Int>) : Int {
//        val q = mutableListOf<Int>()
//        repeat(wifi - 1) {
//            q.add(Math.abs(array[it] - array[it + 1]))
//        }
//        return q.min()
//    }
//
//    fun binary_search(find:Int, start:Int, end:Int):Int{
//        if(start> end) return -1
//        val mid = (start+end)/2
//
//        if( )
//    }
//
//    val checklist = mutableListOf<Int>()
//
//    var minimum = 0
//
//    fun combination(count : Int, start : Int){
//        if(count == wifi){
//            val min = find_min(checklist)
//            minimum = Math.min(minimum, min)
//        }else{
//            for(i in start until houses.size){
//                checklist.add(houses[start])
//                combination(count+1, start+1)
//                checklist.removeLast()
//            }
//        }
//    }
//
//}