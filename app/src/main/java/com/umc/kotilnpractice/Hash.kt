package com.umc.kotilnpractice

import java.util.HashMap

fun main(){
    val temp = Solution()
    println(temp.solution(arrayOf("mislav", "stanko", "mislav", "ana"), arrayOf("stanko", "ana", "mislav")))
}

internal class Solution {
    fun solution(participant: Array<String?>, completion: Array<String?>): String {
        var answer = ""
        val temp2: HashMap<String?, Int> = HashMap()
        for (i in participant.indices) {
            // 참가자 이름의 키가 존재하는지 확인
            temp2.set(participant[i], temp2.getOrDefault(participant[i], 0)+1)
        }

        for (i in completion) {
            val result = temp2[i]!! // 완주자 이름으로 총 참가자 인원 수(value) 확인
            if (result - 1 == 0) { //  참가자 인원 수에서 완주자 1명을 뺐을 때 0명이면
                temp2.remove(i) // hashmap에서 제거
            } else { // 0명이 아니면
                temp2.replace(i, result - 1) // 1명 뺀 인원 수로 다시 저장
            }
        }

        // 'completion의 길이는 participant의 길이보다 1 작습니다.' 라는 조건이 있으므로 무조건 한 명만 남기 때문에 인덱스 0으로 미완주자 반환
        answer = temp2.keys.first().toString()
        return answer
    }
}