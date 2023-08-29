//package com.umc.kotilnpractice.atomic.`object`
//
//
////class Counter(var start: Int) {
////    fun increment() {
////        start += 1
////    }
////
////    override fun toString(): String {
////        return start.toString()
////    }
////}
//
//class CounterHolder(counter: Counter) {
//    private val ctr = counter
//    override fun toString(): String {
//        return "CounterHolder : " + ctr
//    }
//}
//
//fun main() {
////    val c = Counter(11)
////    val ch = CounterHolder(c)
////    println(ch) // 11
////    c.increment()
////    println(ch) // 12
////    val ch2 = CounterHolder(Counter(9))
////    println(ch2) // 9
////
////    val v1 = 11
////    val v2 = "On"
////
////    val list = mutableListOf<Int>()
////    list.add(1)
////    println(list.toString())
//
////    val mapKeyValue = mapOf("Pi" to 3.14, "e" to 2.718, "phi" to 1.61)
////
////    println(mapKeyValue["Pi"])
////    println(mapKeyValue.keys) // setOf("Pi", "e", "phi")
////    println(mapKeyValue.values) // [3.14, 2.718, 1.61]
////    for (inFor in mapKeyValue) {
////        println(inFor.key + " " + inFor.value)
////    }
////    for ((key, value) in mapKeyValue) {
////        println(key + " " + value)
////    }
////    val gs = GetterAndSetter()
////    gs.i = 2 // set()
////    println(gs.i) // get()
//    val counter = Counter()
//    repeat(10){
//        counter.inc()
//    }
//    println(counter.value)
//}
//
////fun sum(vararg numbers: Int): Int {
////    var total = 0
////    for (n in numbers) {
////        total += n
////    }
////    return total
////}
////
////class Default(private val maxCapacity: Int) {
////    private val hamster = mutableListOf<Int>()
////
//////    val capacity: Int
//////        get() = maxCapacity - hamster.size
////    fun capacity(): Int = maxCapacity - hamster.size
////
//////    val full: Boolean
//////        get() = hamster.size == maxCapacity
////    fun full(): Boolean = hamster.size == maxCapacity
////}
//
////class GetterAndSetter{
////    var i :Int = 0
////    get() = field
////    set(value){
////        field = value
////    }
////}
//
//class Counter{
//    var value :Int = 0
//    private set
//    fun inc() = value++
//}