package com.umc.kotilnpractice

import android.content.res.TypedArray
import android.os.Build.VERSION_CODES.N
import android.os.Build.VERSION_CODES.P
import android.text.BoringLayout
import android.util.Log
import androidx.coordinatorlayout.widget.DirectedAcyclicGraph
import kotlinx.coroutines.*
import org.w3c.dom.NameList
import java.nio.file.Files.move
import java.util.ArrayDeque
import kotlin.coroutines.CoroutineContext
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

//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val array = Array(n) {
//        readln().toCharArray().map { it.digitToInt() }.toMutableList()
//    }
//
//    val dx = arrayOf(0, 0, 1, -1)
//    val dy = arrayOf(1, -1, 0, 0)
//
//    fun bfs(start: Pair<Int, Int>) {
//        val q = ArrayDeque<Pair<Int, Int>>()
//        q.addLast(start)
//        array[start.first][start.second] = 1
//        while (q.isNotEmpty()) {
//            val temp2 = q.removeFirst()
//            repeat(4) { i ->
//                val tempX = temp2.first + dx[i]
//                val tempY = temp2.second + dy[i]
//                if (tempX < n && tempX > -1 && tempY < m && tempY > -1 && array[tempX][tempY] == 0) {
//                    q.addLast(Pair(tempX,tempY))
//                    array[tempX][tempY] = 1
//                }
//            }
//        }
//    }
//
//    var count = 0
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            if (array[i][j] == 0) {
//                bfs(Pair(i,j))
//                count++
//            }
//        }
//    }
//
//    println(count)
//}

//fun main(){
//    val (n,m) = readln().split(" ").map{it.toInt()}
//    val array = Array(n){
//        readln().toCharArray().map{it.digitToInt()}.toMutableList()
//    }
//    val dx = arrayOf(0,0,1,-1)
//    val dy = arrayOf(1,-1,0,0)
//    fun bfs(start:Pair<Int,Int>){
//        val q = ArrayDeque<Pair<Int,Int>>()
//        q.addLast(start)
//        while(q.isNotEmpty()){
//            val temp = q.removeFirst()
//            repeat(4){i->
//                val tempX = temp.first + dx[i]
//                val tempY = temp.second + dy[i]
//                if(tempX<n && tempX>-1 && tempY<m && tempY>-1 && array[tempX][tempY]==1 && Pair(tempX,tempY)!=start){ // 시작점이 '1'이기 때문에 다시 돌아가는 것을 막기 위해
//                    array[tempX][tempY] = array[temp.first][temp.second]+1
//                    q.addLast(Pair(tempX,tempY))
//                }
//            }
//        }
//    }
//    bfs(Pair(0,0))
//    for(i in array){
//        println(i)
//    }
//    println(array[n-1][m-1])
//}

//fun main() {
//    val data = readln().split(" ").map { it.toInt() }
////    val list = Array(data[0]) {
////        readln().split(" ").map { it.toInt() }
////    }
////
////    val rode = Array(data[0] + 1) {
////        mutableListOf<Int>()
////    }
////
////    for (i in list) {
////        rode[i[0]].add(i[1])
////    }
//
//    val rode = Array(data[0]+1){
//        mutableListOf<Int>()
//    }
//    repeat(data[1]){
//        val (start, end) = readln().split(" ").map { it.toInt() }
//        rode[start].add(end)
//    }
//
//    val visited = MutableList(data[0] + 1) { 0 }
//    fun bfs(start: Int) {
//        val q = ArrayDeque<Int>()
//        q.addLast(start)
//        visited[start] = 0
//        while (q.isNotEmpty()) {
//            val temp = q.removeFirst()
//            for (i in rode[temp]) {
//                if (visited[i] == 0) {
//                    visited[i] = visited[temp] + 1
//                    q.addLast(i)
//                }
//            }
//        }
//    }
//
//    bfs(data[3])
//    println(visited)
//}

//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val array = Array(n) {
//        readln().split(" ").map { it.toInt() }.toMutableList()
//    }
//
//    val virus = mutableListOf<Pair<Int, Int>>()
//
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            if (array[i][j] == 2) {
//                virus.add(Pair(i, j))
//            }
//        }
//    }
//
//    val dx = arrayOf(0, 0, 1, -1)
//    val dy = arrayOf(1, -1, 0, 0)
//
//    fun bfs(start: Pair<Int, Int>, array2: Array<MutableList<Int>>) {
//        val q = ArrayDeque<Pair<Int, Int>>()
//        q.addLast(start)
//        while (q.isNotEmpty()) {
//            val point = q.removeFirst()
//            repeat(4) { i ->
//                val tempX = dx[i] + point.first
//                val tempY = dy[i] + point.second
//                if (tempX < n && tempX > -1 && tempY < m && tempY > -1 && array2[tempX][tempY] == 0) {
//                    array2[tempX][tempY] = 2
//                    q.addLast(Pair(tempX, tempY))
//                }
//            }
//        }
//    }
//
//    var result = 0
//    fun combination(count: Int) {
//        if (count == 3) {
//            val temp = Array(n) {
//                mutableListOf<Int>()
//            }
//
//            for (i in 0 until n) {
//                temp[i].addAll(array[i])
//            }
//
//            for (i in virus) {
//                bfs(i, temp)
//            }
//
//            var count = 0
//            for (i in 0 until n) {
//                for (j in 0 until m) {
//                    if (temp[i][j] == 0) count++
//                }
//            }
//
//            if(count > 0) result = Math.max(result, count)
//        } else {
//            for (i in 0 until n) {
//                for (j in 0 until m) {
//                    if (array[i][j] == 0) {
//                        array[i][j] = 1
//                        combination(count + 1)
//                        array[i][j] = 0
//                    }
//                }
//            }
//        }
//    }
//    combination(0)
//    println(result)
//}

//data class virus(val x: Int, val y: Int, val what: Int, val time: Int)
//
//fun main() {
//    val (n, k) = readln().split(" ").map { it.toInt() }
//    val array = Array(n) {
//        readln().split(" ").map { it.toInt() }.toMutableList()
//    }
//
//    val viruses = mutableListOf<virus>()
//
//
//    for (i in 0 until n) {
//        for (j in 0 until n) {
//            if (array[i][j] <= k && array[i][j] >= 1) {
//                viruses.add(virus(i, j, array[i][j],0))
//            }
//        }
//    }
//
//    viruses.sortBy{it.what}
//
//    val (s, x, y) = readln().split(" ").map { it.toInt() }
//
//    val dx = listOf(0, 0, 1, -1)
//    val dy = listOf(1, -1, 0, 0)
//
//    fun bfs(list: MutableList<virus>) {
//        val q = ArrayDeque<virus>()
//        q.addAll(list)
//        while (q.isNotEmpty()) {
//            val temp = q.removeFirst()
//            if (temp.time == s) break
//            repeat(4) { i ->
//                val tempX = temp.x + dx[i]
//                val tempY = temp.y + dy[i]
//                if (tempX > -1 && tempX < n && tempY > -1 && tempY < n && array[tempX][tempY] == 0) {
//                    array[tempX][tempY] = temp.what
//                    q.addLast(virus(tempX, tempY, temp.what, temp.time + 1))
//                }
//            }
//        }
//    }
//
//    bfs(viruses)
//
//    for (i in 0 until n) {
//        println(array[i])
//    }
//
//    println(array[x - 1][y - 1])
//}

//fun main(){
//    val array = readln()
//
//    fun checkright(array:String):Boolean{
//        var balance = 0
//        for(i in array){
//            if(i == '(') balance++
//            else balance--
//
//            if(balance<0){
//                return false
//            }
//        }
//        return true
//    }
//
//    fun bfs(array:String) : String{
//        var result = ""
//        if(array.isEmpty()) return ""
//        else{
//            var valance = 0
//            var u = ""
//            var v = ""
//            for(i in array.indices){
//                if(array[i] == '('){
//                    valance++
//                }else if(array[i] == ')'){
//                    valance--
//                }
//
//                if(valance == 0){
//                    u = array.slice(0.. i)
//                    v = array.slice(i+1 until array.length)
//                    break
//                }
//            }
//
//            if(checkright(u)){
//                result = result.plus(u).plus(bfs(v))
//            }else{
//                result = "("
//                result = result.plus(bfs(v))
//                result = result.plus(')')
//
//                var temp = ""
//                for(i in 1 until u.length-1){
//                    if(u[i] == '(') temp = temp.plus(')')
//                    else if(u[i] == ')') temp = temp.plus('(')
//                }
//                result = result.plus(temp)
//            }
//            return result
//        }
//    }
//    var result = ""
//    result = result.plus(bfs(array))
//    println("result2 : $result")
//}

//fun main(){
//    val num = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }.toMutableList()
//    val operation = readln().split(" ").map { it.toInt() }.toMutableList()
//
//    val result = mutableListOf<Int>()
//    val oper = mutableListOf<Int>()
//
//    fun combination(count:Int){
//        if(count == num-1) {
//            var temp = array[0]
//            for(i in 1 until array.size){
//                when (oper[i-1]) {
//                    0 -> {
//                        // +
//                        temp += array[i]
//                    }
//                    1 -> {
//                        // -
//                        temp -= array[i]
//                    }
//                    2 -> {
//                        // *
//                        temp *= array[i]
//                    }
//                    3 -> {
//                        // /
//                        if(temp < 0){
//                            var temp2 = -temp
//                            temp2 /= array[i]
//                            temp = -temp2.toInt()
//                        }else{
//                            temp /= array[i]
//                        }
//                    }
//                }
//            }
//
//           result.add(temp.toInt())
//        }else{
//            for(i in 0 until operation.size){
//                if(operation[i] >= 1){
//                    oper.add(i)
//                    operation[i]--
//                    combination(count+1)
//                    operation[i]++
//                    oper.removeLast()
//                }
//            }
//        }
//    }
//
//    combination(0)
//    println(result.max())
//    println(result.min())
//}

//fun main() {
//    val size = readln().toInt()
//    val array = Array(size) {
//        readln().split(" ").map { it }.toMutableList()
//    }
//
//    val teacherLocation = mutableListOf<Pair<Int, Int>>()
//    for (i in 0 until size) {
//        for (j in 0 until size) {
//            if (array[i][j] == "T") {
//                teacherLocation.add(Pair(i, j))
//            }
//        }
//    }
//
//
//    val dx = listOf(0, 0, -1, 1)
//    val dy = listOf(1, -1, 0, 0)
//
//    fun checkvisible(temp_array: Array<MutableList<String>>): Boolean {
//        for (i in teacherLocation) {
//            val temp = MutableList(4) { 0 }
//            for (j in 1 until size) {
//                repeat(4) {
//                    val tempX = i.first + (dx[it] * j)
//                    val tempY = i.second + (dy[it] * j)
//                    if (tempX > -1 && tempX < size && tempY > -1 && tempY < size) {
//                        if (temp_array[tempX][tempY] == "S") {
//                            if(temp[it]!=1){
//                                temp[it] = -1
//                            }
//                        }else if (temp_array[tempX][tempY] == "O") {
//                            temp[it] = 1
//                        }
//                    }
//
//                    if (temp[it] < 0) return false
//                }
//            }
//        }
//
//        return true
//    }
//
//    fun combination(count: Int) : String{
//        if (count == 3) {
//            if (checkvisible(array)) {
//                return "YES"
//            }
//        } else {
//            for (i in 0 until size) {
//                for (j in 0 until size) {
//                    if (array[i][j] == "X") {
//                        array[i][j] = "O"
//                        if(combination(count + 1) == "YES") return "YES"
//                        array[i][j] = "X"
//                    }
//                }
//            }
//        }
//        return "NO"
//    }
//
//    val result = combination(0)
//    println(result)
//}

//fun main() {
//    val (n, l, r) = readln().split(" ").map { it.toInt() }
//    val array = Array(n) {
//        readln().split(" ").map { it.toInt() }.toMutableList()
//    }
//
//    val dx = listOf(0, 0, -1, 1)
//    val dy = listOf(1, -1, 0, 0)
//
//    var visited = Array(n) {
//        MutableList(n) { 0 }
//    }
//
//    fun bfs(start: Pair<Int, Int>): Boolean {
//        val country = mutableListOf<Triple<Int, Int, Int>>()
//        val q = ArrayDeque<Pair<Int, Int>>()
//
//        q.addLast(Pair(start.first, start.second))
//        country.add(Triple(start.first, start.second, array[start.first][start.second]))
//        visited[start.first][start.second] = 1
//
//        while (q.isNotEmpty()) {
//            val temp = q.removeFirst()
//            repeat(4) {
//                val tempX = temp.first + dx[it]
//                val tempY = temp.second + dy[it]
//
//                if (tempX > -1 && tempX < n && tempY > -1 && tempY < n && visited[tempX][tempY] == 0) {
//                    val LR = Math.abs(array[temp.first][temp.second] - array[tempX][tempY])
//                    if (LR in l..r) {
//                        q.addLast(Pair(tempX, tempY))
//                        country.add(Triple(tempX, tempY, array[tempX][tempY]))
//                        visited[tempX][tempY] = 1
//                    }
//                }
//            }
//        }
//
//        if (country.size > 1) {
//            val people = country.sumOf { it.third } / country.size
//            for (i in country) {
//                array[i.first][i.second] = people
//            }
//            return true
//        } else {
//            return false
//        }
//    }
//
//    var count = 0
//    while (true) {
//        var temp = false
//        for (i in 0 until n) {
//            for (j in 0 until n) {
//                if (visited[i][j] == 0) {
//                    if (bfs(Pair(i, j))) temp = true
//                }
//            }
//        }
//
//        if (temp) count++
//        else break
//
//        visited = Array(n) {
//            MutableList(n) { 0 }
//        }
//    }
//    println(count)
//}

//fun main() {
//    val size = readln().toInt()
//    val array = Array(size) {
//        readln().split(" ").map { it.toInt() }.toMutableList()
//    }
//
//    fun rotate(
//        robot: MutableList<Pair<Int, Int>>,
//        array: Array<MutableList<Int>>
//    ): MutableList<Pair<Int, Int>> {
//        val temp = MutableList(2) { Pair(0, 0) }
//        if (robot[0].first == robot[1].first) { // 가로
//            val tempX = robot[1].first + 1
//            val tempY = robot[1].second + 1
//            if (tempY < size && tempX < size && array[robot[1].first][tempY] != 1 && array[tempX][tempY] != 1) { // 회전 방향에 벽이 없다면
//                temp[1] = robot[0]
//                temp[0] = Pair(tempX, tempY)
//            }
//        } else { // 세로
//            val tempX = robot[1].first + 1
//            val tempY = robot[1].second + 1
//            if (tempY < size && tempX < size && array[tempX][robot[1].second] != 1 && array[tempX][tempY] != 1) { // 회전 방향에 벽이 없다면
//                temp[1] = robot[0]
//                temp[0] = Pair(tempX, tempY)
//            }
//        }
//        return temp
//    }
//
//    fun move_right(
//        robot: MutableList<Pair<Int, Int>>,
//        array: Array<MutableList<Int>>
//    ): MutableList<Pair<Int, Int>> {
//        val temp = MutableList(2) { Pair(0, 0) }
//
//        if (robot[0].first == robot[1].first) { // 가로
//            val tempX = robot[0].first
//            val tempY = robot[0].second + 1
//            if (tempY < size && array[tempX][tempY] != 1) {
//                temp[1] = robot[0]
//                temp[0] = Pair(tempX, tempY)
//            }
//        } else { // 세로
//            val tempX = robot[0].first
//            val tempX2 = robot[1].first
//            val tempY = robot[0].second + 1
//            if (tempY < size && array[tempX][tempY] != 1 && array[tempX2][tempY] != 1) {
//                temp[1] = Pair(tempX2, tempY)
//                temp[0] = Pair(tempX, tempY)
//            }
//        }
//        return temp
//    }
//
//    fun move_down(
//        robot: MutableList<Pair<Int, Int>>,
//        array: Array<MutableList<Int>>
//    ): MutableList<Pair<Int, Int>> {
//        val temp = MutableList(2) { Pair(0, 0) }
//
//        if (robot[0].first == robot[1].first) { // 가로
//            val tempY = robot[0].second
//            val tempY2 = robot[1].second
//            val tempX = robot[0].first + 1
//            if (tempX < size && array[tempX][tempY] != 1 && array[tempX][tempY2] != 1) {
//                temp[1] = Pair(tempX, tempY2)
//                temp[0] = Pair(tempX, tempY)
//            }
//        } else { // 세로
//            val tempX = robot[0].first + 1
//            val tempY = robot[0].second
//            if (tempX < size && array[tempX][tempY] != 1) {
//                temp[1] = robot[0]
//                temp[0] = Pair(tempX, tempY)
//            }
//        }
//        return temp
//    }
//
//    fun bfs(startrobot: MutableList<Pair<Int, Int>>) {
//        val q = ArrayDeque<MutableList<Pair<Int, Int>>>()
//        q.addLast(startrobot)
//        while (q.isNotEmpty()) {
//            val temp = q.removeFirst()
//            val rotate = rotate(temp, array)
//            val right = move_right(temp, array)
//            val down = move_down(temp, array)
//
//            if (rotate != MutableList(2) { Pair(0, 0) }) {
//                q.addLast(rotate)
//                if (array[rotate[0].first][rotate[0].second] < 0) {
//                    array[rotate[0].first][rotate[0].second] = Math.max(
//                        array[rotate[0].first][rotate[0].second],
//                        array[temp[0].first][temp[0].second] - 1
//                    )
//                } else {
//                    array[rotate[0].first][rotate[0].second] =
//                        array[temp[0].first][temp[0].second] - 1
//                }
//            }
//            if (right != MutableList(2) { Pair(0, 0) }) {
//                q.addLast(right)
//                if (array[right[0].first][right[0].second] < 0) {
//                    array[right[0].first][right[0].second] = Math.max(
//                        array[right[0].first][right[0].second],
//                        array[temp[0].first][temp[0].second] - 1
//                    )
//                } else {
//                    array[right[0].first][right[0].second] =
//                        array[temp[0].first][temp[0].second] - 1
//                }
//            }
//            if (down != MutableList(2) { Pair(0, 0) }) {
//                q.addLast(down)
//                if (array[down[0].first][down[0].second] < 0) {
//                    array[down[0].first][down[0].second] = Math.max(
//                        array[down[0].first][down[0].second],
//                        array[temp[0].first][temp[0].second] - 1
//                    )
//                } else {
//                    array[down[0].first][down[0].second] = array[temp[0].first][temp[0].second] - 1
//                }
//            }
//        }
//    }
//
//    val robot = mutableListOf(Pair(0, 1), Pair(0, 0))
//    bfs(robot)
//    println(-array[size - 1][size - 1])
//}

//fun main() {
//    val (n, m, k, x) = readln().split(' ').map { it.toInt() }
//    val list = Array(n + 1) {
//        mutableListOf<Int>()
//    }
//
//    repeat(m) {
//        val (a, b) = readln().split(' ').map { it.toInt() }
//        list[a].add(b)
//    }
//
//    val visited = MutableList(n + 1) { -1 }
//    var result = mutableListOf<Int>()
//    fun findroute(start: Int, list: Array<MutableList<Int>>, depth: Int) {
//        val q = ArrayDeque<Int>()
//        q.addLast(start)
//        visited[start] = 0
//        while (q.isNotEmpty()) {
//            val temp = q.removeFirst()
//            val tempDist = visited[temp]
//            for (i in list[temp]) {
//                if (visited[i] == -1) {
//                    visited[i] = tempDist + 1
//                    if(visited[i] == depth){
//                        result.add(i)
//                    }
//                    q.addLast(i)
//                }
//            }
//        }
//    }
//
//    findroute(x, list, k)
//    if(result.size == 0){
//        println(-1)
//    }else{
//        result.sort()
//        for(i in result){
//            println(i)
//        }
//    }
//}

//fun main() {
//    val (n, m) = readln().split(' ').map { it.toInt() }
//    val virus = mutableListOf<Pair<Int, Int>>()
//    val map = Array(n) {
//        readln().split(' ').map { it.toInt() }.toMutableList()
//    }
//    val empty = mutableListOf<Pair<Int, Int>>()
//    for (i in 0 until n) {
//        for (j in 0 until m) {
//            if (map[i][j] == 2) {
//                virus.add(Pair(i, j))
//            } else if (map[i][j] == 0) {
//                empty.add(Pair(i, j))
//            }
//        }
//    }
//
//    val dx = listOf(0, 0, 1, -1)
//    val dy = listOf(1, -1, 0, 0)
//
//    var result = 0
//    fun findmax(count: Int, start: Int, map: Array<MutableList<Int>>) {
//        if (count == 3) {
//            val tempMap = Array(n) {
//                MutableList(m) { 0 }
//            }
//            for (i in 0 until n) {
//                for (j in 0 until m) {
//                    tempMap[i][j] = map[i][j]
//                }
//            }
//
//            for (i in virus) {
//                val q = ArrayDeque<Pair<Int, Int>>()
//                q.addLast(i)
//                while (q.isNotEmpty()) {
//                    val temp = q.removeFirst()
//                    repeat(4) {
//                        val tempX = temp.first + dx[it]
//                        val tempY = temp.second + dy[it]
//                        if (tempX > -1 && tempX < n && tempY > -1 && tempY < m) {
//                            if (tempMap[tempX][tempY] == 0) {
//                                tempMap[tempX][tempY] = 2
//                                q.addLast(Pair(tempX, tempY))
//                            }
//                        }
//                    }
//                }
//            }
//
//            var count = 0
//            for (i in 0 until n) {
//                for (j in 0 until m) {
//                    if (tempMap[i][j] == 0) {
//                        count++
//                    }
//                }
//            }
//
//            result = Math.max(result, count)
//        } else {
//            for (i in 0 until empty.size) {
//                val temp = empty[i]
//                if (map[temp.first][temp.second] == 0) {
//                    map[temp.first][temp.second] = 1
//                    findmax(count + 1, 0, map)
//                    map[temp.first][temp.second] = 0
//                }
//            }
//        }
//    }
//
//    findmax(0, 0, map)
//    println(result)
//}

//class a{
//    var name = ""
//    constructor(name : String){
//        this.name = name
//    }
//}
//
//fun main(){
//    var temp = a("df")
//    println(temp)
//}
//data class virus(
//    val virus: Int,
//    val x: Int,
//    val y: Int,
//    val time: Int,
//)
//
//fun main() {
//    val (n, k) = readln().split(' ').map { it.toInt() }
//    val virus = mutableListOf<virus>()
//
//    val array = Array(n) {
//        val temp = readln().split(' ').map { it.toInt() }.toMutableList()
//        for (i in 0 until n) {
//            if (temp[i] != 0) {
//                virus.add(virus(temp[i], it, i, 0))
//            }
//        }
//        temp
//    }
//
//    virus.sortBy { it.virus }
//
//    val dx = listOf(0, 0, 1, -1)
//    val dy = listOf(1, -1, 0, 0)
//
//    fun bfs(virus: MutableList<virus>, array: Array<MutableList<Int>>, s: Int) {
//        val q = ArrayDeque<virus>()
//        q.addAll(virus)
//
//        while (q.isNotEmpty()) {
//            val temp = q.removeFirst()
//            if (temp.time == s) break
//            repeat(4) {
//                val tempX = temp.x + dx[it]
//                val tempY = temp.y + dy[it]
//
//                if (tempX > -1 && tempX < n && tempY > -1 && tempY < n) {
//                    if (array[tempX][tempY] == 0) {
//                        array[tempX][tempY] = temp.virus
//                        q.addLast(virus(temp.virus, tempX, tempY, temp.time + 1))
//                    }
//                }
//            }
//        }
//    }
//
//    val (s, x, y) = readln().split(' ').map { it.toInt() }
//
//    bfs(virus, array, s)
////    repeat(n){
////        println(array[it])
////    }
//    println(array[x - 1][y - 1])
//}
//class Solution {
//    fun solution(p: String): String {
//        var answer = ""
//
//        answer = find(p)
//        return answer
//    }
//
//    fun find(p:String):String{
//        if(!p.isNullOrEmpty()){
//            var count = 0
//            var U = ""
//            var V = ""
//            for(i in p.indices){
//                if(p[i] == '(') count++
//                else if(p[i]==')') count--
//
//                if(count == 0){
//                    U = p.substring(0 .. i)
//                    V = p.substring(i+1 until p.length)
//                    break
//                }
//            }
//
//            if(perfect(U)){
//                V = find(V)
//                return U.plus(V)
//            }else{
//                V = find(V)
//                U = U.substring(1 until U.length-1)
//                var temp = ""
//                for(i in U){
//                    if(i=='('){
//                       temp = temp.plus(')')
//                    }else{
//                        temp = temp.plus('(')
//                    }
//                }
//                return '('.plus(V).plus(')').plus(temp)
//            }
//        }
//
//        return ""
//    }
//
//    fun perfect(U:String):Boolean{
//        var count = 0
//        for(i in U){
//            if(i=='(') count++
//            else count --
//            if(count < 0) return false
//        }
//        return true
//    }
//}
//fun main(){
//    val array = intArrayOf(1,3,2,4,2,2,3,4,3,4,1,2,3,4,2,23,23,2,32,32,32,3)
//    val t = Solution()
//    val temp = t.solution(array)
//    println(temp.contentToString())
//}
//class Solution {
//    fun solution(answers: IntArray): IntArray {
//        var answer = mutableListOf<Int>()
//        val one = mutableListOf<Boolean>()
//        val two = mutableListOf<Boolean>()
//        val three = mutableListOf<Boolean>()
//
//        var target = 0
//        var count = 0
//        var temp2 = 5
//        for (i in answers.indices) {
//            target++
//            if(target == 6) target = 1
//
//            if (target == answers[i]) one.add(true)
//            else one.add(false)
//
//            println(target)
//
//
//            if (i % 2 == 0) {
//                if (2 == answers[i]) {
//                    two.add(true)
//                } else {
//                    two.add(false)
//                }
//                println(2)
//            } else {
//                count++
//                when(count){
//                    2 -> count = 3
//                    6 -> count = 1
//                }
//                if (count == answers[i]) two.add(true)
//                else two.add(false)
//            }
//
//            if (i % 2 == 0) {
//                temp2++
//                if (temp2 == 6) temp2 = 3
//                else if (temp2 == 4) temp2 = 1
//                else if (temp2 == 3) temp2 = 4
//            }
//
//            if (temp2 == answers[i]) three.add(true)
//            else three.add(false)
//        }
//        val result = mutableListOf<Pair<Int,Int>>()
//        println(one)
//        println(two)
//        println(three)
//
//        result.add(Pair(1, one.count { it == true }))
//        result.add(Pair(2, two.count { it == true }))
//        result.add(Pair(3, three.count { it == true }))
//
//        println(result)
//
//        result.sortByDescending { it.second }
//        for(i in result.indices){
//            if(i > 0 && result[i-1].second > result[i].second){
//                println(result[i-1].second)
//                println(result[i].second)
//                break
//            }else{
//                answer.add(result[i].first)
//            }
//        }
//        return answer.toIntArray()
//    }
//
//}

//suspend fun getUserProfile() = coroutineScope {
//    val userName = async {
//        delay(2000)
//        "Hello"
//    }
//
//    val profileImagePath = async {
//        delay(3000)
//        "/hello/profile-image"
//    }
//    val name = coroutineContext[CoroutineName]?.name
//    println(name+" dfdf")
//    println(userName.await())
//    println(profileImagePath.await())
//    val name2 = coroutineContext[CoroutineName]?.name
//    println(name2+"dfdf")
//}
//
//fun main() = runBlocking {
//    val name = coroutineContext[CoroutineName]?.name
//    val userProfile = launch(CoroutineName("Parent")) {
//        val name = coroutineContext[CoroutineName]?.name
//        println(name)
//        getUserProfile()
//    }
//    println(name)
////    println(userProfile.await())
//}

//fun main() {
//    val numcount = readln().toInt()
//    val numarray = readln().split(' ').map { it.toInt() }.take(numcount)
//    val operarray = readln().split(' ').map { it.toInt() }.toMutableList()
//
//    val resultarray = mutableListOf<Int>()
//    fun find(count: Int, operaaray: MutableList<Int>, result: Int) {
//        if (count == numcount - 1) {
//            resultarray.add(result)
//        } else {
//            for (i in operaaray.indices) {
//                if (operaaray[i] > 0) {
//                    operaaray[i]--
//                    var tempresult = result
//                    when (i) {
//                        0 -> {
//                            tempresult += numarray[count + 1]
//                        }
//                        1 -> {
//                            tempresult -= numarray[count + 1]
//                        }
//                        2 -> {
//                            tempresult *= numarray[count + 1]
//                        }
//                        3 -> {
//                            tempresult /= numarray[count + 1]
//                        }
//                    }
//                    find(count + 1, operaaray, tempresult)
//                    operaaray[i]++
//                }
//            }
//        }
//    }
//
//    find(0,operarray, numarray[0])
//    println(resultarray.max())
//    println(resultarray.min())
//}

//fun main() {
//    val a = Solution()
//    val temp = a.solution("011")
//    println(temp)
//}
//
//class Solution {
//    fun solution(numbers: String): Int {
//        var answer = 0
//
//        val temp = numbers.toCharArray().toMutableList()
//
//        val result = mutableSetOf<Int>()
//        val case = mutableListOf<Char>()
//        val visited = MutableList(numbers.length) { false }
//        fun findcase(
//            array: MutableList<Char>,
//            count: Int,
//            case: MutableList<Char>,
//            visited: MutableList<Boolean>,
//        ) {
//            if (count == numbers.length) {
//                val temp = case.toCharArray().concatToString().replace(" ", "")
//                if (temp.isNotEmpty()) {
//                    val numtemp = temp.toInt()
//                    if (numtemp > 0) result.add(numtemp)
//                }
//
//            } else {
//                for (i in 0 until array.size) {
//                    if (!visited[i]) {
//                        visited[i] = true
//
//                        case.add(array[i])
//                        findcase(array, count + 1, case, visited)
//                        case.remove(array[i])
//
//                        case.add(' ')
//                        findcase(array, count + 1, case, visited)
//                        case.remove(' ')
//
//                        visited[i] = false
//                    }
//                }
//            }
//        }
//
//        findcase(temp, 0, case, visited)
//
//        val result2 = result.toMutableList()
//
//        for(i in result2.indices){
//            answer++
//            val sqrt = Math.sqrt(result2[i].toDouble()).toInt()
//            if(result2[i]==1){
//                answer--
//                continue
//            }
//            for(j in 2 .. sqrt){
//                if(result2[i] % j == 0) {
//                    answer--
//                    break
//                }
//            }
//        }
//
//        return answer
//    }
//}


//fun main() {
//    val a = Solution()
//    val temp = a.solution("JEROEN")
//    println(temp)
//}

//class Solution {
//    fun solution(name: String): Int {
//        var realanswer = 0
//        val namelist = name.toCharArray().toMutableList()
//        var common = 0
//
//        fun findroute(nameList: MutableList<Char>, start: Int, answer: Int) {
//            var fail = false
//            for (i in nameList) {
//                if (i != 'A') {
//                    fail = true
//                    break
//                }
//            }
//
//            if (!fail) {
//                if (realanswer == 0) realanswer = answer
//                realanswer = Math.min(answer, realanswer)
//            } else {
//                var tempanswer = answer
//                val limit = Math.max(start+1, nameList.size - start)
//                for (i in 1 until limit) {
//                    var right = start + i
//                    var left = start - i
//                    if (right >= nameList.size) right -= nameList.size
//                    if (left <= -1) left += nameList.size
//                    val rightWord = nameList[right]
//                    val leftWord = nameList[left]
//
//                    if (rightWord != 'A') {
//                        tempanswer += (Math.min('Z' - rightWord + 1, rightWord - 'A') + i)
//                        nameList[right] = 'A'
//                        findroute(namelist, right, tempanswer)
//                        nameList[right] = rightWord
//                        tempanswer -= (Math.min('Z' - rightWord + 1, rightWord - 'A') + i)
//                    }
//
//                    if (leftWord != 'A') {
//                        tempanswer += (Math.min('Z' - leftWord + 1, leftWord - 'A') + i)
//                        nameList[left] = 'A'
//                        findroute(namelist, left, tempanswer)
//                        nameList[left] = leftWord
//                        tempanswer -= (Math.min('Z' - leftWord + 1, leftWord - 'A') + i)
//                    }
//                }
//            }
//        }
//        if (namelist[0] != 'A') {
//            common = Math.min('Z' - namelist[0] + 1, namelist[0] - 'A')
//            namelist[0] = 'A'
//        }
//        findroute(namelist, 0, 0)
//        realanswer+=common
//        return realanswer
//    }
//}

//fun main() {
//    val N = readln().toInt()
//    val map = Array(N) {
//        readln().split(' ').toMutableList()
//    }
//
//    val teacher = mutableListOf<Pair<Int, Int>>()
//    val student = mutableListOf<Pair<Int, Int>>()
//    val empty = mutableListOf<Pair<Int, Int>>()
//    for (i in 0 until N) {
//        for (j in 0 until N) {
//            if (map[i][j] == "T") {
//                teacher.add(Pair(i, j))
//            } else if (map[i][j] == "X") {
//                empty.add(Pair(i, j))
//            } else {
//                student.add(Pair(i, j))
//            }
//        }
//    }
//
//    val dx = listOf(0, 0, 1, -1)
//    val dy = listOf(1, -1, 0, 0)
//
//    var result = "NO"
//    fun check(count: Int, map: Array<MutableList<String>>, empty: MutableList<Pair<Int, Int>>) {
//        if (count == 3) {
//            for (i in teacher) {
//                var n = false
//                var s = false
//                var w = false
//                var e = false
//                var north = Pair(i.first + dx[3], i.second + dy[3])
//                var south = Pair(i.first + dx[2], i.second + dy[2])
//                var west = Pair(i.first + dx[1], i.second + dy[1])
//                var east = Pair(i.first + dx[0], i.second + dy[0])
//                while (true) {
//                    if (!n) {
//                        if ((north.first < 0 || map[north.first][north.second] == "O")) n = true
//                        else if (map[north.first][north.second] == "S") break
//                        north = Pair(north.first + dx[3], north.second + dy[3])
//                    }
//
//                    if (!s) {
//                        if ((south.first >= N || map[south.first][south.second] == "O")) s = true
//                        else if (map[south.first][south.second] == "S") break
//                        south = Pair(south.first + dx[2], south.second + dy[2])
//                    }
//
//                    if (!w) {
//                        if ((west.second < 0 || map[west.first][west.second] == "O")) w = true
//                        else if (map[west.first][west.second] == "S") break
//                        west = Pair(west.first + dx[1], west.second + dy[1])
//                    }
//
//                    if (!e) {
//                        if ((east.second >= N || map[east.first][east.second] == "O")) e = true
//                        else if (map[east.first][east.second] == "S") break
//                        east = Pair(east.first + dx[0], east.second + dy[0])
//                    }
//
//                    if (n && s && w && e) {
//                        result = "YES"
//                        break
//                    }
//                }
//                if (!n || !s || !w || !e) {
//                    result = "NO"
//                    break
//                }
//            }
//        } else {
//            for (i in empty) {
//                if (result == "NO" && map[i.first][i.second] == "X") {
//                    map[i.first][i.second] = "O"
//                    check(count + 1, map, empty)
//                    map[i.first][i.second] = "X"
//                } else {
//                    break
//                }
//            }
//        }
//    }
//
//    check(0, map, empty)
//    println(result)
//}

//fun main() {
//    val a = Solution()
//    println(a.solution("10001", 3))
//}
//
//class Solution {
//    fun solution(number: String, k: Int): String {
//        var answer = ""
//        var tempnumber = number.toCharArray()
//        var total = number.length - k
//        var newnumber = MutableList(total) { '0' }
//
//        var count = 0
//        var start = 0
//        while (count < total) {
//            for (i in start until tempnumber.size - (total - count) + 1) {
//                if (tempnumber[i].digitToInt() > newnumber[count].digitToInt()) {
//                    newnumber[count] = tempnumber[i]
//                    start = i + 1
//                }
//            }
//            count++
//        }
//
//        answer = String(newnumber.toCharArray())
//        return answer
//    }
//}

//fun main() {
//
//    val temp = Solution()
//    println(temp.solution(8, 1).contentToString())
//}
//
//class Solution {
//    fun solution(brown: Int, yellow: Int): IntArray {
//        var answer = intArrayOf()
//
//        val case = findarticle(brown + yellow)
//
//        for (i in case) {
//            var row = 0
//            var col = 0
//            if (i.first >= i.second) {
//                row = i.first
//                col = i.second
//            } else {
//                row = i.second
//                col = i.first
//            }
//
//            val browncount = 2 * row + 2 * col - 4
//            if (browncount == brown) {
//                answer = intArrayOf(row, col)
//                break
//            }
//        }
//
//        return answer
//    }
//
//    fun findarticle(target: Int): MutableList<Pair<Int, Int>> {
//        val temp = mutableListOf<Pair<Int, Int>>()
//        for (i in 3..Math.sqrt(target.toDouble()).toInt()) {
//            if (target % i == 0) {
//                temp.add(Pair(i, target / i))
//            }
//        }
//        return temp
//    }
//}

//fun main() {
//    val (n, l, r) = readln().split(' ').map { it.toInt() }
//    val array = Array(n) {
//        readln().split(' ').map { it.toInt() }.toMutableList()
//    }
//
//    val dx = listOf(0, 0, 1, -1)
//    val dy = listOf(1, -1, 0, 0)
//
//    fun findcount(
//        startX: Int,
//        startY: Int,
//        visited: Array<MutableList<Boolean>>,
//        array: Array<MutableList<Int>>,
//        calcul: MutableList<MutableList<Int>>,
//        loc: MutableList<MutableList<Pair<Int, Int>>>,
//    ) {
//        val q = ArrayDeque<Pair<Int, Int>>()
//        q.add(Pair(startX, startY))
//        visited[startX][startY] = true
//        calcul.add(mutableListOf())
//        calcul.last().add(array[startX][startY])
//        loc.add(mutableListOf())
//        loc.last().add(Pair(startX, startY))
//        while (q.isNotEmpty()) {
//            val temp = q.removeFirst()
//            repeat(4) {
//                val tempX = temp.first + dx[it]
//                val tempY = temp.second + dy[it]
//                if (tempX > -1 && tempX < n && tempY > -1 && tempY < n && !visited[tempX][tempY]) {
//                    if (Math.abs(array[temp.first][temp.second] - array[tempX][tempY]) in l..r) {
//                        q.add(Pair(tempX, tempY))
//                        visited[tempX][tempY] = true
//                        calcul.last().add(array[tempX][tempY])
//                        loc.last().add(Pair(tempX, tempY))
//                    }
//                }
//            }
//        }
//    }
//
//    fun changearray(
//        calcul: MutableList<MutableList<Int>>,
//        loc: MutableList<MutableList<Pair<Int, Int>>>,
//        array: Array<MutableList<Int>>,
//    ) {
//        for (i in calcul.indices) {
//            if(calcul[i].size == 1) continue
//            val avg = calcul[i].average()
//            for (j in loc[i]) {
//                array[j.first][j.second] = avg.toInt()
//            }
//        }
//    }
//
//
//    var count = 0
//    while (true) {
//        var temp = true
//
//        val visited = Array(n) {
//            MutableList(n) { false }
//        }
//
//        val calcul = mutableListOf<MutableList<Int>>()
//        val loc = mutableListOf<MutableList<Pair<Int, Int>>>()
//
//        for (i in 0 until n) {
//            for (j in 0 until n) {
//                if (!visited[i][j]) {
//                    findcount(i, j, visited, array, calcul, loc)
//                } else {
//                    temp = false
//                }
//            }
//        }
//
//        changearray(calcul, loc, array)
//
//        if (temp) break
//        count++
//    }
//
//    println(count)
//}

//fun main() {
//    val temp = Solution()
//    val array = arrayOf(intArrayOf(80, 20), intArrayOf(50, 40), intArrayOf(30, 10))
//    println(temp.solution(80, array))
//}

//class Solution {
//    fun solution(k: Int, dungeons: Array<IntArray>): Int {
//        var answer: Int = -1
//        val visited = MutableList(dungeons.size) { false }
//
//        fun findcase(
//            count: Int,
//            left: Int,
//            visited: MutableList<Boolean>,
//            dungeons: Array<IntArray>,
//        ) {
//            for (i in dungeons.indices) {
//                if (!visited[i] && left >= dungeons[i][0]) {
//                    visited[i] = true
//                    findcase(count + 1, left - dungeons[i][1], visited, dungeons)
//                    visited[i] = false
//                }
//            }
//
//            answer = Math.max(answer, count)
//        }
//
//        findcase(0, k, visited, dungeons)
//
//        return answer
//    }
//}

//fun main() {
//    val temp = Solution()
//    println(temp.solution(arrayOf(
//        intArrayOf(0, 0, 0, 1, 1),
//        intArrayOf(0, 0, 0, 1, 0),
//        intArrayOf(0, 1, 0, 1, 1),
//        intArrayOf(1, 1, 0, 0, 1),
//        intArrayOf(0, 0, 0, 0, 0))))
//}
//
//class Solution {
//    fun solution(board: Array<IntArray>): Int {
//        var answer = 0
//
//        var route = Array(board.size) {
//            MutableList(board.size) { 0 }
//        }
//
//        val robot = ArrayDeque<MutableList<Pair<Int, Int>>>()
//        val temp = mutableListOf<Pair<Int, Int>>()
//        temp.add(Pair(0, 1))
//        temp.add(Pair(0, 0))
//
//        route[temp[0].first][temp[0].second] = 1
//        route[temp[1].first][temp[1].second] = 1
//        robot.addLast(temp)
//        while (robot.isNotEmpty()) {
//            println()
//            for (i in 0 until board.size) {
//                println(route[i])
//            }
//            val temp = robot.removeFirst()
//            repeat(8) {
//                val result = move(temp, board, it + 1)
//                println(temp +" "+result)
//                val one = result[0]
//                val two = result[1]
//                if (one.first > -1 && one.first < route.size && one.second > -1 && one.second < route.size
//                    && two.first > -1 && two.first < route.size && two.second > -1 && two.second < route.size
//                ) {
//                    if (one.second == two.second) {
//                        if (one.first > two.first) {
//                            if (board[one.first][one.second] == 0 && route[one.first][one.second] == 0) {
//                                route[one.first][one.second] = Math.max(route[temp[0].first][temp[0].second], route[temp[1].first][temp[1].second]) + 1
//                                robot.addLast(result)
//                            }
//                        } else {
//                            if (board[two.first][two.second] == 0 && route[two.first][two.second] == 0) {
//                                route[two.first][two.second] = Math.max(route[temp[0].first][temp[0].second], route[temp[1].first][temp[1].second]) + 1
//                                robot.addLast(result)
//                            }
//                        }
//                    } else {
//                        if (one.second > two.second) {
//                            if (board[one.first][one.second] == 0 && route[one.first][one.second] == 0) {
//                                route[one.first][one.second] = Math.max(route[temp[0].first][temp[0].second], route[temp[1].first][temp[1].second]) + 1
//                                robot.addLast(result)
//                            }
//                        } else {
//                            if (board[two.first][two.second] == 0 && route[two.first][two.second] == 0) {
//                                route[two.first][two.second] = Math.max(route[temp[0].first][temp[0].second], route[temp[1].first][temp[1].second]) + 1
//                                robot.addLast(result)
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        answer = route[board.size - 1][board.size - 1] - 1
//
//        return answer
//    }
//
//    fun move(
//        robot: MutableList<Pair<Int, Int>>,
//        board: Array<IntArray>,
//        direc: Int,
//    ): MutableList<Pair<Int, Int>> {
//        val temp = mutableListOf<Pair<Int, Int>>()
//        var one = robot[0]
//        var two = robot[1]
//        if (one.first - two.first == 0) { // 가로
//            when (direc) {
//                1 -> { // 오른쪽이동
//                    if (one.second > two.second) {
//                        val nextpoint = Pair(one.first, one.second + 1)
//                        two = Pair(one.first, one.second)
//                        one = nextpoint
//                    } else {
//                        val nextpoint = Pair(two.first, two.second + 1)
//                        one = Pair(two.first, two.second)
//                        two = nextpoint
//                    }
//                }
//                2 -> { // 밑으로 이동
//                    one = Pair(one.first + 1, one.second)
//                    two = Pair(two.first + 1, two.second)
//                }
//                3 -> { // 왼쪽으로 이동
//                    if (one.second > two.second) {
//                        val nextpoint = Pair(two.first, two.second - 1)
//                        one = Pair(two.first, two.second)
//                        two = nextpoint
//                    } else {
//                        val nextpoint = Pair(one.first, one.second + 1)
//                        two = Pair(one.first, one.second)
//                        one = nextpoint
//                    }
//                }
//                4 -> { // 위로 이동
//                    one = Pair(one.first - 1, one.second)
//                    two = Pair(two.first - 1, two.second)
//                }
//                5 -> { // 왼쪽으로 회전
//                    if (two.first + 1 > -1 && two.first + 1 < board.size && two.second > -1 && two.second < board.size && (board[two.first + 1][two.second] == 0)) {
//                        two = Pair(one.first + 1, one.second)
//                    } else {
//                        one = Pair(-1, -1)
//                    }
//                }
//                6 -> { // 오른쪽으로 회전
//                    if (two.first - 1 > -1 && two.first - 1 < board.size && two.second > -1 && two.second < board.size && (board[two.first - 1][two.second] == 0)) {
//                        two = Pair(one.first - 1, one.second)
//                    } else {
//                        one = Pair(-1, -1)
//                    }
//                }
//                7 -> { // 왼쪽2
//                    if (one.first - 1 > -1 && one.first - 1 < board.size && one.second > -1 && one.second < board.size && (board[one.first - 1][one.second] == 0)) {
//                        one = Pair(two.first - 1, two.second)
//                    } else {
//                        one = Pair(-1, -1)
//                    }
//                }
//                8 -> { // 오른쪽2
//                    if (one.first + 1 > -1 && one.first + 1 < board.size && one.second > -1 && one.second < board.size && (board[one.first + 1][one.second] == 0)) {
//                        one = Pair(two.first + 1, two.second)
//                    } else {
//                        one = Pair(-1, -1)
//                    }
//                }
//            }
//        } else { // 세로
//            when (direc) {
//                1 -> { // 오른쪽이동
//                    one = Pair(one.first, one.second + 1)
//                    two = Pair(two.first, two.second + 1)
//                }
//                2 -> { // 밑으로 이동
//                    if (one.first > two.first) {
//                        val nextpoint = Pair(one.first + 1, one.second)
//                        two = Pair(one.first, one.second)
//                        one = nextpoint
//                    } else {
//                        val nextpoint = Pair(two.first + 1, two.second)
//                        one = Pair(two.first, two.second)
//                        two = nextpoint
//                    }
//                }
//                3 -> { // 왼쪽으로 이동
//                    one = Pair(one.first, one.second - 1)
//                    two = Pair(two.first, two.second - 1)
//                }
//                4 -> { // 위로 이동
//                    if (one.first > two.first) {
//                        val nextpoint = Pair(two.first - 1, two.second)
//                        one = Pair(two.first, two.second)
//                        two = nextpoint
//                    } else {
//                        val nextpoint = Pair(one.first - 1, one.second)
//                        two = Pair(one.first, one.second)
//                        one = nextpoint
//                    }
//                }
//                5 -> { // 왼쪽으로 회전
//                    if (one.first > -1 && one.first < board.size && one.second + 1 > -1 && one.second + 1 < board.size && (board[one.first][one.second + 1] == 0)) {
//                        one = Pair(two.first, two.second + 1)
//                    } else {
//                        one = Pair(-1, -1)
//                    }
//                }
//                6 -> { // 오른쪽으로 회전
//                    if (one.first > -1 && one.first < board.size && one.second - 1 > -1 && one.second - 1 < board.size && (board[one.first][one.second - 1] == 0)) {
//                        one = Pair(two.first, two.second - 1)
//                    } else {
//                        one = Pair(-1, -1)
//                    }
//                }
//                7 -> { // 왼쪽2
//                    if (two.first > -1 && two.first < board.size && two.second - 1 > -1 && two.second - 1 < board.size && (board[two.first][two.second - 1] == 0)) {
//                        two = Pair(one.first, one.second - 1)
//                    } else {
//                        one = Pair(-1, -1)
//                    }
//                }
//                8 -> { // 오른쪽2
//                    if (two.first > -1 && two.first < board.size && two.second + 1 > -1 && two.second + 1 < board.size && (board[two.first][two.second + 1] == 0)) {
//                        two = Pair(one.first, one.second + 1)
//                    } else {
//                        one = Pair(-1, -1)
//                    }
//                }
//            }
//        }
//        temp.add(one)
//        temp.add(two)
//        return temp
//    }
//}

//fun main() {
//    val temp = Solution()
//    println(temp.solution("hit", "cog", arrayOf("hot", "dot", "dog", "lot", "log", "cog")))
//}
//
//class Solution {
//    fun solution(begin: String, target: String, words: Array<String>): Int {
//        var answer = 0
//        if (!words.contains(target)) return answer
//
//        val wordOneDifferList = HashMap<Int, MutableList<Int>>()
//        for (i in words.indices) {
//            val tempList = mutableListOf<Int>()
//            for (j in words.indices) {
//                if (i != j && isItOneDifference(words[i], words[j])) {
//                    tempList.add(j)
//                }
//            }
//            println(tempList)
//            wordOneDifferList.put(i, tempList)
//        }
//
//        fun find(nowIdx: Int, count: Int, visited: MutableList<Boolean>) {
//            if (words[nowIdx].equals(target)) {
//                answer = Math.min(answer, count)
//            } else {
//                for (j in wordOneDifferList.getValue(nowIdx)) {
//                    if (!visited[j]) {
//                        visited[j] = true
//                        find(j, count + 1, visited)
//                        visited[j] = false
//                    }
//                }
//            }
//        }
//
//        answer = words.size
//        for (i in words.indices) {
//            val visited = MutableList<Boolean>(words.size) { false }
//            if (isItOneDifference(begin, words[i])) {
//                find(i, 1, visited)
//            }
//        }
//
//        return answer
//    }
//
//    fun isItOneDifference(nowword: String, checkword: String): Boolean {
//        var count = 0
//        for (i in nowword.indices) {
//            if (nowword[i] != checkword[i]) count++
//            if (count > 1) return false
//        }
//        return true
//    }
//}

fun main() {
    val temp = Solution()
    println(temp.solution(arrayOf(
        arrayOf("ICN", "B"),
        arrayOf("B", "ICN"),
        arrayOf("ICN", "A"),
        arrayOf("A", "D"),
        arrayOf("D", "A"),
    )))
}

class Solution {
    fun solution(tickets: Array<Array<String>>): Array<String> {
        val hash = HashMap<String, MutableList<String>>()
        val visited = HashMap<String, Int>()

        for (i in tickets) {
            val list = hash.getOrDefault(i[0], mutableListOf<String>())
            list.add(i[1])
            list.sort()
            hash.put(i[0], list)

            if (!hash.containsKey(i[1])) hash.put(i[1], mutableListOf<String>())

            val count = visited.getOrDefault(i[0] + i[1], 0)
            visited.put(i[0] + i[1], count + 1)
        }


        val nameSort = mutableListOf<List<String>>()

        fun dfs(
            nowAirport: String,
            hash: HashMap<String, MutableList<String>>,
            airportList: ArrayDeque<String>,
            visitedd: HashMap<String, Int>,
        ) {
            if (airportList.size == tickets.size + 1) {
                nameSort.add(airportList.toList())
            } else if (airportList.size < tickets.size + 1 && nameSort.size < 1) {
                val list = hash[nowAirport]
                if (list!!.size > 0) {
                    for (i in list) {
                        val key = nowAirport + i
                        val count = visitedd.get(key)!!
                        if (count > 0) {
                            airportList.addLast(i)
                            visitedd.put(key, count - 1)
                            dfs(i, hash, airportList, visitedd)
                            visitedd.put(key, count)
                            airportList.removeLast()
                        }
                    }
                }
            } else {
                return
            }
        }

        val airportList = ArrayDeque<String>()
        airportList.addLast("ICN")
        for (i in hash.get("ICN")!!) {
            airportList.addLast(i)
            val key = "ICN" + i
            val count = visited[key]!!
            visited.put(key, count - 1)
            dfs(i, hash, airportList, visited)
            visited.put(key, count)
            airportList.removeLast()
        }

        return nameSort[0].toTypedArray()
    }
}