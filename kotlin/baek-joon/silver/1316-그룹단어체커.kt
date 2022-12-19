import java.util.*
fun main() = with(Scanner(System.`in`)){
        val n = nextLine()
        var cnt = 0
        repeat(n.toInt()){
            val set = mutableSetOf<Char>()
            val str = nextLine()
            var front = ' '
            var same = false
            for (c in str) {
                if (front != c.toChar()) {
                    if (!set.add(c)) {
                        same = true
                        break
                    }
                }
                front = c
            }
            if (!same) cnt++
        }
        println(cnt)
}
