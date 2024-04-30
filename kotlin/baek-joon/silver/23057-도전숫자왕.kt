import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }

    val listSum = list.sum()
    val set = mutableSetOf<Int>()

    fun dfs(index: Int, sum: Int) {
        if (sum != 0) {
            set.add(sum)
        }

        for (i in index until n) {
            dfs(i+1, sum + list[i])
        }
    }

    dfs(0,0)
    bw.write("${listSum - set.size}")

    bw.flush()
    bw.close()
    close()
} // 참고..