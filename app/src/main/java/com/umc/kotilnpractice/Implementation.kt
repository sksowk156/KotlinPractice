package com.umc.kotilnpractice

import java.util.logging.Logger.global
import kotlin.math.abs
import kotlin.math.min

// 4-2 /////////////////////////////////////////////////////////////////////////////////////////////
//fun main(){
//    val hour = readln().toInt()
//
////    var count = 0
////
////    var hflag = false
////    var mflag = false
////    var sflag = false
////    for(i in 0..hour){
////        hflag = i.toString().contains('3')
////        for(min in 0..59){
////            mflag = min.toString().contains('3')
////            for(sec in 0 .. 59){
////                sflag = sec.toString().contains('3')
////
////                if((hflag || mflag || sflag))
////                    count++
////            }
////        }
////    }
////    println(count)
//
//    var count = 0
//
//    for(i in 0..hour){
//        for(min in 0..59){
//            for(sec in 0 .. 59){
//                var temp = i.toString()+min.toString()+sec.toString()
//
//                if( temp.contains('3'))
//                    count++
//            }
//        }
//    }
//    println(count)
//}

// 2 ///////////////////////////////////////////////////////////////////////////////////////////////
//fun main() {
//    val position = readln()
//    println(position)
//
//    val first = position[0].code - 96
//    val second = position[1].code - 48
//
//    var temp = listOf(
//        Pair((first - 2), (second + 1)),
//        Pair((first - 2), (second - 1)),
//        Pair((first - 1), (second + 2)),
//        Pair((first - 1), (second - 2)),
//        Pair((first + 1), (second + 2)),
//        Pair((first + 1), (second - 2)),
//        Pair((first + 2), (second + 1)),
//        Pair((first + 2), (second - 1))
//    )
//
//    var count = 0
//    for (i in temp) {
//        if (i.first > 0 && i.second > 0 && i.first < 9 && i.second < 9) {
//            count++
//        }
//    }
//
//    println(count)
//}
//fun main(){
//    val data = readln()
//    val row = data[0].code - 'a'.code + 1
//    val column = data[1].code - '1'.code + 1
//
//    val steps = arrayOf(Pair(-2,1), Pair(-2,-1), Pair(-1,2), Pair(-1,-2), Pair(2,1), Pair(2,-1), Pair(1,2), Pair(1,-2))
//    var result = 0
//    for(step in steps){
//        val next_row = row + step.first
//        val next_column = column + step.second
//        if(next_row >= 1 && next_column >= 1 && next_row <= 8 && next_column <= 8){
//            result++
//        }
//    }
//    println(result)
//}

// 3 ///////////////////////////////////////////////////////////////////////////////////////////////
//
//var global_direction = 0
//
//fun main() {
//    val (row, column) = readln().split(" ").map { it.toInt() }
//    var (x, y, direction) = readln().split(" ").map { it.toInt() }
//    global_direction = direction
//    // 2차원 입력은 이렇게!!
//    val matrix = Array(row) {
//        readln().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    // 0으로 초기화된 배열
//    val visit_matrix = Array(row) { IntArray(column) }
////    for (row in visit_matrix) {
////        println(row.contentToString())
////    }
//
//    visit_matrix[x][y] = 1
//
//    val dx = arrayOf(-1, 0, 1, 0)
//    val dy = arrayOf(0, 1, 0, -1)
//
//    var count = 1
//    var turn_time = 0
//    while (true) {
//        turn_left()
//        var nx = x + dx[global_direction]
//        var ny = y + dx[global_direction]
//        if(matrix[nx][ny] ==0 && visit_matrix[nx][ny]==0){
//            matrix[nx][ny] = 1
//            x = nx
//            y = ny
//            count++
//            turn_time = 0
//            continue
//        }else{
//            turn_time++
//        }
//
//        if(turn_time == 4){
//            nx = x - dx[global_direction]
//            ny = y - dy[global_direction]
//
//            if(matrix[nx][ny] == 1){
//                break
//            }else{
//                x = nx
//                y = ny
//                turn_time = 0
//            }
//        }
//    }
//    println(count)
//}
//
//fun turn_left() {
//    global_direction -= 1
//    if (global_direction == -1) {
//        global_direction = 3
//    }
//}

//// 1
//fun main(){
//    val array = readln()
//
//    var left = 0
//    var right = 0
//    for(i in 0 until array.length/2){
//        left += array[i].digitToInt()
//        right += array[i+array.length/2].digitToInt()
//    }
//    if(left==right){
//        println("LUCKY")
//    }else{
//        println("READY")
//    }
//}

// 2
//fun main(){
//    var array = readln()
//
//    var temp1 = mutableListOf<Char>()
//    var sum = 0
//    for(i in array){
//        if(i-'0' in 0..9){
//            sum += i.digitToInt()
//        }else{
//            temp1.add(i)
//        }
//    }
//
//    temp1.sort().toString()
//    println(temp1.plus(sum.toString()).joinToString(""))
//}

//// 3
//fun main(){
//    val array = readln()
//
//    var min = array.length
//    for(step in 1 until array.length){
//        var result = ""
//        var count =1
////        println(step)
//        var prev = ""
//        for(i in 0 until array.length step step){
//            prev = array.substring(i,i+step)
//            if(i+step < array.length){
//                if(prev == array.substring(i,i+step)){
//                    count++
//                }else{
//                    if(count== 1){
//                        result += (prev)
//                    }else{
//                        result += (count.toString())
//                        result += (prev)
//                    }
//                    count = 1
//                }
//            }
//        }
//
//        if(count== 1){
//            result += (prev)
//        }else{
//            result += (count.toString())
//            result += (prev)
//        }
//
//        min = min(min,result.length)
//    }
//
//    println(min)
//}


//// 4
//fun main(){
//    val (m,n) = readln().split(" ").map { it.toInt() }
//    var Key = Array(m){
//        readln().split(" ").map { it.toInt() }.take(m).toMutableList()
//    }
//    var Lock = Array(n){
//        readln().split(" ").map { it.toInt() }.take(n).toMutableList()
//    }
//
//    val Keyhole = mutableListOf<Pair<Int,Int>>()
//    val Lockhole = mutableListOf<Pair<Int,Int>>()
//    for(i in 0 until n){
//        for(j in 0 until n ){
//            if(Lock[i][j] == 0) {
//                Lockhole.add(Pair(i,j))
//            }
//            if(Key[i][j]==1){
//                Keyhole.add(Pair(i,j))
//            }
//        }
//    }
//
//    val absKeyhole = mutableListOf<Pair<Int,Int>>()
//    for(i in Keyhole.indices){
//        absKeyhole.add(Pair(Keyhole[i].first-Keyhole[0].first,Keyhole[i].second-Keyhole[0].second))
//    }
//
//    val array = arrayOf("asd","dfd")
//    println(array[0].find { it=='s' })
//}

//// 5
//fun main() {
//    val boardsize = readln().toInt()
//    val apple = readln().toInt()
//    val appleLocation = Array(apple) {
//        readln().split(" ").map { it.toInt() }.toMutableList()
//    }
//    val move = readln().toInt()
//    val moveWay = Array(move) {
//        readln().split(" ").toMutableList()
//    }
//
//    val snake = ArrayDeque<Pair<Int,Int>>()
//    snake.addLast(Pair(0,0))
//
//    val snakeMove = Array(snake.size) {
//        mutableListOf<Pair<Int, Int>>()
//    }
//
//    fun changeDirection(which: Char, now: Pair<Int, Int>): Pair<Int, Int> {
//        if (which == 'L') {
//            if (now == Pair(0, 1)) {
//                return Pair(-1, 0)
//            } else if (now == Pair(1, 0)) {
//                return Pair(0, 1)
//            } else if (now == Pair(0, -1)) {
//                return Pair(1, 0)
//            } else {
//                return Pair(0, -1)
//            }
//        }
//
//        if (now == Pair(0, 1)) {
//            return Pair(1, 0)
//        } else if (now == Pair(1, 0)) {
//            return Pair(0, -1)
//        } else if (now == Pair(0, -1)) {
//            return Pair(-1, 0)
//        } else {
//            return Pair(0, 1)
//        }
//    }
//
//    fun snakeMove() {
//        var count = 0
//        var nowdirection = Pair(0,1)
//        while (true) {
//            if (snake[0].first == boardsize || snake[0].second == boardsize || snake[0].first == -1 || snake[0].second == -1) {
//                break
//            }
//            var result = false
//            for(i in snake){
//                if(snake[0].first == i.first || snake[0].second== i.second){
//                    result = true
//                    break
//                }
//            }
//            if(result){
//                break
//            }
//            count++
//
//            for(i in snake.indices){
//                snake[i] = Pair(snake[i].first + nowdirection.first, snake[i].second + nowdirection.second)
//            }
//
//            for(i in appleLocation){
//                if(snake[0].first + nowdirection.first == i[0] && snake[0].second + nowdirection.second == i[1] ){
//                    snake.addLast()
//                }
//            }
//        }
//    }
//}

//// 6
//fun main(){
//
//}

//// 7
//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val array = Array(n) {
//        readln().split(" ").map { it.toInt() }.take(n).toMutableList()
//    }
//
//    var count =0
//    for(i in 0 until n){
//        for(j in 0 until n){
//            if(array[i][j]==2){
//                count++
//            }
//        }
//    }
//
//    fun findstoredistlist(x: Int, y: Int) : MutableList<Int>{
//        var result = mutableListOf<Int>()
//        for (i in 0 until n) {
//            for (j in 0 until n) {
//                if (abs(x - i) + abs(y - j) > 0) {
//                    if (array[i][j] == 2) {
//                        result.add(abs(x - i) + abs(y - j))
//                    }
//                }
//            }
//        }
//        return result
//    }
//
//    var list = MutableList<MutableList<Int>>(count) {
//        mutableListOf<Int>()
//    }
//
//    for (i in 0 until n) {
//        for (j in 0 until n) {
//            if (array[i][j] == 1) {
//                list.add(findstoredistlist(i,j))
//            }
//        }
//    }
//
//    val last = mutableListOf<Int>()
//    for(i in 0 until list[0].size){
//        var sum = 0
//        for(j in 0 until count){
//            sum += list[j][i]
//        }
//        last.add(sum)
//    }
//
//    println(last.min())
//}