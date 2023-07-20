package com.umc.kotilnpractice

import java.util.*

//fun main() {
////    val array = arrayOf(7, 5, 9, 0, 3, 1, 6, 2, 4, 8)
//    val array = arrayOf(7,5,9,0,3,1,6,2,9,1,4,8,0,5,2)
//
////    // 선택 정렬
////    for(i in array.indices){
////        var min_index = i
////        for(j in i+1 until array.size){
////            if(array[min_index] > array[j]){
////                min_index = j
////            }
////        }
////        array[i] = array[min_index].also { array[min_index] = array[i] }
////    }
//
////    // 삽입 정렬
////    for(i in 1 until array.size){
////        for(j in i downTo  1 ){
////            if(array[j] < array[j-1]){
////                array[j] = array[j-1].also { array[j-1] = array[j] }
////            }
////            else{
////                break
////            }
////        }
////    }
//
////    // 퀵 정렬 1
////    fun quick_sort(array:Array<Int>, start : Int, end : Int){
////        if(start >= end){ // 시작점과 끝점이 같거나 역전될 때 -> 사이에 원소가 하나 or 없을 때
////            return
////        }
////        var pivot = start
////        var left = start+1
////        var right = end
////        while(left <= right){
////            while(left <= end && array[left] <= array[pivot]){
////                left++
////            }
////            while(right > start && array[right] >= array[pivot]){
////                right--
////            }
////
////            if(left > right){ // left와 right가 역전되었을 때 -> right과 pivot을 교환하자
////                array[right] = array[pivot].also { array[pivot] = array[right] }
////            }else{
////                array[left] = array[right].also { array[right] = array[left] }
////            }
////
////            quick_sort(array,start,right-1)
////            quick_sort(array,right+1,end)
////        }
////
////    }
////    quick_sort(array,0,array.size - 1)
//
////    // 퀵 정렬 2
////    fun quick_sort(array: Array<Int>): Array<Int> {
////        if (array.size <= 1) {
////            return array
////        }
////
////        var pivot = array[0]
//////        var tail = array.slice(1 until array.size)
////        var tail = array.takeLast(array.size-1)
////
////        var left_side = emptyArray<Int>()
////        var right_side = emptyArray<Int>()
////
////        tail.forEach {
////            if (it <= pivot) {
////                left_side = left_side.plus(it)
////            }
////            if (it > pivot) {
////                right_side = right_side.plus(it)
////            }
////        }
////
////        return quick_sort(left_side).plus(arrayOf(pivot)).plus(quick_sort(right_side))
////    }
////
////    println(quick_sort(array).contentToString())
//
////    var count = Array<Int>(size = array.max()+1){0}
////
////    for(i in array.indices){
////        count[array[i]]++
////    }
////    println(count.contentToString())
////
////    for(i in count.indices){
////        for(j in 0 until count[i]){ // 각 원소에 저장된 중복 횟수만큼 반복해서
////            print("$i ") // 해당 원소를 보여준다.
////        }
////    }
//
////    println(array.contentToString())
//}

//// 2
//fun main(){
//    val a = readln().toInt()
//    val b = MutableList(a){
//        readln().toInt()
//    }
//    b.sortDescending()
//    println(b)
//
//    val n = readln().toInt()
//    var array = Array(n){
//        readln().toInt()
//    }
//
////    array =  array.sortedArrayDescending()
//    array.sortDescending()
//    println(array.contentToString())
//}

//// 3
//fun main(){
//    val n = readln().toInt()
//    val matrix = Array(n){
//        readln().split(" ").map{ it }
//    }
//
//    matrix.sortBy { it[1].toInt() }
//
//    for(i in matrix){
//        print("${i[0]} ")
//    }
//}

//// 4
//fun main() {
//    val (N, K) = readln().split(" ").map { it.toInt() }
//    val arrayA = readln().split(" ").map { it.toInt() }.take(N).toMutableList()
//    val arrayB = readln().split(" ").map { it.toInt() }.take(N).toMutableList()
//
//    arrayA.sort()
//    arrayB.sort()
//
//    for(i in 0 until K){
//        if(arrayA[i] >= arrayB[N-1-i]){
//            break
//        }else{
//            arrayA[i] = arrayB[N-1-i]
//        }
//    }
//
//    println(arrayA.sum())
//}

//// 이진 탐색 재귀
//fun main(){
//    fun binary_search(array:List<Int>, target:Int, start:Int, end:Int):Int?{
//        if(start>end){
//            return null
//        }
//        val mid: Int = (start+end)/2
//
//        return if(array[mid] == target){
//            mid
//        }else if(array[mid]>target){
//            binary_search(array,target,start,mid-1)
//        }else{
//            binary_search(array,target,mid+1,end)
//        }
//    }
//
//    val (n, target) = readln().split(" ").map{it.toInt()}
//    val array = readln().split(" ").map { it.toInt() }.take(n)
//
//    val result = binary_search(array, target, 0, n-1)
//    if(result == null){
//        println("원소가 존재하지 않습니다.")
//    }else {
//        println(result+1)
//    }
//}

//// 이진 탐색 반복문
//fun main() {
//    fun binary_search(array: List<Int>, target: Int, start: Int, end: Int): Int? {
//        var start = start
//        var end = end
//        while (start <= end) {
//            val mid = (start + end) / 2
//            if (array[mid] == target) {
//                return mid
//            } else if (array[mid] > target) {
//                end = mid - 1
//            } else {
//                start = mid + 1
//            }
//        }
//        return null
//    }
//
//    val (n, target) = readln().split(" ").map { it.toInt() }
//    val array = readln().split(" ").map { it.toInt() }.take(n)
//
//    val result = binary_search(array, target, 0, n - 1)
//    if (result == null) {
//        println("원소가 존재하지 않습니다.")
//    } else {
//        println(result + 1)
//    }
//}

//// 2
//fun main() {
////    val N = readln().toInt()
////    val arrayN = readln().split(" ").map { it.toInt() }.take(N)
////    val M = readln().toInt()
////    val arrayM = readln().split(" ").map { it.toInt() }.take(M)
////
////    for(i in arrayM){
////        if(arrayN.contains(i)){
////            print("yes ")
////        }else{
////            print("no ")
////        }
////    }
////
////    val N = readln().toInt()
////    val arrayN = readln().split(" ").map { it.toInt() }.take(N).toMutableList()
////    val M = readln().toInt()
////    val arrayM = readln().split(" ").map { it.toInt() }.take(M)
////
////    arrayN.sort()
////
////    fun binary_search(array: List<Int>, target: Int, start: Int, end: Int): String {
////        val mid = (start + end) / 2
////        if (array[mid] == target) return "yes "
////        else if(start >= end) return "no "
////
////        return if (array[mid] > target) {
////            binary_search(array, target, start, mid - 1)
////        } else {
////            binary_search(array, target, mid + 1, end)
////        }
////    }
////
////    for(i in arrayM){
////        print(binary_search(arrayN,i, 0,N-1).toString())
////    }
//
////    // 계수 정렬 풀이법
////    val n = readln().toInt()
////    val array = Array(1000000){0}
////
////    for(i in readln().split(" ").map{it.toInt()}.take(n).toMutableList()){
////        array[i]=1
////    }
////
////    val m = readln().toInt()
////    val x = readln().split(" ").map{it.toInt()}.take(m)
////
////    for(i in x){
////        if(array[i]==1){
////            print("yes ")
////        }else{
////            print("no ")
////        }
////    }
//
////    // 집합 set 풀이법
////    val n = readln().toInt()
////    val array = readln().split(" ").map{it.toInt()}.take(n).toSet()
////
////    val m = readln().toInt()
////    val x = readln().split(" ").map{it.toInt()}.take(m)
////
////    for(i in x){
////        if(i in array){
////            print("yes ")
////        }else{
////            print("no ")
////        }
////    }
//}

//// 3
//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val array = readln().split(" ").map { it.toInt() }.take(n).toMutableList()
//
//    var start = 0
//    var end = array.max()
//
//    var result = 0
//    while(start<=end){
//        var total = 0
//        var mid = (start+end)/2
//        for(x in array){
//            if(x>mid){
//                total += x - mid
//            }
//        }
//
//        if(total < m){
//            end = mid-1
//        }else{
//            result = mid
//            start = mid+1
//        }
//    }
//
//    print(result)
//}

//// 1
//fun main() {
//    val n = readln().toInt()
//
//    data class student(val name: String, val korean: Int, val english: Int, val math: Int)
//
//    val data = mutableListOf<student>()
//
//    repeat(n) {
//        var temp = readln().split(" ").map { it }.toMutableList()
//        val name = temp[0]
//        val kor = temp[1].toInt()
//        val eng = temp[2].toInt()
//        val math = temp[3].toInt()
//        data.add(student(name, kor, eng, math))
//    }
//
////    data.sortWith(
////        compareByDescending(student::korean).thenBy(student::english)
////            .thenByDescending(student::math).thenBy(student::name)
////    )
//
//    data.sortWith(
//        compareBy(
//            { -it.korean },
//            { it.english },
//            { -it.math },
//            { it.name }
//        )
//    )
//    data.forEach { println(it.name) }
//
//}

//// 2
//fun main(){
//    val n = readln().toInt()
//    val house = readln().split(" ").map { it.toInt() }.take(n).toMutableList()
//
//    house.sort()
//    println(house[(n-1)/2])
//}

//// 3
//fun main() {
//    val n = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }.toMutableList()
//    val fail = mutableListOf<Pair<Int,Double>>()
//
//
//    var total = array.size
//    for (num in 1 until n+1) {
//        var p = array.count { it == num }
//
//        if(total==0){
//            fail.add(Pair(num, 0.0))
//        }else{
//            fail.add(Pair(num, p.toDouble()/total.toDouble()))
//        }
//        total-= p
//    }
//
//    fail.sortByDescending { it.second }
//    fail.forEach{print(it.first)}
//}

//data class data(val name: String, val kor: Int, val eng: Int, val math: Int)
//
//fun main() {
//    val count = readln().toInt()
//    val array = Array(count){
//        val (name, kor, eng, math) = readln().split(" ")
//        data(name, kor.toInt(), eng.toInt(), math.toInt())
//    }
//
//    array.sortWith(compareByDescending<data> { it.kor }
//        .thenBy { it.eng }
//        .thenByDescending{it.math}
//        .thenBy { it.name })
//
//    for(i in 0 until count){
//        println(array[i].name)
//    }
//
//}

//fun main(){
//    val size = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }.toMutableList()
//    array.sort()
//
//    var sum1 = 0
//    var sum2 = 0
//    var sum3 = 0
//    for(i in array.indices){
//        sum1 += Math.abs(array[i]-array[size/2])
//        sum2 += Math.abs(array[i]-array[size/2-1])
//        sum3 += Math.abs(array[i]-array[size/2+1])
//    }
//    val result = mutableListOf<Pair<Int,Int>>()
//    result.add(Pair(sum1,size/2))
//    result.add(Pair(sum2,size/2-1))
//    result.add(Pair(sum3,size/2+1))
//    result.sortWith( compareBy<Pair<Int, Int>> { it.first }.thenBy { it.second })
//    println(result)
//}

//fun main(){
//    val N = readln().toInt()
//    val stages = readln().split(" ").map { it.toInt() }.toIntArray()
//    val result = mutableListOf<Pair<Int,Double>>() // 스테이지 번호, 실패율
//
//    var challengepeople = stages.size
//    for(i in 1..N){
//        var notclear = 0
//        for(j in stages.indices){
//            if(stages[j]==i){
//                notclear++
//            }
//        }
//        var fail = 0.0
//        if(challengepeople != 0){
//            fail = notclear / challengepeople.toDouble()
//        }
//        challengepeople -= notclear
//        result.add(Pair(i, fail))
//    }
//
//    result.sortByDescending { it.second }
//
//    var answer = intArrayOf()
//    for(i in result.indices){
//        answer = answer.plus(result[i].first)
//    }
//    println(answer.contentToString())
//}

//fun main() {
//    val n = readln().toInt()
//    val array = PriorityQueue<Int>()
//
//    repeat(n) {
//        array.add(readln().toInt())
//    }
//
//    val result = mutableListOf<Int>()
//
//    while (array.isNotEmpty()) {
//        if(array.size > 1){
//            val sum = array.poll()+ array.poll()
//            result.add(sum )
//            array.add(sum)
//        }else{
//            array.poll()
//        }
//    }
//
//    println(result.sum())
//}

//fun main(){
//    val num = readln().toInt()
//
//    val data = Array(num){
//        readln().split(' ').take(4)
//    }
//
//    data.sortWith(compareByDescending<List<String>> { it[1].toInt() }.thenBy { it[2].toInt() }.thenByDescending { it[3].toInt() }.thenBy { it[0] })
//    for(i in data){
//        println(i[0])
//    }
//}

//fun main() {
//    val temp = Solution()
//    println(temp.solution(4,
//        arrayOf(intArrayOf(0, 1, 1), intArrayOf(0, 2, 2), intArrayOf(1, 2, 5), intArrayOf(1, 3, 1),
//            intArrayOf(2, 3, 8))))
//}
//
//class Solution {
//    fun findparent(parent: MutableList<Int>, x: Int): Int {
//        if (parent[x] != x) {
//            parent[x] = findparent(parent, parent[x])
//        }
//        return parent[x]
//    }
//
//    fun union_parent(parent: MutableList<Int>, a: Int, b: Int) {
//        val parentA = findparent(parent, a)
//        val parentB = findparent(parent, b)
//        if (parentA < parentB) {
//            parent[parentB] = parentA
//        } else {
//            parent[parentA] = parentB
//        }
//    }
//
//    fun solution(n: Int, costs: Array<IntArray>): Int {
//        var answer = 0
//
//        val parent = MutableList(n) { it }
//
//        costs.sortBy { it[2] }
//
//        for(i in costs){
//            val (a, b, cost ) = i
//            if(findparent(parent,a)!= findparent(parent, b)){
//                union_parent(parent, a, b)
//                answer += cost
//            }
//        }
//
//        return answer
//    }
//}

//fun main() {
//    val temp = Solution()
//    println(temp.solution(7, arrayOf(intArrayOf(1, 2), intArrayOf(2, 7), intArrayOf(3, 7),
//        intArrayOf(3, 4), intArrayOf(4, 5), intArrayOf(6, 7))))
//}
//
//class Solution {
//    fun findparent(parent: MutableList<Int>, x: Int): Int {
//        if (parent[x] != x) {
//            parent[x] = findparent(parent, parent[x])
//        }
//        return parent[x]
//    }
//
//    fun union_parent(parent: MutableList<Int>, a: Int, b: Int) {
//        val aParent = findparent(parent, a)
//        val bParent = findparent(parent, b)
//        if (aParent > bParent) {
//            parent[aParent] = bParent
//        } else {
//            parent[bParent] = aParent
//        }
//    }
//
//    fun solution(n: Int, wires: Array<IntArray>): Int {
//        var answer: Int = wires.size
//        val temp = wires.toMutableList()
//        temp.sortWith(compareBy<IntArray> { it.first() }.thenBy { it.last() })
//        for (i in temp.indices) {
//            val parent = MutableList(n + 1) { it }
//            for (j in temp.indices) {
//                if (i == j) continue
//                val (a, b) = temp[j]
//                if (findparent(parent, a) != findparent(parent, b)) {
//                    union_parent(parent, a, b)
//                }
//            }
//
//            for(i in 1 until parent.size){
//                parent[i] = findparent(parent, i)
//            }
//
//            val temp2 = parent.toMutableSet()
//            temp2.remove(0)
//            println(temp2)
//            if (temp2.size == 2) {
//                val one = parent.count { it == temp2.first() }
//                val two = parent.count { it == temp2.last() }
//                val differ = Math.abs(one - two)
//                answer = Math.min(answer, differ)
//            }
//        }
//
//        return answer
//    }
//}

//fun main() {
//    val temp = Solution()
//    println(temp.solution(7, arrayOf(intArrayOf(1, 2), intArrayOf(2, 7), intArrayOf(3, 7),
//        intArrayOf(3, 4), intArrayOf(4, 5), intArrayOf(6, 7))))
//}
//
//class Solution {
//    fun solution(n: Int, wires: Array<IntArray>): Int {
//        var answer: Int = wires.size
//
//        for(i in wires.indices){
//            val route = Array(n+1){
//                mutableListOf<Int>()
//            }
//            for(j in wires.indices){
//                if(i==j) continue
//                val (x, y)= wires[j]
//                route[x].add(y)
//                route[y].add(x)
//            }
//            val visited = MutableList(n+1){false}
//            val totalcount = mutableListOf<Int>()
//            for(i in 1 until n){
//                if(!visited[i]){
//                    val q = ArrayDeque<Int>()
//                    q.addLast(i)
//                    visited[i] = true
//                    var count = 1
//                    while(q.isNotEmpty()){
//                        val temp = q.removeFirst()
//                        for(i in route[temp]){
//                            if(!visited[i]){
//                                q.addLast(i)
//                                visited[i] = true
//                                count++
//                            }
//                        }
//                    }
//                    totalcount.add(count)
//                }
//            }
//            if(totalcount.size==2){
//                answer = Math.min(answer, Math.abs(totalcount[0]-totalcount[1]))
//            }
//        }
//
//        return answer
//    }
//}
//fun main() {
//    val n = readln().toInt()
//    val array = readln().split(' ').map { it.toInt() }
//    val temparray = array.sorted()
//    var result = 0
//    if (temparray.size % 2 == 0) {
//        val ref1 = temparray[temparray.size / 2 - 1]
//        var sum = 0
//        val ref2 = temparray[temparray.size / 2]
//        var sum2 = 0
//
//        for (i in temparray) {
//            sum += Math.abs(i - ref1)
//            sum2 += Math.abs(i - ref2)
//        }
//
//        if(sum <= sum2) result = ref1
//        else result = ref2
//    } else {
//        val ref = temparray[temparray.size / 2]
//        result = ref
//    }
//    println(result)
//}

//fun main(){
//    val temp = Solution()
//    println(temp.solution(5, intArrayOf(2, 1, 2, 6, 2, 4, 3, 3)).contentToString())
//}
//
//class Solution {
//    fun solution(N: Int, stages: IntArray): IntArray {
//        var answer = IntArray(N)
//
//        val result = mutableSetOf<Pair<Int, Float>>()
//
//        var people = stages.size
//        for(i in 1 .. N){
//            val count = stages.count { it == i }
//            if(people > 0){
//                val failure = count / people.toFloat()
//                result.add(Pair(i, failure))
//                people -= count
//            }else{
//                result.add(Pair(i, 0f))
//            }
//        }
//
//        val temp2 = result.sortedWith(compareByDescending<Pair<Int, Float>> { it.second }.thenBy { it.first })
//        for((idx, value) in temp2.withIndex()){
//            answer[idx] = value.first
//        }
//
//        return answer
//    }
//}
//
//class Solution {
//    fun solution(N: Int, stages: IntArray): IntArray {
//        var answer = intArrayOf()
//        val result = mutableListOf<Pair<Int,Double>>() // 스테이지 번호, 실패율
//        var challengepeople = stages.size
//        for(i in 1..N){
//            var notclear = 0
//            for(j in stages.indices){
//                if(stages[j]==i){
//                    notclear++
//                }
//            }
//            var fail = 0.0
//            if(challengepeople != 0){
//                fail = notclear / challengepeople.toDouble()
//            }
//            challengepeople -= notclear
//            result.add(Pair(i, fail))
//        }
//
//        result.sortByDescending { it.second }
//
//        for(i in result.indices){
//            answer = answer.plus(result[i].first)
//        }
//
//        return answer
//    }
//}

//fun main() {
//    val temp = Solution()
//    println(temp.solution(arrayOf(intArrayOf(0, 3), intArrayOf(1, 9), intArrayOf(2, 6))))
//}
//
//class Solution {
//    fun solution(jobs: Array<IntArray>): Int {
//        var answer = 0
//
//        var nowTime = 0
//        var totalTime = 0
//
//        val temp = jobs.toMutableList()
//
//        temp.sortWith(compareBy<IntArray> { it[0] }.thenBy { it[1] })
//
//        nowTime = temp.first()[0]
//        while (temp.size > 0) {
//            val nextCheckArray = PriorityQueue<Pair<Int, Int>>() { a, b -> a.first - b.first }
//            for ((i, valu) in temp.withIndex()) {
//                val nextTermCheck = nowTime - valu[0]
//                if (nextTermCheck > 0) { // 현재 작업이 끝나고 다음 작업까지 시간이 남아 있을 경우
//                    nextCheckArray.add(Pair(valu[1], i))
//                }
//            }
//            if (nextCheckArray.size > 0) {
//                val pop = nextCheckArray.poll()
//                totalTime += (nowTime - temp[pop.second][0]) + pop.first
//                nowTime += pop.first
//                temp.removeAt(pop.second)
//            } else {
//                val pop = temp.removeFirst()
//                totalTime += (pop[1])
//                nowTime += pop[1]
//            }
//        }
//
//        answer = totalTime / jobs.size
//        return answer
//    }
//}

//fun main() {
//    val n = readln().toInt()
//    val q = PriorityQueue<Int>() { a, b -> a - b }
//    repeat(n) {
//        q.add(readln().toInt())
//    }
//    var total = 0
//    while (q.size >= 2) {
//        val smallest = q.poll()
//        val nextSmallest = q.poll()
//        total += smallest + nextSmallest
//        q.offer(smallest + nextSmallest)
//    }
//    println(total)
//}
