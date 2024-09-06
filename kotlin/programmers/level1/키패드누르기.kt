import kotlin.math.abs
class Solution {

    var left = intArrayOf(1, 4, 7, 10)
    var right = intArrayOf(3, 6, 9, 12)
    var now = intArrayOf(10, 12) 
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        numbers.forEach {
            answer +=
                when (it) {
                    in left -> {
                        checkLeft(it)
                    }
                    in right -> {
                        checkRight(it)
                    }
                    else -> {
                        checkHand(hand, it)
                    }
                }
        }

        return answer
    }

    fun checkLeft(n: Int): String {
        now[0] = n
        return "L"
    }

    fun checkRight(n: Int): String {
        now[1] = n
        return "R"
    }

    fun checkHand(hand: String, num: Int): String {

        var n = if (num == 0) 11 else num

        var left = abs(((now[0] - n) / 3) + ((now[0] - n) % 3))
        var right = abs(((now[1] - n) / 3) + ((now[1] - n) % 3))

        return if (left > right) {
            checkRight(n)
        } else if (left < right) {
            checkLeft(n)
        } else {
            if (hand == "left") checkLeft(n) else checkRight(n)
        }
    }
}