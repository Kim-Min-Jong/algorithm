class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val map = hashMapOf<String, Int>()
        clothes.forEach {
            val name = it[0]
            val kind = it[1]
            map.put(kind, map.getOrDefault(kind, 0) + 1)
        }
        for(i in map.keys){
            answer *= (map[i]?.plus(1)!!)
        }
        return answer - 1
    }
}