package com.umc.kotilnpractice.codingtest



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

//fun main(){
//    val array = readln().chunked(1).map { it.toInt() }
//
//    val middle = ( array.size / 2 ) - 1
//
//    val left = array.slice(0..middle)
//    val rights = array.slice(middle+1 until array.size)
//
//    if(left.sum() == rights.sum()){
//        println("LUCKY")
//    }else{
//        println("READY")
//    }
//
//}

//fun main(){
//    val array = readln().toCharArray()
//    var temp = mutableListOf<Char>()
//    var temp2 = mutableListOf<Int>()
//    for(i in array){
//        println(i.isDigit())
//        if(i in 'A'..'Z'){
//            println("-letter")
//            temp.add(i)
//        }else{
//            println("-digit")
//            temp2.add(i.digitToInt())
//        }
//    }
//    temp.sort()
//    println(temp.joinToString(""))
//    println(String(temp.toCharArray()).plus(temp2.sum().toString()))
//}

//fun main() {
//    val array = readln().toString()
//    val limitsize = (array.length / 2)
//
//    var min = array.length
//    for (i in 1..limitsize) {
//        var j = 0
//        var temp = ""
//        var count = 1
//        var result = ""
//        while (j + i <= array.length) {
//            val checkword = array.substring(j, j + i)
//            if (temp == checkword) {
//                count++
//            } else {
//                if (count == 1) {
//                    result = result.plus(temp)
//                } else {
//                    result = result.plus(count.toString().plus(temp))
//                }
//                temp = checkword
//                count = 1
//            }
//            j += i
//        }
//
//        if (count == 1) {
//            result = result.plus(temp)
//        } else {
//            result = result.plus(count.toString().plus(temp))
//        }
//
//        val rest = array.substring(j, array.length)
//        if(rest.length > 0){
//            result = result.plus(rest)
//        }
//
//        min = Math.min(min, result.length)
//    }
//    println(min)
//}

//fun main() {
//    val keysize = readln().toInt()
//    val locksize = readln().toInt()
//    var key = Array(keysize) {
//        readln().split(" ").map { it.toInt() }.toMutableList()
//    }
//    val lock = Array(locksize) {
//        readln().split(" ").map { it.toInt() }.toMutableList()
//    }
//
//    val templock = Array(locksize*3){
//        MutableList<Int>(locksize*3){0}
//    }
//
//    for(i in locksize until locksize*2){
//        for(j in locksize until locksize*2){
//            templock[i][j] = lock[i-locksize][j-locksize]
//        }
//    }
//
//    fun checklock(lock:Array<MutableList<Int>>):Boolean{
//        for(i in locksize until 2*locksize){
//            for(j in locksize until 2*locksize){
//                if(lock[i][j] != 1){
//                    return false
//                }
//            }
//        }
//        return true
//    }
//
//    fun rotate(key: Array<MutableList<Int>>): Array<MutableList<Int>> {
//        var temp = Array(keysize) {
//            MutableList<Int>(keysize) { 0 }
//        }
//        for (i in 0 until keysize) {
//            for (j in 0 until keysize) {
//                temp[keysize - j - 1][i] = key[i][j]
//            }
//        }
//        return temp
//    }
//
//    val dx = listOf(0, 1)
//    val dy = listOf(1, 0)
//
//    fun check():Boolean{
//        repeat(4){ it->
//            key = rotate(key)
//            for(x in 0 until 2*locksize){
//                for(y in 0 until 2*locksize){
//
//                    for(i in 0 until locksize){
//                        for(j in 0 until locksize){
//                            templock[i+x][j+y] = templock[i+x][j+y] + key[i][j]
//                        }
//                    }
//
//                    if(checklock(templock)) {
//                        for(i in 0 until 3*locksize){
//                            println(templock[i])
//                        }
//
//                        println(key.contentToString())
//                        return true
//                    }
//
//                    for(i in 0 until locksize){
//                        for(j in 0 until locksize){
//                            templock[i+x][j+y] = templock[i+x][j+y] - key[i][j]
//                        }
//                    }
//
//                }
//            }
//        }
//        return false
//    }
//
//    println(check())
//
//}

//fun main() {
//    val size = readln().toInt()
//    val applecount = readln().toInt()
//
//    val map = Array(size + 1) {
//        MutableList<Int>(size + 1) { 0 }
//    }
//
//    repeat(applecount) {
//        val (x, y) = readln().split(' ').map { it.toInt() }
//        map[x][y] = 2
//    }
//
//    val directionchangecount = readln().toInt()
//
//    val directionchange = Array(directionchangecount) {
//        readln().split(" ")
//    }
//    var directionchangestate = 0
//
//    val dx = listOf(0, 1, 0, -1)
//    val dy = listOf(1, 0, -1, 0)
//
//    var head = 0
//
//    val headNtail = ArrayDeque<Pair<Int, Int>>()
//
//    var movingcount = 0
//    headNtail.add(Pair(1, 1))
//
//    while (true) {
//        // 방향 전환 발생
//        if (directionchangestate < directionchange.size && directionchange[directionchangestate][0].toInt() == movingcount) {
//            if (directionchange[directionchangestate][1].toCharArray()[0] == 'D') {
//                head++
//                if (head > 3) head = 0
//            } else {
//                head--
//                if (head < 0) head = 3
//            }
//            directionchangestate++
//        }
//
//        val nextX = headNtail.last().first + dx[head] // 이동할 다음 장소
//        val nextY = headNtail.last().second + dy[head] // 이동할 다음 장소
//
//        movingcount++
//
//        if (nextX > size || nextY > size || nextX < 1 || nextY < 1 || map[nextX][nextY] == 1) {
//            break
//        }
//
//        headNtail.addLast(Pair(nextX, nextY))
//        if (map[nextX][nextY] == 2) {
//        } else {
//            val temp = headNtail.removeFirst()
//            map[temp.first][temp.second] = 0
//        }
//        map[nextX][nextY] = 1
//    }
//
//    println(movingcount)
//}

//class Solution {
//    fun solution(n: Int, build_frame: Array<IntArray>): Array<IntArray> {
//        val okList = MutableList<IntArray>()
//
//        for (i in build_frame) {
//            val x = i[0]
//            val y = i[1]
//            val type = i[2]
//            if (i[3] == 1) { // 설치
//                okList.add(intArrayOf(x, y, type))
//                if (!checkitsOk(okList)) {
//                    okList.remove(intArrayOf(x, y, type))
//                }
//
//            } else { // 삭제
//                okList.remove(intArrayOf(x, y, type))
//                if (!checkitsOk(okList)) {
//                    okList.add(intArrayOf(x, y, type))
//                }
//            }
//        }
//
//        okList.sortWith(compareBy<IntArray> { it[0] }.thenBy { it[1] }.thenBy { it[2] })
//
//        return okList.toTypedArray()
//    }
//
//    fun checkitsOk(okList: MutableList<IntArray>): Boolean {
//        for (i in okList) {
//            val x = i[0]
//            val y = i[1]
//            val type = i[2]
//
//            if (type == 0) { // 기둥
//                if (y == 0 || okList.contains(intArrayOf(x - 1,
//                        y,
//                        1)) || okList.contains(intArrayOf(x, y, 1)) || okList.contains(intArrayOf(x,
//                        y - 1,
//                        0))
//                ) continue
//                return false
//            } else { // 보
//                if (okList.contains(intArrayOf(x, y - 1, 0)) || okList.contains(intArrayOf(x + 1,
//                        y - 1, 0)) || (okList.contains(intArrayOf(x - 1, y, 1)) && okList.contains(
//                        intArrayOf(x + 1, y, 1)))
//                ) continue
//                return false
//            }
//        }
//
//        return true
//    }
//
//}

//fun main() {
//    val (n, m) = readln().split(' ').map { it.toInt() }
//    val map = Array(n) {
//        readln().split(' ').map { it.toInt() }.toMutableList()
//    }
//
//    val chicken = mutableListOf<Pair<Int,Int>>()
//    val house = mutableListOf<Pair<Int,Int>>()
//    for(i in map.indices){
//        for(j in map[i].indices){
//            if(map[i][j] == 2){
//                chicken.add(Pair(i,j))
//            }else if(map[i][j]==1){
//                house.add(Pair(i,j))
//            }
//        }
//    }
//
//    val combi = mutableListOf<Pair<Int,Int>>()
//    var result = 1000000000
//    fun combination(count:Int, combi:MutableList<Pair<Int,Int>>, start:Int){
//        if(count == m){
//            var sum = 0
//            for(i in house){
//                var shortest = 2*n
//                for(j in combi) {
//                    shortest = Math.min(shortest,
//                        Math.abs(i.first - j.first) + Math.abs(i.second - j.second))
//                }
//                sum += shortest
//            }
//            result = Math.min(result, sum)
//        }else{
//            for(i in start until chicken.size){
//                combi.add(chicken[i])
//                combination(count+1, combi, i+1)
//                combi.removeLast()
//            }
//        }
//    }
//
//    combination(0,combi, 0)
//    println(result)
//}

//fun main(){
//    val n = readln().toInt()
//    val weak = readln().split(' ').map { it.toInt() }
//    val weakArray = MutableList<Int>(n){0}
//
//    for(i in weak){
//        weakArray[i] = 1
//    }
//
//    val dist = readln().split(' ').map { it.toInt() }.toMutableList()
//
//    dist.sortDescending()
//
//    var realresult = n
//    for(x in 0 until n){
//        var resultcount = 0
//        for(i in weak){
//            weakArray[i] = 1
//        }
//        for(i in dist){
//            var longest = Pair(0,0)
//            var temp = mutableListOf<Pair<Int,Int>>()
//
//            for(j in 0 until n){ // 0~12
//                var count = 0
//                for(k in 0 until i){
//                    var loc = (j+x+k) % n
//                    if(weakArray[loc]==1){
//                        count++
//                    }
//                }
//                if(count > 0) temp.add(Pair(j, count))
//            }
//
//
//            if(temp.size > 0) longest = temp.maxBy { it.second }
//            println(longest)
//
//            if(longest.second == 0){
//                break
//            }
//
//            for(k in 0 until i){
//                var loc = (longest.first+k) % n
//                weakArray[loc]= 0
//            }
//
//            resultcount++
//        }
//        println("--------------")
//        realresult = Math.min(realresult, resultcount)
//    }
//
//    println(realresult)
//}

//class Solution {
//    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
//        var answer = 0
//
//        val lost2 = lost.sorted().toMutableList()
//        val reserve2 = reserve.sorted().toMutableList()
//
//        val temp = mutableListOf<Int>()
//
//        for (i in lost2) {
//            for (j in reserve2) {
//                if (i == j) {
//                    temp.add(i)
//                }
//            }
//        }
//
//        var count = 0
//        lost2.removeAll(temp)
//        reserve2.removeAll(temp)
//
//
//        for (i in 0 until lost2.size) {
//            for (j in 0 until reserve2.size) {
//                var front = reserve2[j] - 1
//                var back = reserve2[j] + 1
//
//                if (front > 0) {
//                    if (front == lost2[i]) {
//                        reserve2.removeAt(j)
//                        count++
//                        break
//                    }
//                }
//                if (back < n + 1) {
//                    if (back == lost2[i]) {
//                        reserve2.removeAt(j)
//                        count++
//                        break
//                    }
//                }
//            }
//        }
//
//        answer = n - (lost2.size - count)
//        return answer
//    }
//}