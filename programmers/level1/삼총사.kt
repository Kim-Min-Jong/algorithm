class Solution {
    fun solution(number: IntArray): Int {
    val answer = mutableListOf<List<Int>>()
    var cnt = 0
    combination(answer, number.toList(), Array(number.size){false},0,3)
    answer.forEach{
        if(it.sum() == 0)
            cnt++
    }
    return cnt
    }
    fun <T> combination(answer: MutableList<List<T>>, el: List<T>, ck: Array<Boolean>, start: Int, target: Int) {
    if(target == 0) {
        answer.addAll( listOf(el.filterIndexed { index, t -> ck[index] }) )
    } else {
        for(i in start until el.size) {
            ck[i] = true
            combination(answer, el, ck, i + 1, target - 1)
            ck[i] = false
        }
    }
}
}
