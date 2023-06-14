package com.umc.kotilnpractice

import androidx.lifecycle.viewmodel.CreationExtras.Empty
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

//fun main(){
//    val a = readln().toCharArray()
//
//    val dx = listOf(2,1,-1,-2,2,1,-1,-2)
//    val dy = listOf(1,2,-2,-1,-1,-2,2,1)
//
//    val x = a[0]-'a' - 1
//    val y = a[1]-'0' - 1
//
//    var count = 0
//    repeat(8){ i->
//        val tempx = x + dx[i]
//        val tempy = y+dy[i]
//        if(tempx>-1 && tempx<8 && tempy >-1 && tempy <8){
//            count++
//        }
//    }
//    println(count)
//}

//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    var (x, y, direction) = readln().split(" ").map { it.toInt() }
//    val map = Array(n) {
//        readln().split(" ").map { it.toInt() }.take(m).toMutableList()
//    }
//
//    val dx = listOf(-1,0,1,0)
//    val dy = listOf(0,1,0,-1)
//
//    var count = 0
//    var spin = 0
//
//    while(true){
//        if(spin == 4){
//            var tempX = x-dx[direction]
//            var tempY = y-dy[direction]
//            if(map[tempX][tempY]==1) break
//            else{
//                x = tempX
//                y = tempY
//                spin = 0
//            }
//        }else{
//            if(direction == 0) direction = 3
//            else direction--
//            spin++
//
//            var tempX = x+dx[direction]
//            var tempY = y+dy[direction]
//            if(map[tempX][tempY]==0){
//                x = tempX
//                y = tempY
//                map[x][y] = -1
//                spin = 0
//                count++
//            }
//        }
//    }
//
//    println(count)
//}

//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    var (x, y, direction) = readln().split(" ").map { it.toInt() }
//    val map = Array(n) {
//        readln().split(" ").map { it.toInt() }.take(m).toMutableList()
//    }
//    val dx = listOf(-1, 0, 1, 0)
//    val dy = listOf(0, 1, 0, -1)
//
//    val visited = Array(n) {
//        MutableList(m) { 0 }
//    }
//    visited[x][y] = 1
//
//    fun turn_left() {
//        direction--
//        if (direction == -1) direction = 3
//    }
//
//    var count = 1
//    var turn_time = 0
//    while (true) {
//        turn_left()
//        var nx = x + dx[direction]
//        var ny = y + dy[direction]
//        if (visited[nx][ny] == 0 && map[nx][ny] == 0) {
//            visited[nx][ny] = 1
//            x = nx
//            y = ny
//            count++
//            turn_time = 0
//            continue
//        } else {
//            turn_time++
//        }
//
//        if (turn_time == 4) {
//            nx = x - dx[direction]
//            ny = y - dy[direction]
//            if (map[nx][ny] == 0) {
//                x = nx
//                y = ny
//            } else {
//                break
//            }
//            turn_time = 0
//        }
//    }
//
//    print(count)
//}

//fun main(){
//    val array = readln().toCharArray()
//    var front = 0
//    var back = 0
//    for(i in 0 until array.size/2){
//        front += array[i].digitToInt()
//        back += array[i + array.size/2].digitToInt()
//    }
//
//    if(front == back) println("LUCKY") else println("READY")
//}

//fun main(){
//    val array = readln().toCharArray()
//
//    var num = mutableListOf<Int>()
//    var char = mutableListOf<Char>()
//    for(i in array){
//        if(i-'0' in 0..9) num.add(i.digitToInt())
//        else char.add(i)
//    }
//
//    char.sort()
//    char.addAll(num.sum().toString().toMutableList())
//    println(char.joinToString(""))
//}

//fun main() {
//    val array = readln().toMutableList()
//
//    val result = mutableListOf<Int>() // 압축 배열의 길이를 저장할 변수
//
//    for (i in 1..array.size / 2) { // array 절반 크기만큼 반복(1씩 자르기~ 절반 자르기 -> 절반이여야 최소 2개가 나오므로)
//        val temp = mutableListOf<Char>()
//        val result2 = mutableListOf<Char>()
//
//        temp.addAll(array.slice(0 until i))
//        var count: Int = 1
//
//        if(array.size == 1) println(1)
//
//        for (j in i until array.size step i) {
//            var endpoint = 0
//            endpoint = if (j + i > array.size) array.size else j+i
//
//            if (array.slice(j until endpoint) != temp) {
//                if (count > 1) result2.addAll(count.toString().toMutableList())
//                result2.addAll(temp)
//                temp.clear()
//                temp.addAll(array.slice(j until endpoint))
//                count = 1
//            } else count++
//        }
//        if (count > 1) result2.addAll(count.toString().toMutableList())
//        result2.addAll(temp)
//
//        println("result : $result2")
//
//        result.add(result2.size)
//    }
//
//    result.sort()
//    println(result[0])
//}

//fun main() {
//    val n = readln().toInt()
//    val apple = readln().toInt()
//    val appleArray = Array(apple) {
//        readln().split(" ").map { it.toInt() }
//    }
//
//    val trans = readln().toInt()
//    val transArray = Array(trans) {
//        readln().split(" ").map { it.toString() }
//    }
//
//    val map = Array(n + 1) {
//        MutableList(n + 1) { 0 }
//    }
//
//    repeat(apple) {
//        map[appleArray[it][0]][appleArray[it][1]] = 1
//    }
//
//    var direction = 0
//    val dx = listOf(0, 1, 0, -1) // 오른쪽, 밑으로, 왼쪽, 위로
//    val dy = listOf(1, 0, -1, 0)
//
//    fun turn(char: Char) {
//        if (char == 'D') {
//            direction++
//        } else {
//            direction--
//        }
//        if (direction == 4) direction = 0
//        if (direction == -1) direction = 3
//    }
//
//    var count = 0
//    var x = 1
//    var y = 1
//    map[x][y] = 2 // 첫 시작 머리 위치
//
//    val snaketail = ArrayDeque<Pair<Int, Int>>()
//    snaketail.addLast(Pair(x, y)) // 첫 꼬리 위치
//
//    while (true) {
//        count++
//        val tempx = x + dx[direction]
//        val tempy = y + dy[direction]
//
//        var flag = 0
//        for (i in snaketail) { // 꼬리에 닿였을 때
//            if (tempx == i.first && tempy == i.second) {
//                flag = 1
//                break
//            }
//        }
//        if (flag == 1 || tempx <= 0 || tempy <= 0 || tempx > n || tempy > n) break // 종료 조건
//
//        // 이동할 곳에서
//        if (map[tempx][tempy] == 1) { // 사과 발견
//            snaketail.addLast(Pair(tempx, tempy))  // 꼬리 저장
//        } else if(map[tempx][tempy]==0){ // 사과 없음
//            val (tailX, tailY) = snaketail.removeFirst()
//            map[tailX][tailY] = 0 // 꼬리 자리 옮기기
//            snaketail.addLast(Pair(tempx, tempy)) // 꼬리도 옮기기
//        }
//        x = tempx // 머리 옮기기
//        y = tempy
//        map[x][y] = 2
//
//        for (i in transArray) {
//            if (i[0].toInt() == count) {
//                turn(i[1].toCharArray()[0])
//                break
//            }
//        }
//    }
//
//    println(count)
//}

//fun main() {
//    val count = readln().toInt()
//
//    val build_frame = Array(count) {
//        readln().split(" ").map { it.toInt() }
//    }
//
//    val n = 100
//    val answer = mutableListOf<IntArray>()
//    val map = Array(n + 1) {
//        MutableList<Int>(n + 1) { 0 }
//    }
//    // 기둥이면 1, 보면 2로 하자
//
//    for (i in build_frame) { // 0 : x // 1 : y // 2 : 기둥 or 보 // 3 : 설치 or 삭제
//        val x = i[0]
//        val y = i[1]
//        val what = i[2]
//        val state = i[3]
//
//        if (state == 1) {
//            if (what == 1) {
//                if ((x + 1 < n && y - 1 >= 0 && map[x + 1][y - 1] == 1) || (y - 1 >= 0 && map[x][y - 1] == 1)
//                    || ((x + 1 < n && map[x + 1][y] == 2) && (x - 1 >= 0 && map[x - 1][y] == 2))
//                ) {
//                    // 보 설치
//                    map[x][y] = 2
//                    answer.add(intArrayOf(x, y, 1))
//                }
//            } else {
//                if (y == 0 || (x - 1 >= 0 && map[x - 1][y] == 2) || (y - 1 >= 0 && map[x][y - 1] == 1) || map[x][y] == 2) {
//                    // 기둥 설치
//                    map[x][y] = 1
//                    answer.add(intArrayOf(x, y, 0))
//                }
//            }
//        } else {
//            var deleteX = -1
//            var deleteY = -1
//            var deletewhat = -1
//            var position = -1
//            for (i in 0 until answer.size) {
//                if (x == answer[i][0] && y == answer[i][1] && what == answer[i][2]) {
//                    deleteX = answer[i][0]
//                    deleteY = answer[i][1]
//                    deletewhat = answer[i][2]
//                    position = i
//                }
//            }
//            if (position != -1) {
//                answer.removeAt(position)
//                map[deleteX][deleteY] = 0
//                var check = false
//                for (i in 0 until answer.size) {
//                    val tempX = answer[i][0]
//                    val tempY = answer[i][1]
//                    val tempwhat = answer[i][2]
//                    if (tempwhat == 1) { // 보
//                        if ((tempX + 1 < n && tempY - 1 >= 0 && map[tempX + 1][tempY - 1] == 1) || (tempY - 1 >= 0 && map[tempX][tempY - 1] == 1)
//                            || ((tempX + 1 < n && map[tempX + 1][tempY] == 2) && (tempX - 1 >= 0 && map[tempX - 1][tempY] == 2))
//                        ) {
//                        } else {
//                            check = true
//                            break
//                        }
//                    } else { // 기둥
//                        if (tempY == 0 || (tempX - 1 >= 0 && map[tempX - 1][tempY] == 2) || (tempY - 1 >= 0 && map[tempX][tempY - 1] == 1) || map[tempX][tempY] == 2) {
//                        } else {
//                            check = true
//                            break
//                        }
//                    }
//                }
//
//                if (check) { // 삭제하지 않을 때
//                    answer.add(intArrayOf(deleteX, deleteY, deletewhat))
//                    map[deleteX][deleteY] = deletewhat + 1
//                }
//            }
//        }
//    }
//    answer.sortWith(compareBy<IntArray> { it[0] }.thenBy { it[1] }.thenBy { it[2] })
//    for(i in answer){
//        println(i.contentToString())
//    }
//    answer.toTypedArray()
//}

//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val house = mutableListOf<Pair<Int, Int>>()
//    val store = mutableListOf<Pair<Int, Int>>()
//    repeat(n) {
//        var temp = readln().split(" ").map { it.toInt() }
//        for (i in 0 until temp.size) {
//            if (temp[i] == 1) {
//                house.add(Pair(it, i))
//            } else if (temp[i] == 2) {
//                store.add(Pair(it, i))
//            }
//        }
//    }
//
////    for (i in 0 until n) {
////        for (j in 0 until n) {
////            if (map[i][j] == 1) {
////                house.add(Pair(i, j))
////            } else if (map[i][j] == 2) {
////                store.add(Pair(i, j))
////            }
////        }
////    }
//
//    var result = 10000
//    var selectedStore = mutableListOf<Pair<Int, Int>>()
//    fun storeCount(startidx: Int, count: Int) {
//        if (count == m) {
//            var temp = 0
//            for (i in house) {
//                var dist = 1000
//                for (j in selectedStore) {
//                    if(dist==1) break
//                    dist = Math.min(dist, Math.abs(i.first - j.first) + Math.abs(i.second - j.second))
//                }
//                temp += dist
//            }
//            result = Math.min(result, temp)
//        } else {
//            for (i in startidx until store.size) {
//                selectedStore.add(store[i])
//                storeCount(startidx + 1, count+1)
//                selectedStore.remove(store[i])
//            }
//        }
//    }
//
//    storeCount(0, 0)
//    println(result)
//}

fun main(){
    val array = readln().chunked(1).map { it.toInt() }

    val middle = ( array.size / 2 ) - 1

    val left = array.slice(0..middle)
    val rights = array.slice(middle+1 until array.size)

    if(left.sum() == rights.sum()){
        println("LUCKY")
    }else{
        println("READY")
    }

}