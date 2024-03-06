import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        val a = readLine()
        val aList = readLine().split(" ").map { it.toInt() }
        val b = readLine()
        val bList = readLine().split(" ").map { it.toInt() }
        val c = readLine()
        val cList = readLine().split(" ").map { it.toInt() }

        var sum = 0
        var result = 0
        val set = mutableSetOf<Int>()

        for (i in aList) {
            for (j in bList) {
                for (k in cList) {
                    sum = i + j + k
                    if (isFiveOrEight(sum)) {
                        set.add(sum)
                    }
                }
            }
        }
        bw.write("${set.size}\n")
    }

    bw.flush()
    bw.close()
    close()
}
fun isFiveOrEight(num: Int): Boolean {
    var tmp = num
    while (tmp != 0) {
        if (tmp % 10 != 5 && tmp % 10 != 8)
            return false;
        tmp /= 10;
    }
    return true;
}