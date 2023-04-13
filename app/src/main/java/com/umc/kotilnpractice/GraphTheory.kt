package com.umc.kotilnpractice

import kotlin.math.cos
import kotlin.math.max

//fun main(){
//    fun find_parent(parent: MutableList<Int>, x: Int): Int {
//        if (parent[x] != x) {
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