package com.umc.kotilnpractice.codingtest

import java.util.ArrayDeque
import java.util.PriorityQueue

//fun main() {
//    println("값을 입력하세요")
//    val price = readln().toInt()
//
//    val count = countingcoin(price)
//    println(count)
//
//    val count2 = countingcoin2(price)
//    println(count2)
//
//}
//
//fun countingcoin(price: Int): Int {
//    var count = 0
//    var implprice = price
//    while (implprice > 0) {
//        if ((implprice / 500) > 0) {
//            count += (implprice / 500)
//            implprice %= 500
//        } else if ((implprice / 100) > 0) {
//            count += (implprice / 100)
//            implprice %= 100
//        } else if ((implprice / 50) > 0) {
//            count += (implprice / 50)
//            implprice %= 50
//        } else if ((implprice / 10) > 0) {
//            count += (implprice / 10)
//            implprice %= 10
//        } else {
//            count
//        }
//    }
//    return count
//}
//
//fun countingcoin2(price: Int): Int {
//    val coin_type = listOf(500, 100, 50, 10)
//    var implprice = price
//    var count = 0
//    for (coin in coin_type) {
//        count += (implprice / coin)
//        implprice %= coin
//    }
//    return count
//}
//
//fun main(){
//    println("배열의 크기 : ")
//    val size = readln().toInt()
//    println("숫자가 더해지는 횟수 : ")
//    val count = readln().toInt()
//    println("연속해서 더해질 수 있는 최대 횟수 : ")
//    val max = readln().toInt()
//
//    var a = mutableListOf<Int>()
//    repeat(size) {
//        val aa = readln().toInt()
//        a.add(aa)
//    }
//
//    a.sort()
//    a.reverse()
//    var maxnum = 0
//    var impl = mutableListOf<Int>()
//    repeat(max){
//        impl.add(a[0])
//    }
//    impl.add(a[1])
//
//    for(i in 0..count-1){
//        var temp = i % (impl.size)
//        maxnum += impl[temp]
//    }
//    println(maxnum)
///////////////////////////////////////////////////////////////////////////////////////////////////////
//    val (size, count , max) = readln().split(' ').map{it.toInt()}
//    println("size : ${size}, count : ${count}, max : ${max}")
//
////    var list = mutableListOf<Int>()
////    repeat(size){
////        list.add(readln().toInt())
////    }
//
//    val list = MutableList(size) {
//        readln().toInt()
//    }
//
//    list.sort()
//    val first = list[size-1]
//    val second = list[size-2]
//
//    var allcount = (count / (max+1))
//    var firstcount = allcount * max
//    firstcount += (count % (max+1))
//
//    var result = 0
//    result += firstcount * first
//    result += allcount * second
//
//    println(result)
//}

//fun main() {
//    val (row, column) = readln().split(" ").map { it.toInt() }
//    println(row.toString() + " " + column.toString())
//
//    // 2차원 입력은 이렇게!!
//    val matrix = Array(row) {
//        readln().split(" ").map { it.toInt() }.toIntArray()
//    }
//
////    var minarray = mutableListOf<Int>()
////    for(row in matrix){
////        minarray.add(row.min())
////    }
////
////    println(minarray.max())
//    var result = 0
//    for (i in 0..column - 1) {
//        result = max(result, matrix[i].min())
//    }
//
//}

//fun main(){
//    val (N, K) = readln().split(" ").map{it.toInt()}
//    var num = N
//    var count = 0
//
////    while(num != 1){
////
////        if(num%K == 0){
////            num /= K
////            count++
////        }else{
////            num -= 1
////            count++
////        }
////    }
//
//    while(num!=1){
//        var temp = (num%K)
//        if(temp == 0){
//            num /= K
//            count++
//        }else{
//            num -= (temp)
//            count += temp
//            if(num ==0){ // 한번에 빼게될 경우 마지막 순간 1을 지나쳐 0으로 바로간다. 그래서 무한 루프에 빠짐
//                num = 1
//                count -= 1
//            }
//        }
//    }
//
//    println(count)
//}

//fun main() {
//
//    val size = readln().toInt()
//
//    val planner = readln().split(" ").map { it.toString() }.toTypedArray()
//
////    var point = Pair<Int, Int>(1, 1)
////    for (i in planner) {
////        when (i) {
////            "R" -> {
////                if (point.second < size) {
////                    point = Pair(point.first, point.second+1)
////                }
////            }
////            "L" -> {
////                if (1 < point.second ) {
////                    point = Pair(point.first, point.second-1)
////                }
////            }
////            "U" -> {
////                if (1 < point.first ) {
////                    point = Pair(point.first-1, point.second )
////                }
////            }
////            "D" -> {
////                if (point.first < size) {
////                    point = Pair(point.first+1, point.second )
////                }
////            }
////            else -> {
////                println("?!")
////            }
////        }
////    }
////
////    println(point)
//
//    var x = 1
//    var y = 1
//    val move_types = arrayOf("L", "R", "U", "D")
//    val dx = arrayOf(0, 0, -1, 1)
//    val dy = arrayOf(-1, 1, 0, 0)
//
//    for (plan in planner) {
//        var nx = 0
//        var ny = 0
//        for (i in 0..move_types.size - 1) {
//            if (move_types[i] == plan) {
//                nx = x + dx[i]
//                ny = y + dy[i]
//            }
//        }
//        if(nx < 1 || ny < 1 || nx > size || ny > size){
//            continue
//        }
//        x = nx
//        y = ny
//    }
//    println(x.toString()+" "+y)
//}

//// 2
//fun main(){
//    val (a,b,c) = readln().split(" ").map{it.toInt()}
//    val array = readln().split(" ").map { it.toInt() }.take(a).toMutableList()
//
//    array.sortDescending()
//    println(array)
//    var count = b/(c+1)
//    var count2 = b%(c+1)
//    var sum = (count*(3*array[0]+array[1])+count2*array[0])
//    println(sum)
//}

//// 3
//fun main(){
//    val (a,b) = readln().split(" ").map { it.toInt() }
//    val array = Array(a){
//        readln().split(" ").map { it.toInt() }.take(b).toMutableList()
//    }
//
//    var max = -1
//    repeat(a){
//        array[it].sort()
//        if(max<array[it][0]) max = array[it][0]
//    }
//    println(max)
//}

// 4
//fun main() {
//    var (a, b) = readln().split(" ").map { it.toInt() }
//    var count = 0
//    while (a != 1) {
//        if (a % b == 0) {
//            a /= b
//        } else {
//            a -= 1
//        }
//        count++
//    }
//    println(count)
//}

//fun main() {
//    var (a, b) = readln().split(" ").map { it.toInt() }
//    var count = 0
//    while (true) {
//        var target = (a / b) * b
//        count += (a - target)
//        a = target
//        if (a < b) break
//        count++
//        a /= b
//    }
//    count += (a-1)
//    println(count)
//}

//// 1
//fun main() {
//    val a = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }.take(a).toMutableList()
//
//    // 작은 순서대로 정렬
//    array.sort()
//
//    // 그룹 수
//    var count = 0
//
//    var i = 0
//    var flag = 0
//    // array를 다 돌면서 확인(제일 작은 수부터 확인 한다. -> 최대한 많이 나누기 위함)
//    while(i < array.size-1) {
//        // 인덱스[i] 부터 인덱스[array의 i번째 원소의 값]를 확인했을 때, 더 큰 숫자가 나오면 그룹으로 나누지 못한다.
//        for(it in 0 until array[i]){
//            if(i+it > array.size-1){
//                break
//            }
//            if(array[i+it]>array[i]) {
//                flag = 1
//                break
//            }
//        }
//
//        if(flag == 1){ // 더 큰 숫자가 나왓을 경우
//            i++ // 다음 인덱스로 넘어가자
//        }else{
//            count++ // 그룹 나눔
//            i += array[i] // 인덱스를 array[i] 값 만큼 이동시키자
//        }
//    }
//    println(count)
//}


//// 2
//fun main(){
//    val array = readln().toMutableList()
//
//    var result = array[0].digitToInt()
//
//    for(i in 1 until array.size){
//        var temp = array[i].digitToInt()
//        if((result == 0) || (temp == 0)){
//            result += temp
//        }else{
//            result *= temp
//        }
//    }
//
//    println(result)
//}

//// 3
//fun main(){
//    val array = readln()
//    var zeroCount = 0
//    var oneCount = 0
//    for(i in 0 until array.length-1){
//        if(array[i] != array[i+1]){ // 숫자가 바뀔 때 카운트하자, 바뀌기 전에 카운트를 먼저하면 매번 if문을 많이 확인해야한다.
//            if(array[i].digitToInt()==0){
//                zeroCount++
//            }else{
//                oneCount++
//            }
//        }
//    }
//
//    if(array.last().digitToInt()==0){
//        zeroCount++
//    }else{
//        oneCount++
//    }
//
//    if(zeroCount<oneCount){
//        println(zeroCount)
//    }else{
//        println(oneCount)
//    }
//}

//// 4 ****************
//fun main(){
//    val n = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }.toMutableList()
//    array.sort()
//    var i = 0
//    while (true){
//
//    }
//}

// 5
//fun main(){
//    val (a, b) = readln().split(" ").map { it.toInt() }
//    val array = readln().split(" ").map { it.toInt() }.take(a).toMutableList()
//
//    var temp = mutableListOf<Pair<Int,Int>>()
//
//    for(i in 0 until array.size){
//        for(j in i+1 until array.size){
//            if(array[i] != array[j]) temp.add(Pair(array.indexOf(i),array.indexOf(j)))
//        }
//    }
//
//    println(temp.size)
//}

//// 6
//fun main() {
//    val (n, k) = readln().split(" ").map { it.toInt() }
//    val array = readln().split(" ").map { it.toInt() }.take(n).toMutableList()
//
//    var time = 0
//    var i = 0
//
//    while (true) {
//        if (i / n > 0) {
//            i = 0
//        }
//
//        if (time == k) {
//            break
//        }
//
//        if (array[i] != 0) {
//            array[i]--
//            time++
//        }
//        i++
//    }
//    println(i + 1)
//}

//fun main(){
//    val a = readln().toInt()
//    val array = readln().split(" ").map{it.toInt()}.toMutableList()
//    array.sort()
//    println(array)
//
//    var i = 0
//    var result = 0
//    while (i < array.size){
//        if(i + array[i]-1 < array.size && array[i] == array[i + array[i]-1]){
//            i += array[i]
//            result++
//        }else{
//            i++
//        }
//    }
//
//    println(result)
//}

//fun main(){
//    val array = readln().toCharArray()
//    var result = array[0].digitToInt()
//    for(i in 1 until array.size ){
//        val b = array[i].digitToInt()
//
//        if(result==0 || b ==0 || result==1 || b==1){
//            result += b
//        }else{
//            result *= b
//        }
//    }
//    println(result)
//}

//fun main(){
//    val array = readln().toCharArray()
//    var char = array[0]
//    var count = 0
//    for(i in 1 until array.size){
//        if(char!=array[i]){
//            char = array[i]
//            count++
//        }
//    }
//
//    var result = 0
//    if(count%2==0){
//        result = (count/2)
//    }else{
//        result = (count+1)/2
//    }
//    println(result)
//}

//fun main(){
//    val size = readln().toInt()
//    val array = readln().split(" ").map{it.toInt()}.take(size).toMutableList()
//    array.sort()
//
//    val result = mutableSetOf<Int>()
//    result.add(array[0])
//    for(i in 1 until array.size){
//        val temp = mutableSetOf<Int>()
//        for(j in result){
//            temp.add(j+array[i])
//        }
//        result.addAll(temp)
//        println(result)
//    }
//
//    for(i in 1 ..result.size){
//        if(!result.contains(i)) {
//            println(i)
//            break
//        }
//    }
//}

//fun main() {
//    val (m, n) = readln().split(" ").map { it.toInt() }
//
//    // 배열 정보
//    val array = readln().split(" ").map { it.toInt() }.take(m).toMutableList()
//    // 배열의 조합들을 저장할 리스트
//    val result = mutableListOf<Pair<Int, Int>>()
//    // 조합을 임시로 저장할 공간
//    val combination = mutableListOf<Int>()
//    // 조합 메소드, 현재 조합 combination에 들어 있는 원소 개수, start : 배열에서 조합을 구할 때 원소의 시작점
//    fun find(count: Int, start: Int) {
//        if (count == 2) { // 현재 조합에 2개의 원소가 들어 있다면 -> 종료 조건
//            if (combination[0] != combination[1]) {
//                result.add(Pair(combination[0], combination[1]))
//            }
//        } else { // 2개보다 적을 때
//            for (i in start until array.size) { // 입력받은 시작점부터 하나씩 넣는다
//                // 조합에 원소 넣기
//                combination.add(array[i])
//                // 시작점은 자기자신을 제외한 오른쪽에 있는 배열만 검사하고 싶을 때 -> start가 없다면 그냥 자기 자신을 제외한 모든 점을 검색한다. -> 조합을 구성할 때 먼저 들어간 것과 나중에 들어간 것의 차이가 있을 경우를 말한다.
//                find(count + 1, i + 1)
//                // 넣었던 원소 빼기
//                combination.removeLast()
//            }
//        }
//    }
//
//    find(0, 0)
//
//    println(result.size)
//}

//fun main() {
//    val food_times = readln().split(" ").map { it.toInt() }.toIntArray()
//    val k = readln().toInt()
//
//    if(food_times.sum() <= k) println(-1)
//
//    val q = PriorityQueue<Pair<Int,Int>>(){a,b->a.second - b.second}
//
//    for(i in food_times.indices){
//        q.add(Pair(i+1,food_times[i]))
//    }
//
//    var sum_value = 0
//    var previous = 0
//    var length = food_times.size
//
//    while(sum_value + (q.peek().second-previous)*length <= k){
//        var now = q.poll().second
//        sum_value += (now - previous)*length
//        length -= 1
//        previous = now
//    }
//
//    var result = q.sortedBy { it.first }
//    println(result[(k-sum_value)%length].first)
//}

//fun main() {
//    val n = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }.toMutableList()
//
//    array.sort()
//
//    var i = 0
//    var count = 0
//    while (i < n) {
//        var temp = i + array[i] - 1
//        if(temp < n){
//            if(array[temp] > array[i]){
//                i++
//            }else{
//                i = temp + 1
//                count++
//            }
//        }else{
//            break
//        }
//    }
//
//    println(count)
//}

//fun main() {
//    val array = readln().toCharArray()
//
//    var result = 0
//    for (i in 0 until array.size) {
//        if (array[i] == '0' || array[i] == '1' || result == 0 || result == 1) {
//            result += array[i].digitToInt()
//        } else {
//            result *= array[i].digitToInt()
//        }
//    }
//    println(result)
//}

//fun main(){
//    val array = readln().toCharArray()
//
//    var now = array[0].digitToInt()
//    var count = 0
//    for(i in 1 until array.size){
//        val num = array[i].digitToInt()
//        if(now != num){
//            count++
//        }
//        now = num
//    }
//
//    var result = count/2 + count%2
//    println(result)
//}

//fun main(){
//    val n = readln().toInt()
//    val array = readln().split(" ").map { it.toInt() }
//
//    var result = mutableSetOf<Int>()
//    val list = mutableListOf<Int>()
//
//    fun find(start:Int, count:Int){
//        if(count == n){
//            return
//        }else{
//            for(i in start until n){
//                list.add(array[i])
//                println(list)
//                result.add(list.sum())
//                find(start+1, count+1)
//                list.removeLast()
//            }
//        }
//    }
//
//    find(0,0)
//
//    var temp = result.sorted()
//    println(temp)
//
//    var check = 1
//    for( i in temp){
//        if(i != check){
//            break
//        }else{
//            check++
//        }
//    }
//
//    println(check)
//}

//fun main(){
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val array = readln().split(" ").map { it.toInt() }
//
//    val result = mutableListOf<Int>()
//    var combi = 0
//    fun find(start:Int, count:Int){
//        if(count == 2){
//            if(result[0] != result[1] && array[result[0]] != array[result[1]]){
//                println(result)
//                combi++
//            }
//        }else{
//            for(i in start until n){
//                result.add(i)
//                find(i+1,count+1)
//                result.removeLast()
//            }
//        }
//    }
//
//    find(0,0)
//    println(combi)
//}

//fun main() {
//    val array = readln().split(" ").map { it.toInt() }.toIntArray()
//    val x = readln().toLong()
//
//    fun solution(food_times: IntArray, k: Long): Int {
//        if (food_times.sum() <= k) return -1
//
//        val q = PriorityQueue<Pair<Int, Int>>() { a, b -> a.second - b.second }
//        for(i in food_times.indices){
//            q.add(Pair(i, food_times[i]))
//        }
//        var kk = k
//        while(true){
//            val temp = q.first().second
//            if(temp * food_times.size <= kk){
//                kk -= q.poll()!!.second * food_times.size
//                q.forEach {
//                    if(it.second - temp>0){
//                        it.second - temp
//                    }else{
//                        q.remove(it)
//                    }
//                }
//            }else{
//                break
//            }
//        }
//
//        val temp1 = q.sortedBy { it.first }
//        return temp1[(kk % q.size).toInt()].first+1
//    }
//
//    println(solution(array, x))
//}

