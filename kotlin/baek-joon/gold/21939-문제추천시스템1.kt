import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val set = TreeSet<Pair<Int, Int>> { o1, o2 ->
        when {
            // 난이도 순
            o1.second < o2.second -> -1
            // 난이도가 같은게 여러개라면
            o1.second == o2.second -> {
                when{
                    o1.first < o2.first -> -1
                    o1.first == o2.first -> 0
                    else -> 1
                }
            }
            else -> 1
        }
    }
    repeat(n) {
        StringTokenizer(readLine()).apply {
            set.add(nextToken().toInt() to nextToken().toInt())
        }
    }

    val m = readLine().toInt()
    repeat(m) {
        val st = StringTokenizer(readLine())
        when(st.nextToken()) {
            "add" -> {
                val number = st.nextToken().toInt()
                val difficulty = st.nextToken().toInt()
                set.add(number to difficulty)
            }
            "recommend" -> {
                when(st.nextToken().toInt()) {
                    -1 -> {
                        bw.write("${set.first().first}\n")
                    }
                    1 -> {
                        bw.write("${set.last().first}\n")
                    }
                }
            }
            "solved" -> {
                val number = st.nextToken().toInt()
                set.removeIf{ it.first == number }
            }
        }
    }

    bw.flush()
    bw.close()
    close()
} // 최적화 필요....