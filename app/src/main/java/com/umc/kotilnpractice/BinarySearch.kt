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

//fun main() {
//    val words = Array<String>(6) {
//        readln()
//    }
//    val queries = Array<String>(5) {
//        readln()
//    }
//    words.sortWith(compareBy<String> { it.length }.thenBy { it })
//
//    fun binary_search(words: MutableList<String>, find: String, start: Int, end: Int): Boolean {
//        if (start > end) return false
//
//        val mid = (start + end) / 2
//
//        val checkword = words[mid]
//        if (checkword.length == find.length) {
//            var state = 0
//
//            for (i in checkword.indices) {
//                if (find[i] == '?') {
//                    continue
//                }
//
//                if (checkword[i] > find[i]) {
//                    state = 1
//                    break
//                } else if (checkword[i] < find[i]) {
//                    state = 2
//                    break
//                }
//            }
//
//            if (state == 0) {
//                words.removeAt(mid)
//                return true
//            } else if (state == 1) {
//                return binary_search(words, find, start, mid - 1)
//            } else {
//                return binary_search(words, find, mid + 1, end)
//            }
//        } else if (checkword.length > find.length) {
//            return binary_search(words, find, start, mid - 1)
//        } else {
//            return binary_search(words, find, mid + 1, end)
//        }
//    }
//
//    var answer = intArrayOf()
//    for (i in queries) {
//        val temp = mutableListOf<String>()
//        var tempquery = i
//
//        if(i[0]=='?'){
//            for(i in words){
//                temp.add(i.reversed())
//            }
//            temp.sortWith(compareBy<String> { it.length }.thenBy { it })
//            tempquery = i.reversed()
//        }else{
//            temp.addAll(words)
//        }
//
//        var count = 0
//        while (true) {
//            if(!binary_search(temp, tempquery, 0, temp.size - 1)){
//                break
//            }
//            count++
//        }
//        answer.plus(count)
//    }
//
//    println(answer)
//    // 단어 개수별로 먼저 나누자,
//}

fun main() {
    val (size, target) = readln().split(' ').map { it.toInt() }
    val list = readln().split(' ').map { it.toInt() }
    val startIdx = findLeftIdx(0, size - 1, target, list)
    val endIdx = findRightIdx(0, size - 1, target, list)
    println(endIdx - startIdx + 1)
}

fun findLeftIdx(start: Int, end: Int, target: Int, list: List<Int>): Int {
    if (start > end) return -1
    val mid = (start + end) / 2

    return if (list[mid] == target && (mid == 0 || list[mid - 1] < target)) {
        mid
    } else if (list[mid] >= target) {
        findLeftIdx(start, mid - 1, target, list)
    } else {
        findLeftIdx(mid + 1, end, target, list)
    }
}

fun findRightIdx(start: Int, end: Int, target: Int, list: List<Int>): Int {
    if (start > end) return -1
    val mid = (start + end) / 2

    return if (list[mid] == target && (mid == list.size - 1 || list[mid + 1] > target)) {
        mid
    } else if (list[mid] > target) {
        findRightIdx(start, mid - 1, target, list)
    } else {
        findRightIdx(mid + 1, end, target, list)
    }
}