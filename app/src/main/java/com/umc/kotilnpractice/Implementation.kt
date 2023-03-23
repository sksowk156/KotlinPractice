package com.umc.kotilnpractice

import java.util.logging.Logger.global

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