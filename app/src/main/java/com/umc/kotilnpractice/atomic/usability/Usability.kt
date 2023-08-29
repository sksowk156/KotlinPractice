package com.umc.kotilnpractice.atomic.usability

fun String.singleQuote() = "'$this'"
fun String.strangeQuote() = this.singleQuote().singleQuote()
fun String.abs() = this.toString() + this.length

class DefaultArg

class Sample {
    val sample = DefaultArg()
    fun test1(a: DefaultArg = sample) {
        println(a)
    }

    fun test2(a: DefaultArg = DefaultArg()) {
        println(a)
    }
}

fun func(n: Int) = n + 10
fun func() = func(0)

fun tempWhen(num: Double): String {
    return when {
        num < 18.5 -> "11"
        num < 25 -> "22"
        else -> "33"
    }
}

enum class Level {
    Overflow, High, Medium, Low, Empty
}

enum class Direction(val notation: String) { // 공통 멤버 프로퍼티
    North("N"), South("S"), East("E"), West("W");

    val opposite: Direction // 공통 멤버 변수
        get() = when (this) { // this는 Direction을 가리킨다.
            North -> South
            South -> North
            West -> East
            East -> West
        }
}

data class Sample2(
    val arg1: String,
    val arg2: Int,
)

fun main() {
//    val a = "abs"
//    println(a.singleQuote()) //'abs'
//    println(a.strangeQuote()) //''abs''
//    val sampe = Sample()
//    sampe.test1() // DefaultArg@3796751b
//    sampe.test1() // DefaultArg@3796751b
//    sampe.test2() // DefaultArg@67b64c45
//    sampe.test2() // DefaultArg@4411d970

//    println(func())
//    println(tempWhen(24.0))
//    println(Level.Overflow) // Overflow
//    println(Level.values().toList()) // [Overflow, High, Medium, Low, Empty]
//    println(Level.Overflow.ordinal) // 0
//    println(Level.Medium.ordinal) // 2

//    println(Direction.North.notation) // N
//    println(Direction.North.opposite) // South
//    println(Direction.North.ordinal) // 0
//    println(Direction.East.notation) // E
//    println(Direction.East.opposite) // West
//    println(Direction.North.hashCode()) // 25126016
//    println(Direction.North.hashCode()) // 25126016
//    println(DefaultArg().hashCode())
//    println(DefaultArg().hashCode())

//    val s1 = Sample2("Hi",29)
//    println(s1) // Sample2(arg1=Hi, arg2=29)
//    println(s1 == Sample2("Hi",29)) // true
//    println(s1.equals(Sample2("Hi",29))) // true
//    val s2 = s1.copy(
//        arg2 = 33
//    )
//    println(s2) // Sample2(arg1=Hi, arg2=33)
//    val (a, b) = Sample2("df", 2)
//    println(a) // df
//    println(b) // 2
//    val (_, c) = Sample2("!!!!", 3)
//    println(c) // 3
//    val s1: String? = "hello"
//    val s2: String? = null
//    println(s1?.length) // 5
//    println(s2?.length) // null
//    val temp = s2?.length ?: 5
//    println(temp) // 5
}