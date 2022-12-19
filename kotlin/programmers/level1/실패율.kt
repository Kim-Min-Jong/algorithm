class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = stages.toMutableList()
        var result = mutableListOf<Double>()
        var new = mutableListOf<Double>()
        var map = mutableMapOf<Int,Double>()
        var falseRate = answer.sorted().groupBy{it}.toMutableMap()
        var size = falseRate.map{it.value.size}
        var currentSize = 0

        for(i in 1..N){
            result.add(falseRate.get(i)?.size?.toDouble() ?: 0.0)
        }
        if(result.size == N+1) result.removeAt(N)
        for(i in 0..result.size-1){
            var size = (answer.size - currentSize).toDouble()
            if(size == 0.0) new.add(0.0)
            else new.add(result[i] / size)
            currentSize += result[i].toInt()
        }
        for(i in 0..new.size-1){
            map.put(i+1, new[i])
        }
        map = map.toList().sortedByDescending { it.second }.toMap() as MutableMap
        return map.keys.toIntArray()
    }
}