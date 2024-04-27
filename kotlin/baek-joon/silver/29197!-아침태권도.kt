import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

data class EndPoint(val x: Int, val y: Int, val axis: String)

fun main() = with(System.`in`.bufferedReader()) {
 val n = readLine().toInt()
    val list = mutableListOf<EndPoint>()

    repeat(n) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        val where = if (x > 0 && y > 0) "1"
            else if (x < 0 && y > 0) "2"
            else if (x < 0 && y < 0) "3"
            else if (x > 0 && y < 0) "4"
            else "Nothing"
        val axis = if (x == 0 && y > 0) "y"
            else if (x == 0 && y < 0) "-y"
            else if (x > 0 && y == 0) "x"
            else if (x < 0 && y == 0) "-x"
            else "Nothing"

        val whereOrAxis = if (where == "Nothing") axis else where

        list.add(EndPoint(x, y, whereOrAxis))
    }

    val inclinationList = list.map { ((0.0 - it.y) / (0.0 - it.x)) to it.axis }
    bw.write(inclinationList.toSet().size)

    bw.flush()
    bw.close()
    close()
} // 부동 소수점 문제?? 조금 더해보기
