package com.umc.kotilnpractice

fun main(){
    // 재귀적 구현
    val array = Array<Int>(100){0}

    fun fibo(x : Int):Int{
        if(x==1 || x==2){
            return 1
        }

        if(array[x] != 0){
            return array[x]
        }

        array[x] = fibo(x-1) + fibo(x-2)
        return array[x]
    }

    println(fibo(99))
}