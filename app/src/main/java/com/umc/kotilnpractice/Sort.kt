package com.umc.kotilnpractice

import kotlin.math.pow

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

//class Solution {
//    fun solution(k: Int, dungeons: Array<IntArray>): Int {
//        var answer: Int = -1
//        val result = mutableListOf<Int>()
//        val combination = mutableListOf<Int>()
//
//        answer = findCase(k, dungeons, combination, result)
//
//        return answer
//    }
//
//    fun findCase(
//        tired: Int,
//        dungeons: Array<IntArray>,
//        combination: MutableList<Int>,
//        result: MutableList<Int>,
//    ): Int {
//        if (combination.size == dungeons.size) {
//            var tiredData = tired
//            var count = 0
//            for (i in combination) {
//                if (tiredData >= dungeons[i][0]) {
//                    tiredData -= dungeons[i][1]
//                    count++
//                } else {
//                    break
//                }
//            }
//            result.add(count)
//        } else {
//            for (i in dungeons.indices) {
//                if (!combination.contains(i)) {
//                    combination.add(i)
//                    findCase(tired, dungeons, combination, result)
//                    combination.remove(i)
//                }
//            }
//        }
//        return result.maxOf { it }
//    }
//}

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

//class Solution {
//    fun findParent(x: Int, parent: MutableList<Int>): Int {
//        if (x != parent[x]) {
//            parent[x] = findParent(parent[x], parent)
//        }
//        return parent[x]
//    }
//
//    fun unionParent(a: Int, b: Int, parent: MutableList<Int>) {
//        var aParent = findParent(a, parent)
//        var bParent = findParent(b, parent)
//        if (aParent <= bParent) {
//            parent[bParent] = aParent
//        } else {
//            parent[aParent] = bParent
//        }
//    }
//
//    fun solution(n: Int, wires: Array<IntArray>): Int {
//        var answer: Int = wires.size
//        var result = mutableListOf<Int>()
//        for (i in 0 until wires.size) {
//            val parent = MutableList(n + 1) { it }
//
//            for (j in 0 until wires.size) {
//                if (j == i) {
//                    continue
//                }
//                unionParent(wires[j][0], wires[j][1], parent)
//            }
//
//            for (j in 1..n) {
//                findParent(j, parent)
//            }
//
//            val parentnode = findParent(1, parent)
//            val aNodeCount = parent.count { it == parentnode }
//            val bNodeCount = n - aNodeCount
//            val differ = Math.abs(aNodeCount - bNodeCount)
//            result.add(differ)
//        }
//        answer = result.minOf { it }
//        return answer
//    }
//}

//fun main(){
//    val temp = Solution()
//    println(temp.solution(arrayOf("I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333")))
//}
//
//class Solution {
//    fun solution(operations: Array<String>): IntArray {
//        var answer = intArrayOf()
//        var resultMin = PriorityQueue<Int>() { a, b -> a - b }
//        var resultMax = PriorityQueue<Int>() { a, b -> b - a }
//        for (i in operations) {
//            if (i[0] == 'I') {
//                val num = i.substring(2, i.length).toInt()
//                resultMin.add(num)
//                resultMax.add(num)
//            } else {
//                val num = i.substring(2, i.length).toInt()
//                if (num == 1) {
//                    resultMin.remove(resultMax.poll())
//                } else {
//                    resultMax.remove(resultMin.poll())
//                }
//            }
//        }
//        val max = resultMax.peek()
//        val min = resultMin.peek()
//        if(max == null && min == null) answer = intArrayOf(0,0)
//        else answer = intArrayOf(max, min)
//        return answer
//    }
//}
//class Solution {
//    val WORDS = charArrayOf('A', 'E', 'I', 'O', 'U')
//    val MAX_LENGTH = 5
//    fun solution(word: String): Int {
//        var answer = 0
//        val elements: MutableList<String> = ArrayList()
//        for (i in WORDS.indices) {
//            dfs(elements, WORDS[i].toString())
//        }
//        for (i in elements.indices) {
//            if (elements[i] == word) {
//                answer = i + 1
//                break
//            }
//        }
//        return answer
//    }
//
//    fun dfs(elements: MutableList<String>, str: String) {
//        if (str.length > MAX_LENGTH) return
//        if (!elements.contains(str)) elements.add(str)
//        for (i in WORDS.indices) {
//            dfs(elements, str + WORDS[i])
//        }
//    }
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
//        for(i in lost2){
//            for(j in reserve2){
//                if(i==j){
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
//        for(i in 0 until lost2.size){
//            for(j in count+1 until reserve2.size){
//                var front = reserve2[j] -1
//                var back = reserve2[j]+1
//
//                if(front >0){
//                    if(front == lost2[i]){
//                        // reserve2.removeAt(j)
//                        count++
//                        break
//                    }
//                }
//                if(back < n+1){
//                    if(back == lost2[i]){
//                        // reserve2.removeAt(j)
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

//fun main(){
//    val temp = Solution()
//    println(temp.solution(3, intArrayOf(3), intArrayOf(1)))
//}
//
//class Solution {
//    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
//        var answer = 0
//        val lostTemp = lost.toMutableList()
//        val reserveTemp = reserve.toMutableList()
//
//        val revmoeVal = mutableListOf<Int>()
//        for(i in lostTemp.indices){
//            for(j in reserveTemp.indices){
//                if(lostTemp[i] == reserveTemp[j]){
//                    revmoeVal.add(lostTemp[i])
//                }
//            }
//        }
//
//        lostTemp.removeAll(revmoeVal)
//        reserveTemp.removeAll(revmoeVal)
//
//        lostTemp.sort()
//        reserveTemp.sort()
//
//        for(i in reserveTemp){
//            if(lostTemp.contains(i-1)){
//                lostTemp.remove(i-1)
//            }else if(lostTemp.contains(i+1)){
//                lostTemp.remove(i+1)
//            }
//        }
//
//        answer = n - lostTemp.size
//
//        return answer
//    }
//}

//class Solution {
//    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
//        var answer = intArrayOf()
//        val result = mutableListOf<Int>()
//        for (i in commands) {
//            val temp = array.slice(i[0] - 1 until i[1]).toMutableList()
//            temp.sort()
//            result.add(temp[i[2] - 1])
//        }
//
//        answer = result.toIntArray()
//        return answer
//    }
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
//    val temp = Solution()
//    println(temp.solution("AABAAAAABBB"))
//}
//
//class Solution {
//    // 모든 이동 횟수를 담을 list
//    var result = mutableListOf<Int>()
//
//    // 모든 좌, 우(위, 아래는 아님) 움직임 경우의 수를 다 확인한다.
//    fun findShortestMove(index: Int, name: CharArray, count: Int) {
//        var flag = false
//        // 주어진 문자열을 'A'로만 이루어진 형태로 변경하면서 횟수를 세아린다.
//        for (i in name.indices) {
//            if (name[i] != 'A') { // name에 'A'가 아닌 단어가 있는 경우
//                flag = true
//                break
//            }
//        }
//
//        if (!flag) { // name이 'A'로만 이루어진 경우
//            result.add(count) // result에 이동 횟수를 저장한다.
//        } else {
//            if (name[index] != 'A') { // 현재 index에 'A'가 아닌 문자가 있을 경우
//                var temp = findShortestWord(name[index]) + count // 해당 문자를 변경한 횟수 + 지금까지의 횟수
//                name[index] = 'A' // 실제로도 변경해준다.
//                return findShortestMove(index, name, temp) // 재귀로 변경사항이 더 있는지 확인한다.
//            }
//
//            var right = index + 1 // 현재 index가 'A'일 때 오른쪽에 'A'가 아닌 문자가 있는지 확인한다.
//            var rightMove = 1
//            while (true) {
//                if (right == name.size) right = 0
//                if (name[right] != 'A') { // 'A'가 아닌 문자가 있는 경우
//                    // 해당 문자를 'A'로 변경할 때 필요한 횟수 + 지금까지의 횟수 + 오른쪽으로 움직인 횟수
//                    var temp = findShortestWord(name[right]) + count + rightMove
//
//                    val temp2 = name[right]
//                    name[right] = 'A'
//                    findShortestMove(right, name, temp)
//                    // 여기서 원래 문자열로 되돌려 놓지 않으면 아래에 Left에서 재귀로 문자열을 보낼 때 Right에서 변경한 문자열을 확인하게 된다. 그러므로 모든 경우의 수를 확인하려면 원래 문자로 되돌려 둔다.
//                    name[right] = temp2
//                    break
//                }
//                right++
//                rightMove++
//            }
//
//            var left = index - 1
//            var leftMove = 1
//            while (true) {
//                if (left == -1) left = name.size - 1
//                if (name[left] != 'A') {
//                    var temp = findShortestWord(name[left]) + count + leftMove
//                    val temp2 = name[left]
//                    name[left] = 'A'
//                    findShortestMove(left, name, temp)
//                    name[left] = temp2
//                    break
//                }
//                left--
//                leftMove++
//            }
//        }
//    }
//
//    fun findShortestWord(alphabet: Char): Int {
//        var up = 'B'
//        var down = 'Z'
//        var moveCount = 1
//        while (up != alphabet && down != alphabet) {
//            if (up == 'Z' + 1) up = 'A'
//            if (down == 'A' - 1) down = 'Z'
//            up++
//            down--
//            moveCount++
//        }
//        return moveCount
//    }
//
//
//    fun solution(name: String): Int {
//        findShortestMove(0, name.toCharArray(), 0)
//        return result.minOf{it}
//    }
//}

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
//    val temp = Solution()
//    println(temp.solution("4177252841", 4))
//}
//
//class Solution {
//    fun solution(number: String, k: Int): String {
//        val limit = number.length
//        val totalcount = limit - k
//        var startpoint = 0
//        var endpoint = limit - totalcount
//        val result = mutableListOf<Char>()
//
//        repeat(totalcount){
//            var max = 0
//            for(i in startpoint .. endpoint){
//                val temp = number[i].digitToInt()
//                if(temp > max){
//                    startpoint = i+1
//                    max = temp
//                }
//            }
//            println(max)
//            result.add(max.digitToChar())
//            endpoint++
//        }
//
//        return String(result.toCharArray())
//    }
//}

//fun main() {
//    val temp = Solution()
//    println(temp.solution(intArrayOf(555, 565, 566, 55, 56, 5, 54, 544, 549)))
//}
//
//class Solution {
//    fun solution(numbers: IntArray): String {
//        var answer = ""
//        val sortedNumbers = numbers.sortedByDescending {
//            var temp = it.toString()
//            while(temp.length < 4){
//                temp = temp.plus(temp)
//            }
//            temp.substring(0 until 4).toInt()
//        }
//        val result = sortedNumbers.joinToString("")
//        if(result[0] == '0'){
//            answer = "0"
//        }else{
//            answer = result
//        }
//        return answer
//    }
//}

//fun main() {
//    val temp = Solution()
//    println(temp.solution(intArrayOf(70, 50, 80, 50), 100))
//}
//
//class Solution {
//    fun solution(people: IntArray, limit: Int): Int {
//        val result = mutableListOf<MutableList<Int>>()
//        val visited = MutableList<Boolean>(people.size) { false }
//
//        people.sort()
//        for (i in people.indices) {
//            if (visited[i] == false) {
//                result.add(MutableList<Int>(1) { people[i] })
//                visited[i] = true
//                for (j in people.size - 1 downTo i + 1) {
//                    if (visited[j] == false) {
//                        val temp = result.last()
//                        val tempSum = temp.sum() + people[j]
//                        if (tempSum <= limit) {
//                            temp.add(people[j])
//                            visited[j] = true
//                        }
//                    }
//                }
//
//            }
//        }
//        println(result)
//        return result.size
//    }
//}

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
//    println(temp.solution(4,
//        arrayOf(intArrayOf(0, 1, 1),
//            intArrayOf(0, 2, 2),
//            intArrayOf(1, 2, 5),
//            intArrayOf(1, 3, 1),
//            intArrayOf(2, 3, 8))))
//}
//class Solution {
//
//    fun findParent(x: Int, parent: MutableList<Int>): Int {
//        if (parent[x] != x) {
//            parent[x] = findParent(parent[x], parent)
//        }
//        return parent[x]
//    }
//
//    fun union(x: Int, y: Int, parent: MutableList<Int>) {
//        val xParent = findParent(x, parent)
//        val yParent = findParent(y, parent)
//        if (xParent < yParent) {
//            parent[yParent] = xParent
//        } else {
//            parent[xParent] = yParent
//        }
//    }
//
//    fun solution(n: Int, costs: Array<IntArray>): Int {
//        val parent = MutableList(n + 1) { it }
//
//        costs.sortBy { it[2] }
//
//        var sum = 0
//        for (i in costs) {
//            if (findParent(i[0], parent) != findParent(i[1], parent)) {
//                union(i[0], i[1], parent)
//                sum += i[2]
//            }
//        }
//
//        return sum
//    }
//}

//fun main(){
//    val temp = Solution()
//    println(temp.solution(intArrayOf(100, 100, 100)))
//}
//
//class Solution {
//    fun solution(citations: IntArray): Int {
//        var answer = 0
//        for(i in 0 .. citations.last()){
//
//            var count = 0
//            for(j in citations){
//                if(i <= j){
//                    count++
//                }
//            }
//
//            if(count >= i){
//                answer = Math.max(answer, i)
//            }else{
//                break
//            }
//        }
//
//        return answer
//    }
//}

//fun main() {
//    val temp = Solution()
//    println(temp.solution(8, 53))
//}

//class Solution {
//    fun solution(N: Int, number: Int): Int {
//        var answer = -1
//        if (N == number) return 1
//
//        var hash = hashMapOf<Int, MutableSet<Int>>()
//        val first = mutableSetOf<Int>()
//        first.add(N)
//        hash.put(1, first)
//
//        var numberCombi = hashMapOf<Int, Int>()
//        numberCombi.put(N, 1)
//
//        for (i in 2..8) {
//            val result = mutableSetOf<Int>()
//
//            var string = ""
//            repeat(i) {
//                string = string.plus(N.toString())
//            }
//            result.add(string.toInt())
//            numberCombi.putIfAbsent(string.toInt(), i)
//
//            for (k in 1..i / 2) {
//                val temp = hash.get(i - k)
//                val temp2 = hash.get(k)
//
//                for (j in temp!!) {
//                    for (p in temp2!!) {
//                        result.add(j + p)
//                        numberCombi.putIfAbsent(j + p, i)
//
//                        result.add(j * p)
//                        numberCombi.putIfAbsent(j * p, i)
//
//                        if (p != 0) {
//                            result.add(j / p)
//                            numberCombi.putIfAbsent(j / p, i)
//                        }
//
//                        if (j != 0) {
//                            result.add(p / j)
//                            numberCombi.putIfAbsent(p / j, i)
//                        }
//
//                        result.add(j - p)
//                        numberCombi.putIfAbsent(j - p, i)
//
//                        result.add(p - j)
//                        numberCombi.putIfAbsent(p - j, i)
//                    }
//                }
//
//                if (numberCombi.containsKey(number)) {
//                    answer = numberCombi.get(number)!!
//                    break
//                }
//            }
//
//            hash.put(i, result)
//        }
//
//        return answer
//    }
//}

//class Solution {
//    fun solution(sizes: Array<IntArray>): Int {
//        var answer: Int = 0
//        var widthmax = 0
//        var heightmax = 0
//        for(i in sizes.indices){
//            widthmax = Math.max(widthmax, Math.max(sizes[i][0], sizes[i][1]))
//            heightmax = Math.max(heightmax, Math.min(sizes[i][0], sizes[i][1]))
//        }
//        answer = widthmax * heightmax
//        var s = ""
//
//        return answer
//    }
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
//            if (i % 2 == 0) {
//                if (2 == answers[i]) {
//                    two.add(true)
//                } else {
//                    two.add(false)
//                }
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
//
//                if (temp2 == 6) temp2 = 3
//                else if (temp2 == 4) temp2 = 1
//                else if (temp2 == 3) temp2 = 4
//            }
//
//
//            if (temp2 == answers[i]) three.add(true)
//            else three.add(false)
//        }
//        val result = mutableListOf<Pair<Int,Int>>()
//        result.add(Pair(1, one.count { it == true }))
//        result.add(Pair(2, two.count { it == true }))
//        result.add(Pair(3, three.count { it == true }))
//
//        result.sortByDescending { it.second }
//        for(i in result.indices){
//            if(result[0].second == 0) break
//            if(i > 0 && result[i-1].second > result[i].second){ break
//            }else{ answer.add(result[i].first) }
//        }
//        return answer.toIntArray()
//    }
//
//}
