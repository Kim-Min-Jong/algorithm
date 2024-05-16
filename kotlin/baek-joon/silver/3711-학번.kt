import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    repeat(n) {
        val g = readLine().toInt()
        val list = mutableListOf<Int>()
        var op = 0
        var res = 0
        repeat(g) {
            list.add(readLine().toInt())
        }
        while (true) {
            op++
            var isSame = true
            val modList = mutableListOf<Int>()
            loop@for (i in 0 until g) {
                if (list[i] % op in modList) {
                    isSame = false
                    break@loop
                }
                modList.add(list[i] % op)
            }
            if (isSame) {
                bw.write("$op\n")
                break
            }
        }
    }

    bw.flush()
    bw.close()
    close()
}