package com.umc.kotilnpractice

import android.util.Log
import android.view.ViewParent
import kotlinx.coroutines.NonDisposableHandle.parent
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.max

//fun main(){
//    fun find_parent(parent: MutableList<Int>, x: Int): Int {
//        if (parent[x] != x) {
////            return find_parent(parent, parent[x]) ->
//            parent[x] = find_parent(parent, parent[x])
//        }
//        return parent[x]
//    }
//
//    fun union_parent(parent: MutableList<Int>, a: Int, b: Int) {
//        val a = find_parent(parent, a)
//        val b = find_parent(parent, b)
//        if (a < b) { // 더 작은 값이 상대방의 부모가 된다.
//            parent[b] = a
//        } else {
//            parent[a] = b
//        }
//    }
//
//    // 노드 개수, 간선 개수 입력 받기
//    val (v, e) = readln().split(" ").map { it.toInt() }
//    val parent = MutableList<Int>(v+1){0}
//
//    // 부모 테이블상에서 부모를 자기 자신으로 초기화
//    for(i in 1..v){
//        parent[i] = i
//    }
//
//    var cycle = false
//
//    // union 집합 만들기
//    repeat(e){
//        val (a,b)= readln().split(" ").map { it.toInt() }
//
//        if(find_parent(parent,a)==find_parent(parent,b)){
//            cycle = true
//            return@repeat
//        }else{
//            union_parent(parent, a, b)
//        }
//    }
//
//    if(cycle){
//        println("사이클이 발생")
//    }else{
//        println("사이클이 발생하지 않음")
//        // 부모 테이블 만들기
//        println("각 원소가 속한 집합 : ")
//        for(i in 1.. v){
//            print(find_parent(parent,i).toString()+" ")
//        }
//
//        println()
//
//        // 부모 테이블 출력
//        println("부모 테이블 : ")
//        for(i in 1..v){
//            print(parent[i].toString()+" ")
//        }
//    }
//}

//fun main(){
//    fun find_parent(parent : MutableList<Int>, x : Int) : Int{
//        if(parent[x] != x){
//            parent[x] = find_parent(parent, parent[x])
//        }
//        return parent[x]
//    }
//
//    fun union_parent(parent:MutableList<Int>, a:Int, b:Int){
//        val a = find_parent(parent,a)
//        val b = find_parent(parent,b)
//        if(a < b){
//            parent[b] = a
//        }else{
//            parent[a] = b
//        }
//    }
//
//    val (v,e)= readln().split(" ").map{it.toInt()}
//    val parent = MutableList<Int>(v+1){0}
//
//    val edges = mutableListOf<Triple<Int,Int,Int>>()
//    var result = 0
//
//    for(i in 1..v){
//        parent[i]=i
//    }
//
//    repeat(e){
//        val (a,b,cost) = readln().split(" ").map { it.toInt() }
//        edges.add(Triple(cost,a,b))
//    }
//
//    edges.sortBy { it.first }
//
//    for(edge in edges){
//        val (cost, a, b) = edge
//        if(find_parent(parent, a)!=find_parent(parent,b)){
//            union_parent(parent,a,b)
//            result += cost
//        }
//    }
//    print(result)
//}

//fun main(){
//    val (v,e) = readln().split(" ").map { it.toInt() }
//    val indegree = MutableList<Int>(v+1){0}
//    val graph = Array(v+1){
//        MutableList<Int>(v+1){0}
//    }
//
//    repeat(e){
//        val(a,b) = readln().split(" ").map { it.toInt() }
//        graph[a].add(b)
//        indegree[b]++
//    }
//
//    fun topology_sort(){
//        val result = mutableListOf<Int>()
//        val q = ArrayDeque<Int>()
//
//        for(i in 1..v){
//            if(indegree[i]==0){
//                q.addLast(i)
//            }
//        }
//
//        while(q.isNotEmpty()){
//            val now = q.removeFirst()
//            result.add(now)
//            for(i in graph[now]){
//                indegree[i]--
//                if(indegree[i]==0){
//                    q.addLast(i)
//                }
//            }
//        }
//
//        for(i in result){
//            print("$i ")
//        }
//    }
//
//    topology_sort()
//}

//// 2
//fun main() {
//    fun find_parent(array: MutableList<Int>, a: Int): Int {
//        if(array[a]!=a){
//            array[a] = find_parent(array,array[a])
//        }
//        return array[a]
//    }
//
//    fun union(array: MutableList<Int>, a: Int, b: Int) {
//        val a = find_parent(array,a)
//        val b = find_parent(array,b)
//        if(a>b){
//            array[a] = b
//        }else{
//            array[b] = a
//        }
//    }
//
//    val (N,M) = readln().split(" ").map{it.toInt()}
//    val array = MutableList(N+1){0}
//
//    for(i in 0..N){
//        array[i] = i
//    }
//
//    val graph = mutableListOf<Triple<Int,Int,Int>>()
//    repeat(M){
//        val(a,b,c) = readln().split(" ").map { it.toInt() }
//        graph.add(Triple(a,b,c))
//    }
//
//    for(i in graph){
//        if(i.first==0){
//            union(array,i.second,i.third)
//        }else{
//            if(find_parent(array,i.second) == find_parent(array,i.third)){
//                println("YES")
//            }else{
//                println("NO")
//            }
//        }
//    }
//}

//// 3
//fun main() {
//    fun find_parent(parent: MutableList<Int>, a: Int): Int {
//        if (parent[a] != a) {
//            parent[a] = find_parent(parent, parent[a])
//        }
//        return parent[a]
//    }
//
//    fun union(parent: MutableList<Int>, a: Int, b: Int) {
//        val a = find_parent(parent, a)
//        val b = find_parent(parent, b)
//
//        if (a < b) {
//            parent[b] = a
//        } else {
//            parent[a] = b
//        }
//
//    }
//
//    val (N, M) = readln().split(" ").map { it.toInt() }
//    val parent = MutableList<Int>(N + 1) { 0 }
//
//    for (i in 1..N) {
//        parent[i] = i
//    }
//
//    val edge = MutableList<Triple<Int, Int, Int>>(M) { Triple(0, 0, 0) }
//    var result = 0
//
//    repeat(M) {
//        val (a, b, c) = readln().split(" ").map { it.toInt() }
//        edge.add(Triple(a, b, c))
//    }
//
//    edge.sortBy { it.third }
//
//    var last = 0
//    for(i in edge){
//        val (a,b,c) = i
//        if(find_parent(parent,a)!=find_parent(parent,b)){
//            union(parent,a,b)
//            result+=c
//            last = c
//        }
//    }
//
//    println(result-last)
//}

//// 4
//fun main() {
//    val n = readln().toInt()
//    val indegree = MutableList<Int>(n + 1) { 0 }
//
//    val graph = Array(n + 1) {
//        mutableListOf<Int>()
//    }
//
//    val time = MutableList<Int>(n + 1) { 0 }
//
//    for (i in 1..n) {
//        val data = readln().split(" ").map { it.toInt() }
//        time[i] = data[0]
//        for (x in 1 until data.size - 1) {
//            indegree[i]++
//            graph[data[x]].add(i)
//        }
//    }
//
//    fun topology_sort() {
//        val result = mutableListOf<Int>()
//        result.addAll(time)
//        val q = ArrayDeque<Int>()
//
//        for (i in 1..n) {
//            if (indegree[i] == 0) {
//                q.addLast(i)
//            }
//        }
//
//        while (q.isNotEmpty()) {
//            val now = q.removeFirst()
//            for (i in graph[now]) {
//                println(i.toString()+" "+result[i].toString()+" "+(result[now] + time[i]).toString())
//                result[i] = max(result[i], result[now] + time[i])
//                indegree[i]--
//                if (indegree[i] == 0) {
//                    q.addLast(i)
//                }
//            }
//        }
//
//        for (i in 1..n) {
//            println(result[i])
//        }
//    }
//
//    topology_sort()
//}

// 1
//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val graph = Array(n) {
//        readln().split(" ").map { it.toInt() }.take(n)
//    }
//    val route = readln().split(" ").map { it.toInt() }.take(m)
//
//    val routeNode = MutableList(n + 1) { it }
//
//    fun findRoute(routeNode: MutableList<Int>, node: Int): Int {
//        if (node != routeNode[node]) {
//            routeNode[node] = findRoute(routeNode, routeNode[node])
//        }
//        return routeNode[node]
//    }
//
//    fun union(routeNode: MutableList<Int>, node: Int, node2: Int)  {
//        val a = findRoute(routeNode, node)
//        val b = findRoute(routeNode, node2)
//        if (a < b) {
//            routeNode[b] = a
//        } else {
//            routeNode[a] = b
//        }
//    }
//
//    fun possible(graph: Array<List<Int>>, routeNode: MutableList<Int>, route: List<Int>): Boolean {
//        for (i in 0 until n) {
//            for(j in 0 until n){
//                if(graph[i][j]==1){
//                    if (findRoute(routeNode, i+1) == findRoute(routeNode, graph[i][j])) continue
//                    union(routeNode, i+1,graph[i][j])
//                    println(routeNode.toString())
//                }
//            }
//        }
//        println(routeNode.toString())
//
//        var node = 0
//        var result = true
//        for(i in route){
//            if(node ==0) node = routeNode[i]
//            if(node != routeNode[i]) {
//                result = false
//                break
//            }
//            node = routeNode[i]
//        }
//        return result
//    }
//
//    val result = possible(graph, routeNode, route)
//    if (result) {
//        println("YES")
//    } else {
//        println("NO")
//    }
//}

//// 2
//fun main(){
//    val gate = readln().toInt()
//    val airplane = readln().toInt()
//    val dokingGate = mutableListOf<Int>()
//    repeat(airplane){
//        dokingGate.add(readln().toInt())
//    }
//    val gateState = MutableList<Int>(airplane){it}
//
//    fun doking(gateState : MutableList<Int>){
//    }
//}

// 3
//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val array = mutableListOf<Triple<Int, Int, Int>>()
//    repeat(m){
//        val (a, b, c) = readln().split(" ").map { it.toInt() }
//        array.add(Triple(a,b,c))
//    }
//    val parent = MutableList(n) { it }
//
//    fun findParent(parent: MutableList<Int>, node: Int): Int {
//        if (parent[node] != node) {
//            parent[node] = findParent(parent, parent[node])
//        }
//        return parent[node]
//    }
//
//    fun union(parent: MutableList<Int>, node: Int, node2: Int) {
//        val a = findParent(parent, node)
//        val b = findParent(parent, node2)
//        if (a < b) {
//            parent[b] = a
//        } else {
//            parent[a] = b
//        }
//    }
//
//    array.sortBy{it.third}
//    var result = 0
//    fun findMinimum(parent: MutableList<Int>,array:MutableList<Triple<Int,Int,Int>>){
//        for(i in array){
//            if(findParent(parent, i.first)==findParent(parent,i.second)) continue
//            union(parent,i.first,i.second)
//            result += i.third
//        }
//    }
//    findMinimum(parent, array)
//    var sum = 0
//    for (i in array) {
//        sum += i.third
//    }
//
//    println("$sum - $result = ${sum-result}")
//}

//// 3
//fun main() {
//    val n = readln().toInt()
//    val array = mutableListOf<Triple<Int, Int, Int>>()
//    repeat(n) {
//        val (a, b, c) = readln().split(" ").map { it.toInt() }
//        array.add(Triple(a, b, c))
//    }
//    val routeCost = mutableListOf<Triple<Int, Int, Int>>()
//    for (i in 0 until n) {
//        for (j in i + 1 until n) {
//            val result = minOf(
//                abs(array[i].first - array[j].first),
//                abs(array[i].second - array[j].second),
//                abs(array[i].third - array[j].third)
//            )
//            routeCost.add(Triple(i, j, result))
//        }
//    }
//    routeCost.sortBy { it.third }
//
//    val parent = MutableList<Int>(n) { it }
//    fun findparent(parent: MutableList<Int>, node: Int): Int {
//        if (parent[node] != node) {
//            parent[node] = findparent(parent, parent[node])
//        }
//        return parent[node]
//    }
//
//    fun union(parent: MutableList<Int>, node1: Int, node2: Int) {
//        val a = findparent(parent, node1)
//        val b = findparent(parent, node2)
//        if (a < b) parent[b] = a
//        else parent[a] = b
//    }
//
//    var sum = 0
//    for (i in routeCost) {
//        if (findparent(parent, i.first) == findparent(parent, i.second)) continue
//        union(parent, i.first, i.second)
//        sum += i.third
//    }
//    println(sum)
//}

//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//
//    val studentparent = MutableList(n + 1) { it }
//
//    fun findparent(node: Int, nodeparent: Int): Int {
//        if (node != nodeparent) {
//            studentparent[node] = findparent(nodeparent, studentparent[nodeparent])
//        }
//        return studentparent[node]
//    }
//
//    fun union(node1: Int, node2: Int) {
//        val a = findparent(node1, studentparent[node1])
//        val b = findparent(node2, studentparent[node2])
//        if (a < b) {
//            studentparent[b] = a
//        } else {
//            studentparent[a] = b
//        }
//    }
//
//    repeat(m) {
//        val (a, b, c) = readln().split(" ").map { it.toInt() }
//
//        if (a == 0) {
//            union(b, c)
//        } else {
//            if (findparent(b, studentparent[b]) == findparent(c, studentparent[c])) println("YES")
//            else println("NO")
//        }
//    }
//}

//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//
//    val parent = MutableList(n + 1) { it }
//
//    val route = mutableListOf<Triple<Int, Int, Int>>()
//    repeat(m) {
//        val (a, b, c) = readln().split(" ").map { it.toInt() }
//        route.add(Triple(a, b, c))
//    }
//
//    route.sortBy { it.third }
//
//    println(route)
//
//    fun findparent(node: Int, parentnode: Int): Int {
//        if (node != parentnode) {
//            parent[node] = findparent(parentnode, parent[parentnode])
//        }
//        return parent[node]
//    }
//
//    fun union(node1: Int, node2: Int) {
//        val a = findparent(node1, parent[node1])
//        val b = findparent(node2, parent[node2])
//        if (a < b) {
//            parent[b] = a
//        } else {
//            parent[a] = b
//        }
//    }
//
//    var result = 0
//
//    var max = 0
//    for (i in route) {
//        if (findparent(i.first, parent[i.first]) != findparent(i.second, parent[i.second])) {
//            max = Math.max(max, i.third)
//            result += i.third
//            union(i.first, i.second)
//        }
//    }
//
//    println(result - max)
//}

//fun main(){
//    val n = readln().toInt()
//
//    val route = Array(n+1){
//        mutableListOf<Int>()
//    }
//
//    val routecount = MutableList(n+1){0}
//
//    val cost = MutableList(n+1){0}
//    val cost2 = MutableList(n+1){0}
//
//    val q = ArrayDeque<Int>()
//    repeat(n){
//        val a = readln().split(" ").map{it.toInt()}.toMutableList()
//        for(i in 1 until a.size){
//            if(a[i] != -1){
//                route[a[i]].add(it+1)
//                routecount[it+1]++
//            }
//        }
//        if(routecount[it+1] == 0){
//            q.addLast(it+1)
//        }
//        cost[it+1] = a[0]
//        cost2[it+1] = a[0]
//    }
//
//    while(q.isNotEmpty()){
//        val temp = q.removeFirst()
//        for(i in route[temp]){
//            cost2[i] = Math.max(cost2[temp]+cost[i],cost2[i])
//            routecount[i] -= 1
//            if(routecount[i] == 0){
//                q.addLast(i)
//            }
//        }
//    }
//    println(cost2)
//}

//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//
//    val parent = MutableList(n){it} // 처음 부모 노드는 자기 자신
//
//    fun findparent(parentnode:Int, node:Int) : Int{
//        if(parentnode != node){ // 부모 노드가 자기 자신이 아닐 때 -> 다른 부모 노드가 있다는 것
//            parent[node] = findparent(parent[parentnode], parentnode) // 현재 부모 노드의 부모 노드를 찾아서 갱신
//        }
//        return parent[node]
//    }
//
//    fun union(node1:Int, node2:Int){
//        val temp1 = findparent(parent[node1],node1)
//        val temp2 = findparent(parent[node2], node2)
//        if(temp1<temp2) parent[node2] = node1
//        else parent[node1] = node2
//    }
//
//    val graph = Array(n) { it ->
//        val temp = readln().split(" ").map { it.toInt() }.take(n)
//        for(i in temp.indices){
//            if(temp[i] == 1){
//                union(it, i)
//            }
//        }
//        temp
//    }
//
//    val route = readln().split(" ").map{it.toInt()}.take(m)
//
//    println(parent)
//
//    for(i in 0 until route.size-1){
//        var temp1 =route[i]-1
//        var temp2 = route[i+1]-1
//        if(findparent(parent[temp1],temp1 )!= findparent(parent[temp2],temp2)){
//            println("NO")
//            break
//        }
//    }
//
//    println("YES")
//}

//fun main() {
//    val g = readln().toInt() // 게이트 개수
//    val p = readln().toInt() // 비행기 개수
//    val gateparent = MutableList(g + 1) { it }
//    val plane = MutableList<Int>(p) { 0 }
//
//    repeat(p) {
//        plane[it] = readln().toInt()
//    }
//
//    fun findparent(parent: MutableList<Int>, node: Int): Int {
//        if (parent[node] != node) {
//            parent[node] = findparent(parent, parent[node])
//        }
//        return parent[node]
//    }
//
//    fun union(parent: MutableList<Int>, node1: Int, node2: Int) {
//        val temp1 = findparent(parent, node1)
//        val temp2 = findparent(parent, node2)
//        if (temp1 < temp2) parent[temp2] = temp1
//        else parent[temp1] = temp2
//    }
//
//    var count = 0
//
//    for (i in 0 until p) {
//        val node = plane[i]
//        val parentnode = findparent(gateparent, node)
//        println("before : $node , $parentnode")
//        if (parentnode == 0) {
//            println("끝")
//            break
//        }else{
//            count++
//            union(gateparent, parentnode, parentnode - 1)
//        }
//    }
//
//    println(gateparent)
//    println(count)
//}

//fun main() {
//    fun findparent(parent: MutableList<Int>, node: Int): Int {
//        if (parent[node] != node) {
//            parent[node] = findparent(parent, parent[node])
//        }
//        return parent[node]
//    }
//
//    fun union(parent: MutableList<Int>, node1: Int, node2: Int) {
//        val temp1 = findparent(parent, node1)
//        val temp2 = findparent(parent, node2)
//        if (temp1 < temp2) parent[temp2] = temp1
//        else parent[temp1] = temp2
//    }
//
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val route = Array(m) {
//        val (a, b, c) = readln().split(" ").map { it.toInt() }
//        Triple(a, b, c)
//    }
//
//    val parentCity = MutableList(n) { it }
//
//    route.sortBy { it.third }
//
//    var result = 0
//    for (i in route) {
//        val Aparent = findparent(parentCity, i.first)
//        val Bparent = findparent(parentCity, i.second)
//        if(Aparent != Bparent){
//            union(parentCity, i.first, i.second)
//            result += i.third
//        }
//    }
//    println(route.sumOf { it.third })
//    println(route.sumOf { it.third } - result)
//}
//
//fun main() {
//    val n = readln().toInt()
//    val Xlist = mutableListOf<Pair<Int, Int>>()
//    val Ylist = mutableListOf<Pair<Int, Int>>()
//    val Zlist = mutableListOf<Pair<Int, Int>>()
//
//    repeat(n) {
//        val (x, y, z) = readln().split(" ").map { it.toInt() }
//        Xlist.add(Pair(it, x))
//        Ylist.add(Pair(it, y))
//        Zlist.add(Pair(it, z))
//    }
//
//    fun findparent(parent: MutableList<Int>, x: Int): Int {
//        if (parent[x] != x) {
//            parent[x] = findparent(parent, parent[x])
//        }
//        return parent[x]
//    }
//
//    fun union(parent: MutableList<Int>, node1: Int, node2: Int) {
//        val temp1 = findparent(parent, node1)
//        val temp2 = findparent(parent, node2)
//        if (temp1 < temp2) parent[temp2] = temp1
//        else parent[temp1] = temp2
//    }
//
//    Xlist.sortBy { it.second }
//    Ylist.sortBy { it.second }
//    Zlist.sortBy { it.second }
//
//    val route = mutableListOf<Triple<Int, Int, Int>>()
//
//    for (i in 0 until Xlist.size - 1) {
//        val route1 = Math.abs(Xlist[i].second - Xlist[i + 1].second)
//        val route2 = Math.abs(Ylist[i].second - Ylist[i + 1].second)
//        val route3 = Math.abs(Zlist[i].second - Zlist[i + 1].second)
//        route.add(Triple(route1, Xlist[i].first, Xlist[i + 1].first))
//        route.add(Triple(route2, Ylist[i].first, Ylist[i + 1].first))
//        route.add(Triple(route3, Zlist[i].first, Zlist[i + 1].first))
//    }
//
//    route.sortBy { it.first }
//
//    val parentplanet = MutableList(n) { it }
//    var cost = 0
//    for (i in route) {
//        val parentA = findparent(parentplanet, i.second)
//        val parentB = findparent(parentplanet, i.third)
//        if (parentA != parentB) {
//            cost += i.first
//            union(parentplanet, i.second, i.third)
//        }
//    }
//
//    println(cost)
//}

fun main() {
    val n = readln().toInt()

//    repeat(n){
    val m = readln().toInt()
    val lastRanking = readln().split(" ").map { it.toInt() }.take(m)

    val graph = Array(m+1){
        mutableListOf<Int>()
    }

    val indegree = MutableList(m+1){0}

    for (i in 0 until m) {
        for(j in 0 until i){
            graph[lastRanking[j]].add(lastRanking[i]) // 앞에 있는 사람은 뒤에 있는 모든 사람들에게 진입하기 때문에 앞에 있는 사람들의 경로에다 뒤에 있는 사람 한 명씩 더해준다.
        }
        indegree[lastRanking[i]] = i // 자기 등수만큼 자기 자신 앞에 있는 사람이 있다. -> 이걸 진입 차수로 설정
    }

    println(graph.contentToString())
    println(indegree)

    val changeCount = readln().toInt()
    repeat(changeCount) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        if(graph[a].contains(b)){
            graph[a].remove(b)
            graph[b].add(a)
            indegree[a]++
            indegree[b]--
        }else{
            graph[b].remove(a)
            graph[a].add(b)
            indegree[b]++
            indegree[a]--
        }
    }

    println(graph.contentToString())
    println(indegree)

    val q = ArrayDeque<Int>()

    val result = mutableListOf<Int>()
    for(i in 1 ..m){
        if(indegree[i] == 0){
            q.addLast(i)
            result.add(i)
        }
    }

    while(q.isNotEmpty()){
        val temp = q.removeFirst()
        for(i in graph[temp]){
            indegree[i]--
            if(indegree[i] == 0){
                q.addLast(i)
                result.add(i)
            }
        }
    }

    println(result)

//    }
}