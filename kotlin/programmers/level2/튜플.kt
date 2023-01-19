class Solution {
    fun solution(s: String): IntArray {
        var answer = mutableListOf<Int>()
        val list = s.removePrefix("{{").removeSuffix("}}").split("},{").toList().sortedBy{it.length}
        for(i in list){
            val item = i.split(",")
            for(j in item) {
                val a = j.toInt()
                if(!answer.contains(a)){
                    answer.add(a)
                }
            }
        }
        return answer.toIntArray()
    }
}