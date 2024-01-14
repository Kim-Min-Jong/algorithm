class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        var answer: Int = 2
        dic.forEach { string ->
            if(string.chunked(1).containsAll(spell.toList())) {
                answer = 1
                  return@forEach
            }
        }
        return answer
    }
}