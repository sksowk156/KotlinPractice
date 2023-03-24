package com.umc.kotilnpractice

import android.util.Log

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

