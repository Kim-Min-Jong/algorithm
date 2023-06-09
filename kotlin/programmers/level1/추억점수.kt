import java.util.*
class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): Array<Int> {
        var answer = mutableListOf<Int>()
        val map = mutableMapOf<String, Int>()
        for(i in name.indices) {
            map.put(name[i], yearning[i])
        }

        photo.forEach { group ->
            var score = 0
            group.forEach { name -> 
                score += map[name] ?: 0
            }
            answer.add(score)
        }
        
        return answer.toTypedArray()
    }
}