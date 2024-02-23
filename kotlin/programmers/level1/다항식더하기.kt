class Solution {
    fun solution(polynomial: String): String {
        var answer: String = ""
        val list = polynomial.split("+")
        val x = list.filter { it.contains('x') }.map{ 
            it.replace("x","").trim()
        }
        val notX = list.filterNot { it.contains('x') }.map{ it.trim().toInt() }
        var sum = 0
        x.forEach {
            if(it == "") sum += 1
            else sum += it.toInt()
        }
        answer = if (notX.sum() == 0) {
            if(sum == 1) "x"
            else if (sum == 0) "0"
            else "${sum}x"
        } else {
            if(sum == 1) "x + ${notX.sum()}"
            else if (sum == 0) "${notX.sum()}"
            else "${sum}x + ${notX.sum()}"
        }
        return answer 
    }
}