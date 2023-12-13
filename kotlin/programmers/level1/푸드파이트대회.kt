class Solution {
    fun solution(food: IntArray) = 
        food.mapIndexed {idx, it -> idx to it / 2}.subList(1, food.size).run{
            var answer = ""
            forEach{ pair ->
                for(i in 0 until pair.second) {
                    answer += pair.first.toString()
                }
            }
            answer + "0" + answer.reversed()
        }
}