package com.umc.kotilnpractice

import android.os.Build.VERSION_CODES.N
import android.text.BoringLayout
import android.util.Log
import androidx.coordinatorlayout.widget.DirectedAcyclicGraph
import kotlin.math.abs

//val graph = listOf(
//    listOf(),
//    listOf(2, 3, 8),
//    listOf(1, 7),
//    listOf(1, 4, 5),
//    listOf(3, 5),
//    listOf(3, 4),
//    listOf(7),
//    listOf(2, 6, 8),
//    listOf(1, 7)
//)
//
//var visited = Array(9) { false }
//
//fun main() {
////    dfs(graph, 1, visited)
//    bfs(graph, 1, visited)
//}
//
//// Dfs
//fun dfs(graph: List<List<Int>>, start: Int, visited: Array<Boolean>) {
//    visited[start] = true
//    print("$start ")
//
//    for (i in graph[start]) {
//        if (!visited[i]) {
//            dfs(graph, i, visited)
//        }
//    }
//}
//
//// Bfs
//fun bfs(graph: List<List<Int>>, start: Int, visited: Array<Boolean>) {
//    var queue = ArrayDeque<Int>(listOf(start))
//    visited[start] = true
//
//    while (queue.isNotEmpty()) {
//        var v = queue.removeFirst()
//        print("$v ")
//        for (i in graph[v]) {
//            if (!visited[i]) {
//                queue.addLast(i)
//                visited[i] = true
//            }
//        }
//    }
//}

//// 3
//lateinit var matrix: Array<String>
//
//fun main() {
//    val (row, column) = readln().split(" ").map { it.toInt() }
//    matrix = Array(row) {
//        readln().toString()
//    }
//
//    var count = 0
//
//    for (i in 0..row - 1) {
//        for (j in 0..column - 1) {
//            if ((matrix[i][j].code - '0'.code) == 0) {
//                count++
//                bfs(i, j, row, column)
//            }
//        }
//    }
//    println(count)
//}
//
//fun bfs(x: Int, y: Int, row: Int, column: Int) {
//    var queue = ArrayDeque(listOf(Pair(x, y)))
//
//    var string = matrix[x].toCharArray()
//    string[y] = '1'
//    matrix[x] = String(string)
//
//    var dx = arrayOf(-1, 0, 1, 0) // 서, 남, 동, 북
//    var dy = arrayOf(0, -1, 0, 1)
//
//    while (queue.isNotEmpty()) {
//        var v = queue.removeFirst()
//
//        for (i in 0..3) {
//            var X = v.first + dx[i]
//            var Y = v.second + dy[i]
//            if (X >= 0 && Y >= 0 && X < row && Y < column) {
//                if ((matrix[X][Y].code - '0'.code) == 0) {
//                    queue.addLast(Pair(X, Y))
//                    var string = matrix[X].toCharArray()
//                    string[Y] = '1'
//                    matrix[X] = String(string)
//                }
//            }
//        }
//    }
//
//}
//lateinit var graph: Array<IntArray>
//var n : Int = 0
//var m : Int = 0
//
//fun main() {
//    val (x, y) = readln().split(" ").map { it.toInt() }
//
//    n = x
//    m = y
//
//    graph = Array(n){
//        IntArray(m)
//    }
//
//    // 2차원 리스트의 맵 정보 입력 받기
//    for (i in 0 until n) {
//        val str = readln()
//        for (j in 0 until m) {
//            graph[i][j] = str[j] - '0'
//        }
//    }
//
//    var result = 0
//    for(i in 0 until n){
//        for(j in 0 until m){
//            if(dfs(i,j)){
//                result++
//            }
//        }
//    }
//    println(result)
//}
//
//fun dfs(x:Int, y:Int) : Boolean{
//    if(x<=-1 || x>= n || y<= -1 || y>= m){
//        return false
//    }
//    if(graph[x][y]== 0){
//        graph[x][y] = 1
//        dfs(x-1,y)
//        dfs(x,y-1)
//        dfs(x+1,y)
//        dfs(x,y+1)
//        return true
//    }
//    return false
//}

//// 4
//var n: Int = 0
//var m: Int = 0
//var graph = Array(1000) {
//    IntArray(1000)
//}
//var dx = arrayOf(0, 0, -1, 1)
//var dy = arrayOf(-1, 1, 0, 0)
//
//fun main() {
//    var (x, y) = readln().split(" ").map { it.toInt() }
//    n = x
//    m = y
//    for (i in 0 until n) {
//        var string = readln()
//        for (j in 0 until m) {
//            graph[i][j] = string[j] - '0'
//        }
//    }
//
//    println(bfs(0, 0))
//}
//
//fun bfs(x: Int, y: Int) : Int{
//    var queue = ArrayDeque<Pair<Int,Int>>()
//    queue.addLast(Pair(x, y))
//    while (queue.isNotEmpty()) {
//        var a :Pair<Int,Int> = queue.removeFirst()
//        for (i in 0 until 4) {
//            var X = a.first + dx[i]
//            var Y = a.second + dy[i]
//
//            if (X < 0 || Y < 0 || X >= n || Y >= m) {
//                continue
//            }
//            if(graph[X][Y]==0){
//                continue
//            }
//
//            if(graph[X][Y]==1){
//                graph[X][Y] = graph[a.first][a.second]+1 // 이동하면서 경로에 기록을 남겨두고 나중에 해당 위치를 검색해 기록을 확인한다.
//                queue.addLast(Pair(X,Y))
//            }
//        }
//    }
//    return graph[n-1][m-1]
//}

//// 1
//fun main() {
//    val (cityCount, roadCount, shortestDist, startNum) = readln().split(" ").map { it.toInt() }
//
//    val visit = MutableList<Int>(cityCount + 1) { -1 }
//
//    val graph = Array(cityCount + 1) { mutableListOf<Int>() }
//
////    val road = Array(roadCount) {
////        readln().split(" ").map { it.toInt() }.toMutableList()
////    }
////    for (i in road.indices) {
////        graph[road[i][0]].add(road[i][1])
////    }
//
//    repeat(roadCount) {
//        val (a,b)= readln().split(" ").map { it.toInt() }.toMutableList()
//        graph[a].add(b)
//    }
//
//    fun bfs(citynum: Int) {
//        var q = ArrayDeque<Int>()
//        visit[citynum] = 0
//        q.addLast(citynum)
//
//        while (q.isNotEmpty()) {
//            var temp = q.removeFirst()
//            for (i in graph[temp]) {
//                if (visit[i] == -1) {
//                    q.addLast(i)
//                    visit[i] = visit[temp] + 1
//                }
//            }
//        }
//    }
//
//    bfs(startNum)
//    var check = false
//    for (i in 1 until visit.size) {
//        if (visit[i] == shortestDist) {
//            println(i)
//            check = true
//        }
//    }
//
//    if (!check) {
//        println(-1)
//    }
//}

//// 2
//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val graph = Array(n) {
//        readln().split(" ").map { it.toInt() }.take(m).toMutableList()
//    }
//
//    val temp = mutableListOf<MutableList<Int>>()
//
//    for (i in 0 until n) {
//        for (j in 0 until n) {
//            if (graph[i][j] == 2) {
//                temp.add(mutableListOf(i, j))
//            }
//        }
//    }
//
//    var dx = listOf(0, 0, 1, -1)
//    var dy = listOf(1, -1, 0, 0)
//
//    var result = mutableListOf<Int>()
//    fun bfs(startpointX: Int, startpointY: Int, graph: Array<MutableList<Int>>) {
//        var q = ArrayDeque<Pair<Int, Int>>()
//        q.addLast(Pair(startpointX, startpointY))
//        graph[startpointX][startpointY] = 2
//        while (q.isNotEmpty()) {
//            var (x, y) = q.removeFirst()
//            for (i in 0 until 4) {
//                x = x + dx[i]
//                y = y + dy[i]
//                if (x < n && y < n && x > -1 && y > -1) {
//                    if (graph[x][y] == 0) {
//                        q.addLast(Pair(x, y))
//                        graph[x][y] = 2
//                    }
//                }
//            }
//        }
//
//        var count = 0
//        for(i in 0 until n){
//            for(j in 0 until m){
//                if(graph[i][j]==0) count++
//            }
//        }
//        result.add(count)
//    }
//
//
//    fun checkVirus(graph: Array<MutableList<Int>>) {
//        for (i in 0 until temp.size) {
//            var temp = graph
//            var x = temp[i][0]
//            var y = temp[i][1]
//            bfs(x, y, temp)
//        }
//    }
//
//
//    var count = 0
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            if (graph[i][j] == 0) {
//                count++
//                if (count < 3) {
//                    graph[i][j] = 1
//                } else {
//                    checkVirus(graph )
//                    count--
//                    graph[i][j]
//                }
//            }
//        }
//    }
//
//    println(result.min())
//}

//// 3
//fun main() {
//    val (n, k) = readln().split(" ").map { it.toInt() }
//    val graph = Array(n) {
//        readln().split(" ").map { it.toInt() }.take(n).toMutableList()
//    }
//
//    val (s, x, y) = readln().split(" ").map { it.toInt() }
//
//    val dx = listOf(0, 0, 1, -1)
//    val dy = listOf(1, -1, 0, 0)
//
//
//    val virusLocation = mutableListOf<Triple<Int,Int,Int>>()
//    for(i in 0 until n){
//        for(j in 0 until n){
//            if(graph[i][j]!=0){
//                virusLocation.add(Triple(graph[i][j],i,j))
//            }
//        }
//    }
//
//    virusLocation.sortByDescending { it.first }
//
//    fun bfs(x: Int, y: Int, s:Int) {
//        var time = 0
//        var q = ArrayDeque<Pair<Int, Int>>()
//        q.addLast(Pair(x, y))
//        var virusNum = graph[x][y]
//        while (q.isNotEmpty()) {
//            time++
//            val (xx, yy) = q.removeFirst()
//            repeat(4) { i ->
//                var newX = xx + dx[i]
//                var newY = yy + dy[i]
//                if (newX < n && newY < n && newX > -1 && newY > -1) {
//                    if (graph[newX][newY] == 0 || graph[newX][newY]>virusNum) {
//                        graph[newX][newY] = virusNum
//                        q.addLast(Pair(newX, newY))
//                    }
//                }
//            }
//            if(time==s) break
//        }
//    }
//
//    for(i in virusLocation){
//        bfs(i.second,i.third,s)
//    }
//
//    println(graph[x-1][y-1])
//}

//// 4
//fun main() {
//    val n = readln().toInt()
//    val num = readln().split(" ").map { it.toInt() }.take(n).toMutableList()
//    val operator = readln().split(" ").map { it.toInt() }.toMutableList()
//
//    val result = mutableListOf<Int>()
//
//    val oper = mutableListOf<Int>()
//    // 순열은 재귀로 풀자!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    fun dfs(count: Int) { // 입력엔 반복 횟수를 주고
//        if (count == n - 1) { // 바로 탈출 조건을 적어준다.
//            var temp = mutableListOf<Int>() // 값은 복사해서 쓰자 반복해서 쓰기 때문에 원래 데이터가 손상된다.
//            for (i in num) {
//                temp.add(i)
//            }
//
//            // 탈출 조건을 만족했을 때 필요한 연산을 수행하자
//            for (i in oper.indices) {
//                if (oper[i] == 0) {
//                    temp[i + 1] = (temp[i] + temp[i + 1])
//                } else if (oper[i] == 1) {
//                    temp[i + 1] = (temp[i] - temp[i + 1])
//                } else if (oper[i] == 2) {
//                    temp[i + 1] = (temp[i] * temp[i + 1])
//                } else {
//                    temp[i + 1] = (temp[i] / temp[i + 1])
//                }
//            }
//
//            result.add(temp.last())
//
//            // 탈출하자
//            return
//        }
//
//        // 순열을 구할 배열을 순회하면서 재귀로 들어가자(2중 배열일 경우 for문 2개)
//        for (i in operator.indices) {
//            if (operator[i] > 0) {
//                oper.add(i)
//                operator[i]--
//                dfs(count + 1)
//                operator[i]++ // 원래 데이터를 손상시키니까 복구 그래야 다음 싸이클에 원 데이터 값이 사용됨 아니면 변한 값이 적용
//                oper.removeLast() // 원래 데이터를 손상시키니까 복구
//            }
//        }
//    }
//
//    dfs(0)
//    println(result.max())
//    println(result.min())
//}

//// 5
//fun main() {
//    val n = readln().toInt()
//    val graph = Array(n) {
//        readln().split(" ").map { it }.take(n).toMutableList()
//    }
//    val result = mutableListOf<Boolean>()
//
//    val teacher = mutableListOf<Pair<Int, Int>>()
//    for (i in 0 until n) {
//        for (j in 0 until n) {
//            if (graph[i][j] == "T") {
//                teacher.add(Pair(i, j))
//            }
//        }
//    }
//
//    fun dfs(count: Int) {
//        if (count == 3) {
//            var check = false
//            for (i in teacher) {
//                var data = mutableListOf<String>()
//                for (j in 1..n) {
//                    var upx = i.first + j
//                    if (upx < n && graph[upx][i.second] != "O") {
//                        data.add(graph[upx][i.second])
//                    }else{
//                        break
//                    }
//                }
//                for (j in 1..n) {
//                    var downx = i.first - j
//                    if (downx > -1 && graph[downx][i.second] != "O") {
//                        data.add(graph[downx][i.second])
//                    }else{
//                        break
//                    }
//                }
//
//                for (j in 1..n) {
//                    var upy = i.second + j
//                    if (upy < n && graph[i.first][upy] != "O") {
//                        data.add(graph[i.first][upy])
//                    }else{
//                        break
//                    }
//                }
//
//                for (j in 1..n) {
//                    var downy = i.second - j
//                    if (downy > -1 && graph[i.first][downy] != "O") {
//                        data.add(graph[i.first][downy])
//                    }else{
//                        break
//                    }
//                }
//
//                if (data.contains("S")) {
//                    result.add(false)
//                    check = true
//                    break
//                }
//
//                if (check) break
//            }
//            if (!check) result.add(true)
//        } else {
//            for (i in 0 until n) {
//                for (j in 0 until n) {
//                    if (graph[i][j] == "X") {
//                        graph[i][j] = "O"
//                        dfs(count + 1)
//                        graph[i][j] = "X"
//                    }
//                }
//            }
//        }
//    }
//
//    dfs(0)
//
//    if (result.contains(true)) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//}

//// 6
//fun main() {
//    val (n, l, r) = readln().split(" ").map { it.toInt() }
//    val graph = Array(n) {
//        readln().split(" ").map { it.toInt() }.take(n).toMutableList()
//    }
//
//    val dx = listOf(0, 0, 1, -1)
//    val dy = listOf(1, -1, 0, 0)
//
//
//    val visit = mutableListOf<Pair<Int, Int>>()
//    var count = 0
//
//    fun bfs(a: Int, b: Int): Boolean {
//        var move = false
//        val q = ArrayDeque<Pair<Int, Int>>()
//        q.addLast(Pair(a, b))
//        val result = mutableListOf<Int>()
//        val result2 = mutableListOf<Pair<Int, Int>>()
//        result.add(graph[a][b])
//        result2.add(Pair(a, b))
//        visit.add(Pair(a, b))
//        while (q.isNotEmpty()) {
//            val (x, y) = q.removeFirst()
//            repeat(4) { i ->
//                val xx = x + dx[i]
//                val yy = y + dy[i]
//                if (xx > -1 && xx < n && yy > -1 && yy < n) {
//                    println("$xx, $yy")
//                    val cal = abs(graph[x][y] - graph[xx][yy])
//                    if (!visit.contains(Pair(xx, yy))) visit.add(Pair(xx, yy))
//                    if (cal in l..r && !result2.contains(Pair(xx, yy))) {
//                        q.addLast(Pair(xx, yy))
//                        result.add(graph[xx][yy])
//                        result2.add(Pair(xx, yy))
//                    }
//                }
//            }
//        }
//        if (result.size > 1) {
//            val average = result.average()
//            for (i in result2) {
//                graph[i.first][i.second] = average.toInt()
//            }
//            move = true
//        }
//        return move
//    }
//
//    while (true) {
//        var move = false
//        visit.clear()
//        for (i in 0 until n) {
//            for (j in 0 until n) {
//                if (visit.size == n * n) {
//                    count++
//                    break
//                }
//
//                if (!visit.contains(Pair(i, j))) {
//                    if (bfs(i, j)) move = true
//                }
//            }
//            if (visit.size == n * n) break
//        }
//
//        if (move == false) {
//            break
//        }
//    }
//
//    println(count)
//}

//// 7
//fun main() {
//
//    val N = readln().toInt()
//    val board = Array(N) {
//        readln().split(" ").map { it.toInt() }.toIntArray()
//    }
//
//    var answer = 0
//
//    var result = mutableListOf<Int>()
//    fun bfs(robot: Pair<Pair<Int, Int>, Pair<Int, Int>>) {
//        val q = ArrayDeque<Pair<Pair<Int, Int>, Pair<Int, Int>>>()
//        q.addLast(robot)
//        while (q.isNotEmpty()) {
//            var (one, two) = q.removeFirst()
//
//
//
//            if ((board[one.first + 1][one.second] == 0 && two.second == one.second + 1) || (board[two.first][two.second + 1] == 0 && two.second != one.second + 1)) {
//                one = Pair(two.first, two.second)
//                two = Pair(one.first + 1, one.second + 1)
//            }
//
//            val moveH = Pair(Pair(one.first, one.second + 1), Pair(two.first, two.second + 1))
//            val moveV = Pair(Pair(one.first + 1, one.second), Pair(two.first + 1, two.second))
//
//            if (moveH.second.first < N && moveH.second.second < N && board[moveH.second.first][moveH.second.second] == 0) {
//                // 수평 이동 가능
//                board[moveH.second.first][moveH.second.second] = answer + 1
//                if (moveH.second.first == N - 1 && moveH.second.second == N - 1) {
//                    result.add(board[moveH.second.first][moveH.second.second])
//                    println("??")
//                }
//                q.addLast(moveH)
//                board[moveH.second.first][moveH.second.second] = 0
//            }
//            if (moveV.second.first < N && moveV.second.second < N && board[moveV.second.first][moveV.second.second] == 0
//                && board[moveV.second.first - 1][moveV.second.second] == 0
//            ) {
//                // 수평 이동 가능
//                board[moveV.second.first][moveV.second.second] = answer + 1
//                if (moveV.second.first == N - 1 && moveV.second.second == N - 1) {
//                    result.add(board[moveV.second.first][moveV.second.second])
//                    println("!!")
//                }
//                q.addLast(moveV)
//                board[moveV.second.first][moveV.second.second] = 0
//            }
//
//            if ((board[one.first + 1][one.second] == 0 && two.second == one.second + 1) || (board[two.first][two.second + 1] == 0 && two.second != one.second + 1)) {
//                one = Pair(two.first, two.second)
//                two = Pair(one.first + 1, one.second + 1)
//
//                val moveH = Pair(Pair(one.first, one.second + 1), Pair(two.first, two.second + 1))
//                val moveV = Pair(Pair(one.first + 1, one.second), Pair(two.first + 1, two.second))
//
//                if (moveH.second.first < N && moveH.second.second < N && board[moveH.second.first][moveH.second.second] == 0) {
//                    // 수평 이동 가능
//                    board[moveH.second.first][moveH.second.second] = answer + 1
//                    if (moveH.second.first == N - 1 && moveH.second.second == N - 1) {
//                        result.add(board[moveH.second.first][moveH.second.second])
//                        println("??")
//                    }
//                    q.addLast(moveH)
//                    board[moveH.second.first][moveH.second.second] = 0
//                }
//                if (moveV.second.first < N && moveV.second.second < N && board[moveV.second.first][moveV.second.second] == 0
//                    && board[moveV.second.first - 1][moveV.second.second] == 0
//                ) {
//                    // 수평 이동 가능
//                    board[moveV.second.first][moveV.second.second] = answer + 1
//                    if (moveV.second.first == N - 1 && moveV.second.second == N - 1) {
//                        result.add(board[moveV.second.first][moveV.second.second])
//                        println("!!")
//                    }
//                    q.addLast(moveV)
//                    board[moveV.second.first][moveV.second.second] = 0
//                }
//            }
//        }
//    }
//
//    bfs(Pair(Pair(0, 0), Pair(0, 1)))
//    println(result.min())
//}