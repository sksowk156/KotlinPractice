package com.umc.kotilnpractice

import android.os.Build.VERSION_CODES.P
import java.lang.Integer.max
import java.util.PriorityQueue
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

// 1
//fun main() {
//    fun findmax(array: List<List<Int>>, n: Int, m: Int): Int {
//
//        val temp = mutableListOf<Int>()
//        repeat(n) { i ->
//            temp.add(array[i][0])
//        }
//
//        for (i in 1 until m) {
//            val temp2 = mutableListOf<Int>()
//            repeat(n) { j ->
//                if (j - 1 < 0) {
//                    temp2.add(max(temp[j], temp[j + 1]) + array[j][i])
//                } else if (j + 1 > n - 1) {
//                    temp2.add(max(temp[j - 1], temp[j]) + array[j][i])
//                } else {
//                    temp2.add(maxOf(temp[j - 1], temp[j], temp[j + 1]) + array[j][i])
//                }
//            }
//            repeat(n){ i->
//                temp[i] = temp2[i]
//            }
//        }
//
//        return temp.max()
//    }
//    val t = readln().toInt()
//    val result = mutableListOf<Int>()
//
//    repeat(t) {
//        val (n, m) = readln().split(" ").map { it.toInt() }
//        val array = readln().split(" ").map { it.toInt() }.chunked(m)
//        result.add(findmax(array, n, m))
//    }
//
//    for (i in result) {
//        println(i)
//    }
//}

//fun main(){
//    repeat(readln().toInt()){
//        val(n, m) = readln().split(" ").map { it.toInt() }
//        val array = readln().split(" ").map { it.toInt() }
//
//        val dp = mutableListOf<MutableList<Int>>()
//        var index = 0
//        for(i in 0 until n){
//            dp.add(array.slice(index..index+m).toMutableList())
//        }
//
//
//        for(j in 1 until m){
//            for(i in 0 until n){
//                var left_up = 0
//                if(i==0) left_up = 0
//                else left_up = dp[i-1][j-1]
//
//                var left_down = 0
//                if(i==n-1) left_down = 0
//                else left_down = dp[i+1][j-1]
//
//                var left_middle = dp[i][j-1]
//
//                dp[i][j] = dp[i][j] + maxOf(left_up,left_middle,left_down)
//            }
//        }
//        var result = 0
//        for(i in 0 until n){
//            result = max(result, dp[i][m-1])
//        }
//
//        println(result)
//    }
//
//}

//// 2
//fun main() {
//    val size = readln().toInt()
//    val array = Array(size) {
//        readln().split(" ").map { it.toInt() }.toMutableList()
//    }
//
//    val temp = array.copyOf()
//
//    for (i in 1 until size) {
//        for (j in 0 until temp[i].size) {
//            var rightUp = 0
//            var leftUp = 0
//            if (j == 0) leftUp = 0
//            else leftUp = temp[i - 1][j - 1]
//            if (j == temp[i].size - 1) rightUp = 0
//            else rightUp = temp[i - 1][j]
//
//            temp[i][j] += max(leftUp, rightUp)
//        }
//    }
//
//    println(temp[size - 1].max())
//}

//// 3
//fun main() {
//    val date = readln().toInt()
//    val data = Array(date) {
//        readln().split(" ").map { it.toInt() }
//    }
//
//    val temp = mutableListOf<Int>()
//
//    for (i in 0 until date) {
//        temp.add(data[i][0] + i - 1)
//    }
//
//    val result = MutableList(date) { 0 }
//
//    for (i in 0 until date) {
//        if (temp[i] > date - 1) {
//            continue
//        }
//        if(result[temp[i]] > data[temp[i]])
//        for(j in temp[i] until date){
//            result[j] = max(result[j],data[])
//        }
//    }
//    println(result[date-1])
//
//}

//// 4
//fun main() {
//    val n = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }
//
//    val result = MutableList(n) { 0 }
//
//    for (i in n - 1 downTo 0 step 1) { // 뒤에서부터 확인한다.
//        var maxx = result[i] // 처음엔 확인할 값을 최대값이라 가정한다.-> '0'이기 때문에 무조건 갱신된다.
//        for (j in i+1 until n) { // 확인할 값 뒤에 존재하는 원소들을 하나씩 확인한다.
//            if (array[i] > array[j]) { // 해당 원소가 확인할 값보다 작은 경우
//                maxx = max(maxx, result[j]) // 해당 원소의 result가 저장하고 있는 값과 현재의 최댓값을 비교해서 가장 큰 값을 저장한다.
//            }
//        }
//        result[i] = maxx+1 // 이렇게 찾은 가장 큰 값에다 확인할 값을 포함시키기 때문에 +1 해주고 result에 저장한다.
//    }
//
//    println(result[0])
//}

//fun main(){
//    val n = readln().toInt()
//    val array = readln().split(" ").map{it.toInt()}
//
//    array.reversed()
//    val dp = MutableList(n){1}
//    for(i in 1 until n){
//        for(j in 0 until i){
//            if(array[j]<array[i]){
//                dp[i] = max(dp[i], dp[j]+1)
//            }
//        }
//    }
//    println(n-dp.max())
//}

//// 5
//fun main() {
//    val n = readln().toInt()
//
//    val result = mutableListOf(1, 2, 3)
//    var i  = 4
//    while (true) {
//        var temp = i
//        while (temp != 1) {
//            if (temp % 2 == 0) {
//                temp /= 2
//            } else if (temp % 3 == 0) {
//                temp /= 3
//            } else if (temp % 5 == 0) {
//                temp /= 5
//            } else {
//                break
//            }
//        }
//
//        if (temp == 1) {
//            result.add(i)
//        }
//
//        if (result.size == n) break
//        i++
//    }
//    println(result[n-1])
//}


//// 6
//fun main() {
//    val a = readln()
//    val b = readln()
//
//    val a_result = mutableListOf<Char>()
//    val b_result = mutableListOf<Char>()
//
//    for (i in a.indices) {
//        for (j in b.indices) {
//            if (a[i] == b[j]) {
//                a_result.add(a[i])
//                b_result.add(b[i])
//                break
//            }
//        }
//    }
//    println(a_result.toString())
//    println(b_result.toString())
//
//    if (a.length - a_result.size > b.length - b_result.size) println(a.length - a_result.size)
//    else println(b.length - b_result.size)
//}

//fun main() {
//    var num = readln().toInt()
//
//    val result = MutableList<Int>(num+1) { 0 }
//
//    result[1] = 0 // 1
//    result[2] = 1 // 2
//    result[3] = 1 // 3
//    result[5] = 1// 5
//
//    fun find(num: Int) {
//        val temp = mutableListOf<Int>()
//
//        if (num % 5 == 0) {
//            temp.add(result[num / 5] + 1)
//        }
//        if (num % 3 == 0) {
//            temp.add(result[num / 3] + 1)
//        }
//        if (num % 2 == 0) {
//            temp.add(result[num / 2] + 1)
//        }
//        if (num > 1 ){
//            temp.add(result[num -1] + 1)
//        }
//
//        result[num] = temp.min()
//    }
//
//    for (i in 4 .. num ) {
//        find(i)
//    }
//
//    println(result[num])
//}

//fun main(){
//    val size = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }
//
//    val food = MutableList<Int>(size){0}
//    food[0] = array[0]
//    food[1] = max(array[0], array[1])
//
//    for(i in 2 until size){
//        food[i] = max(food[i-1],food[i-2]+array[i])
//    }
//
//    println(food[size-1])
//}

//fun main() {
//    val n = readln().toInt()
//
//    val result = MutableList<Int>(n + 1) { 0 }
//    result[1] = 1
//    result[2] = 3
//    for (i in 3..n) {
//        result[i] = 1 * result[i - 1] + 2 * result[i - 2]
//    }
//
//    println(result)
//}

//fun main(){
//    val (size, target) = readln().split(" ").map{it.toInt()}
//    val array = MutableList<Int>(size){
//        readln().toInt()
//    }
//
//    val result = MutableList<Int>(100){100}
//    for(i in array){
//        result[i] = 1
//    }
//
//    for(i in array.min()+1 .. target){
//        for(j in array){
//            if(i % j == 0){
//                result[i] = Math.min(i/j, result[i])
//            }
//            if(i - j > 0){
//                result[i] = Math.min(result[i-j]+1, result[i])
//            }
//        }
//    }
//
//    println(result)
//}

//fun main() {
//    val count = readln().toInt()
//
//    val dx = listOf(0,1,-1)
//    val dy = listOf(1,1,1)
//
//    repeat(count) {
//        val (x, y) = readln().split(" ").map { it.toInt() }
//        val temp = readln().split(" ").map { it.toInt() }.toMutableList()
//        val array = Array(x){
//            arrayOf<Int>()
//        }
//
//        val result = mutableListOf<Int>()
//
//        for(i in 0 until x){
//            array[i] = temp.slice(y*i until (y*i)+y).toTypedArray()
//        }
//
//        for(i in 0 until x){
//            println(array[i].contentToString())
//        }
//        println("")
//
//
//        for(i in 1 until y){
//            for(j in 0 until x){
//                var max = array[j][i]
//                if(j+1<x){
//                    max = Math.max(max,array[j+1][i-1]+ array[j][i])
//                }
//                if(j-1>-1){
//                    max= Math.max(max,array[j-1][i-1]  + array[j][i])
//                }
//                max = Math.max(max,array[j][i-1]  + array[j][i])
//                array[j][i]= max
//            }
//        }
//
//        for(i in 0 until x){
//            println(array[i].contentToString())
//        }
//
//        println(array[x-1][y-1])
//    }
//}

//fun main() {
//    val n = readln().toInt()
//
//    val array = Array(n) {
//        readln().split(" ").map { it.toInt() }.toMutableList()
//    }
//
//    for (i in 1 until n) {
//        for (j in 0 until array[i].size) {
//            var max = array[i][j]
//            if (j - 1 > -1) {
//                max = Math.max(max, array[i][j] + array[i-1][j-1])
//            }
//            if (j < array[i - 1].size) {
//                max = Math.max(max, array[i][j] + array[i-1][j])
//            }
//            array[i][j] = max
//        }
//    }
//
//    println(array[n-1].max())
//}

//fun main() {
//    val n = readln().toInt()
//    val array = Array(n + 2) {
//        MutableList(2){0}
//    }
//
//    repeat(n) {
//        array[it + 1] = readln().split(" ").map { it.toInt() }.toMutableList()
//    }
//
//    val result = MutableList<Int>(n + 2) { 0 }
//    for (i in 1..n+1) {
//
//        if(result[i] == 0){
//            val temp = result.slice(1..i)
//            if (result[i] < temp.max())
//                result[i] = temp.max()
//        }
//
//        val targetdate = array[i][0] + i
//        if (targetdate <= n+1) {
//            result[targetdate] = Math.max(result[targetdate], result[i] + array[i][1])
//        }
//
//    }
//
//    println(result[n+1])
//}

//fun main() {
//    val size = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }.toMutableList()
//
//    val result = MutableList<Int>(size) { 1 }
//
//    for(i in 1 until size){
//            var maxx = 1
//            for(j in i-1  downTo 0){
//                if(array[i] < array[j]){
//                    maxx = Math.max(maxx, result[j]+1)
//                }
//            }
//            result[i] = maxx
//    }
//    println(size - result.max())
//}

//fun main(){
//    val n = readln().toInt()
//
//    val result = mutableListOf<Int>(1)
//    val num = listOf(2,3,5)
//
//    var i = 2
//    while(result.size < n){
//        for(j in num){
//            if(i%j==0 && result.contains(i/j)){
//                result.add(i)
//                break
//            }
//        }
//        i++
//    }
//    println(result)
//}

//fun main(){
//    val (n,m) = readln().split(" ").map { it.toInt() }
//
//    val nearnode = Array(n+1){
//        mutableListOf<Int>()
//    }
//
//    repeat(m){
//        val (start, end) = readln().split(" ").map { it.toInt() }
//        nearnode[start].add(end) // 양방향이므로
//        nearnode[end].add(start)
//    }
//
//    val (endn, middlen) = readln().split(" ").map { it.toInt() }
//
//    fun find(start:Int, end : Int) : Int{
//        val result = MutableList<Int>(n+1){1000}
//        val q = ArrayDeque<Int>()
//        result[start] = 0
//        q.add(start)
//        while (q.isNotEmpty()){
//            val temp = q.removeFirst()
//            val dist = result[temp]+1
//
//            for(i in nearnode[temp]){
//                if(result[i] > dist) {
//                    result[i] = dist
//                    q.addLast(i)
//                }
//            }
//        }
//        println(result)
//        return if(result[end] == 1000) -1
//        else result[end]
//    }
//
//    println("${find(1, middlen)}, ${find(middlen, endn)}" )
//}

//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//
//    val nearnode = Array(n + 1) {
//        Array(n+1){1000}
//    }
//
//    repeat(m) {
//        val (start, end) = readln().split(" ").map { it.toInt() }
//        nearnode[start][end] = 1
//        nearnode[end][start] = 1 // 양방향이므로
//    }
//
//    for(i in 0 until n+1){
//        nearnode[i][i] = 0
//    }
//
//    val (endn, middlen) = readln().split(" ").map { it.toInt() }
//
//    for(k in 1 until n+1){
//        for(i in 1 until n+1){
//            for(j in 1 until n+1){
//                nearnode[i][j] = Math.min(nearnode[i][j], nearnode[i][k]+nearnode[k][j])
//            }
//        }
//    }
//
//    for(i in 0 until n+1){
//        println(nearnode[i].contentToString())
//    }
//
//    println(nearnode[1][middlen])
//    println(nearnode[middlen][endn])
//}