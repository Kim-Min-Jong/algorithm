import java.text.SimpleDateFormat
import java.util.*
class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer = mutableListOf<Int>()
        val term = terms.map{it.split(" ")}
        val privacy = privacies.map{it.split(" ")}
        val now = dateToInt(today)
        privacy.forEachIndexed { idx, info ->
            val month = term.filter { it[0] == info[1] }[0][1].toInt() * 28
            val day = dateToInt(info[0])
            if(now >= day + month)
                answer.add(idx+1)
        }
        return answer.toIntArray()
    }
    fun dateToInt(date: String):Int {
        val list = date.split(".")
        var sum = 0
        val y = list[0]
        val m = list[1]
        val d = list[2]
        sum += (y.toInt() * 12 * 28) + ((m.toInt() - 1) * 28) + d.toInt()
        return sum
    }
}