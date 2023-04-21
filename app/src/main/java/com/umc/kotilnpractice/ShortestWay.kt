package com.umc.kotilnpractice

import android.util.Log
import java.util.*
import kotlin.math.min

//const val INF = Int.MAX_VALUE
//fun main(){
//    val (n,m) = readln().split(" ").map{it.toInt()} // 노드, 간선 수 설정
//    val start = readln().toInt() // 시작 노드 정하기
//    val graph = Array(n+1){ MutableList<Pair<Int,Int>>(n+1){Pair(0,0)} } // 한 노드와 그 노드와 연결된 노드 및 간선 정보를 담을 배열
//    val distance = Array<Int>(n+1){ INF } // 한 노드를 기준으로 모든 노드들에 대한 최단 거리 배열
//
//    repeat(m){
//        val (a,b,c) = readln().split(" ").map { it.toInt() } // 시작 노드, 끝 노드, 거리
//        graph[a].add((Pair(b,c))) // 노드, 간선 정보 입력
//    }
//
//
//    fun dijkstra(start:Int){
//        val q = PriorityQueue<Pair<Int,Int>>() { a, b -> a.first - b.first } // 우선순위 큐(최소힙)
//
//        q.add(Pair(0,start)) // 거리와 노드 입력(초기값은 자기자신)
//
//        distance[start] = 0 // 자기자신은 최단거리가 0이다.
//
//        while(q.isNotEmpty()){
//            val (dist, now) = q.poll()!! // 큐에서 가장 작은 dist를 가진 노드를 꺼낸다.
//            if(distance[now] < dist){ // 최단 거리 정보와 비교해보고 최단 거리가 더 작을 땐 그냥 pass
//                continue
//            }
//            for(i in graph[now]){ // 꺼내온 노드에 연결된 노드들을 확인
//                val cost = dist + i.second // 연결된 노드까지의 거리 계산
//                if(cost<distance[i.first]){ // 최단 거리 정보에서 연결된 노드까지 거리와 위에서 계산한 거리 비교
//                    distance[i.first] = cost // cost가 더 작으면 갱신
//                    q.add(Pair(cost, i.first)) // 갱신된 노드만 우선 순위 큐에 넣는다.(알아서 최소값을 맨 앞으로 옮겨준다.)
//                }
//            }
//        }
//    }
//
//    dijkstra(start)
//
//    for(i in 1..n){
//        if(distance[i]==INF){
//            print("infinity")
//        }else{
//            print(distance[i])
//        }
//    }
//
//}

//const val INF = 1e9.toInt()
//fun main() {
//    val n = readln().toInt()
//    val m = readln().toInt()
//    val graph = Array(n + 1) {
//        MutableList(n + 1) { INF }
//    }
//
//    for(a in 1..n){
//        for(b in 1..n){
//            if(a==b){
//                graph[a][b] = 0
//            }
//        }
//    }
//
//    repeat(m){
//        val (a,b,c) = readln().split(" ").map{it.toInt()}
//        graph[a][b]=c
//    }
//
//    for(k in 1..n){
//        for(a in 1..n){
//            for(b in 1..n){
//                graph[a][b] = kotlin.math.min(graph[a][b], graph[a][k] + graph[k][b])
//            }
//        }
//    }
//
//    for(a in 1..n){
//        for(b in 1..n){
//            if(graph[a][b] == INF){
//                print("infinity ")
//            }else{
//                print(graph[a][b].toString()+" ")
//            }
//        }
//        println()
//    }
//
//}

//// 3
//fun main() {
////    // N : 노드 개수, M : 간선 개수
////    val (N, M) = readln().split(" ").map { it.toInt() }
////    // 노드 간 경로
////    val array = Array(M) {
////        readln().split(" ").map { it.toInt() }.toMutableList() // 서로 연결된 노드 a, b
////    }
////    // X : 목표 노드, K : 중간 노드
////    val (X, K) = readln().split(" ").map { it.toInt() }
////
////    // 최단 거리를 저장할 배열
////    var temp = Array(100) { 1000000 }
////
////    // 방문 배열
////    var visit = Array(N + 1) { 0 }
////
////    fun dijkstra(start: Int) {
////        // 한 노드에 연결된 다른 노드들을 저장할 배열
////        val temp2 = mutableListOf<Int>()
////        temp[0] = 0
////        temp[start] = 0
////        visit[start] = 1
////        for (i in array) {
////            if (i[0] == start) {
////                temp[i[1]] = 1
////                temp2.add(i[1])
////                visit[i[1]] = 1
////            } else if (i[1] == start) {
////                temp[i[0]] = 1
////                temp2.add(i[0])
////                visit[i[0]] = 1
////            }
////        }
////
////        while (temp2.isNotEmpty()) {
////            val node = temp2.removeAt(0)
////            for (i in array) {
////                if (i[0] == node && visit[i[1]] == 0) {
////                    temp[i[1]] = kotlin.math.min(temp[node] + 1, temp[i[1]])
////                    temp2.add(i[1])
////                    visit[i[1]] = 1
////                } else if (i[1] == node && visit[i[0]] == 0) {
////                    temp[i[0]] = kotlin.math.min(temp[node] + 1, temp[i[0]])
////                    temp2.add(i[0])
////                    visit[i[0]] = 1
////                }
////            }
////        }
////    }
////
////    dijkstra(1)
////    var x = 0
////    x = if (temp[K] == 1000000) {
////        -1
////    } else {
////        temp[K]
////    }
////
////    temp = Array(100) { 1000000 }
////    visit = Array(N + 1) { 0 }
////    dijkstra(K)
////    var k = if (temp[X] == 1000000) {
////        -1
////    } else {
////        temp[X]
////    }
////
////    if (x > 0 && k > 0) {
////        print(x + k)
////    } else {
////        print(-1)
////    }
//
////    val INF = 1e9.toInt()
////
////    val (n,m) = readln().split(" ").map { it.toInt() }
////    var graph = Array(n+1){
////        MutableList(n+1){INF}
////    }
////
////    for(a in 1..n){
////        for(b in 1.. n){
////            if(a==b){
////                graph[a][b] = 0
////            }
////        }
////    }
////
////    repeat(m){
////        val (a,b) = readln().split(" ").map { it.toInt() }
////        graph[a][b] = 1
////        graph[b][a] = 1
////    }
////
////    val (x,k) = readln().split(" ").map { it.toInt() }
////
////    for(k in 1..n){
////        for( a in 1..n){
////            for(b in 1..n){
////                graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])
////            }
////        }
////    }
////
////    val distance = graph[1][k] + graph[k][x]
////
////    if( distance >= INF){
////        print("-1")
////    }else{
////        print(distance)
////    }
//}

//// 4
//const val INF = 1e9.toInt()
//fun main(){
//    val (N, M, C) = readln().split(" ").map{it.toInt() }
//    val graph = Array(N+1){
//        MutableList<Pair<Int,Int>>(N+1){Pair(0,0)}
//    }
//    val array = MutableList(N+1){INF}
//
//    repeat(M){
//        val (X, Y, Z) = readln().split(" ").map { it.toInt() }
//        graph[X].add(Pair(Y,Z))
//    }
//
//    fun dijkstra(start:Int){
//        array[start] = 0
//        val q = PriorityQueue<Pair<Int,Int>>(){a,b->a.second-b.second}
//
//        q.add(Pair(start, 0))
//
//        while(q.isNotEmpty()){
//            val (a,b) = q.poll()!!
//            if(array[a] < b){
//                continue
//            }
//            for(i in graph[a]){
//                if(array[i.first] > b+i.second){
//                    array[i.first] = b+i.second
//                    q.add(Pair(i.first, b+i.second))
//                }
//            }
//        }
//    }
//
//    dijkstra(C)
//    var count = 0
//    for(i in array.indices){
//        if(array[i]>=INF){
//            println("${i}로 가는 길 없음")
//        }else if(array[i] > 0){
//            println("${i}로 가는 길 있음")
//            count++
//        }
//    }
//
//    println(count.toString()+ " "+ array.max())
//}

//// 1
//fun main() {
//    val n = readln().toInt()
//    val m = readln().toInt()
//    val array = Array(m) {
//        readln().split(" ").map { it.toInt() }.take(3)
//    }
//
//    val route = Array(n) {
//        MutableList<Int>(n) { 1000 }
//    }
//
//    for (i in 0 until n) {
//        for (j in 0 until n) {
//            if(i==j){
//                route[i][j] = 0
//            }
//        }
//    }
//
//    for (i in 0 until m) {
//        val startnode = array[i][0]
//        val endnode = array[i][1]
//        route[startnode-1][endnode-1] = Math.min(array[i][2], route[startnode-1][endnode-1])
//    }
//
//    for(k in 0 until n){
//        for(i in 0 until n){
//            for(j in 0 until n){
//                route[i][j] = Math.min((route[i][k] + route[k][j]), route[i][j])
//            }
//        }
//    }
//
//    for(i in 0 until n){
//        for(j in 0 until n){
//            print(route[i][j].toString()+" ")
//        }
//        println()
//    }
//}

//// 2
//fun main(){
//    val(n, m) = readln().split(" ").map{it.toInt()}
//    val data = Array(m){
//        readln().split(" ").map { it.toInt() }.take(2)
//    }
//
//    val graph = Array(n){
//        MutableList(n){0}
//    }
//
//    for(i in 0 until m){
//        val start = data[i][0] - 1
//        val end = data[i][1] - 1
//        graph[start][end] = 1
//    }
//
//    for(k in 0 until m){
//        for(i in 0 until m){
//            for(j in 0 until  m){
//                if(graph[i][k] != 0 && graph[k][j] != 0){ // 갈 수 있는지 없는지만 기록한다.
//                    graph[i][j] = 1
//                }
//            }
//        }
//    }
//
//    for(i in 0 until m){
//        for(j in 0 until  m){
//            if(graph[j][i]==1) graph[i][j] = graph[j][i] // 목표지점에 올 수 있는 모든 경우의 수를 목료 지점에 갈 수 있는 경우의 수와 합한다.
//        }
//    }
//    println(graph.contentToString())
//    var count= 0
//    for(i in 0 until m){
//        if(graph[i].sum() == m-1) count++ // 목표지점에 갈 수있는 경우의 수 + 올 수 있는 경우의수 = 자기자신을 제외한 학생수 -> 등수 확인 가능
//    }
//
//    println(count)
//}

//// 3
//fun main() {
//    val n = readln().toInt()
//    val dx = listOf(0, 0, 1, -1)
//    val dy = listOf(1, -1, 0, 0)
//    fun find_route(array: Array<MutableList<Int>>,size:Int): Int {
//        val result = Array(size){
//            MutableList(size){1e9.toInt()}
//        }
//        val q = PriorityQueue<Triple<Int, Int, Int>>() { a, b -> a.third - b.third }
//        q.add(Triple(0, 0, array[0][0]))
//        result[0][0] = array[0][0]
//        while (q.isNotEmpty()) {
//            val (x, y, cost) = q.poll()
//            if(result[x][y] < cost) continue
//            repeat(4){ i->
//                val move_X = x+dx[i]
//                val move_y = y+dy[i]
//                if(move_X<size && move_X>-1 && move_y<size && move_y>-1){
//                    if(result[move_X][move_y] > cost+array[move_X][move_y]){
//                        result[move_X][move_y] = cost+array[move_X][move_y]
//                        q.add(Triple(move_X,move_y,result[move_X][move_y]))
//                    }
//                }
//            }
//        }
//
//        return result[size-1][size-1]
//    }
//    repeat(n) {
//        val size = readln().toInt()
//        val array = Array(size) {
//            readln().split(" ").map { it.toInt() }.take(size).toMutableList()
//        }
//        val result = find_route(array,size)
//        println(result.toString())
//    }
//}

//// 4
//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val route = Array(m) {
//        readln().split(" ").map { it.toInt() }.take(2)
//    }
//
//    val route2 = Array(n) {
//        mutableListOf<Int>()
//    }
//    repeat(m) { i ->
//        val way_node = route[i][0] - 1
//        val way_node2 = route[i][1] - 1
//        route2[way_node].add(way_node2)
//        route2[way_node2].add(way_node)
//    }
//    val shortestRoute = MutableList<Int>(n) { 1e9.toInt() }
//    val q = PriorityQueue<Pair<Int, Int>> { a, b -> a.second - b.second }
//    q.add(Pair(1, 0))
//    shortestRoute[0] = 0
//    while (q.isNotEmpty()) {
//        val (node, cost) = q.poll()
//        if (shortestRoute[node - 1] < cost) continue
//        for(i in route2[node-1]){
//            if(shortestRoute[i]>cost+1){
//                shortestRoute[i] = cost+1
//                q.add(Pair(i+1,cost+1))
//            }
//        }
//    }
//
//    val dist = shortestRoute.max()
//    val node = shortestRoute.indexOf(dist) + 1
//    val count =shortestRoute.count { it == dist }
//
//    println("$node $dist $count")
//}