import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, g) = readLine().split(" ").map { it.toInt() }
    val aList = readLine().split(" ")
    val bList = readLine().split(" ")
    val gList = readLine().split(" ")

    var aCnt = 0
    var bCnt = 0
    aList.forEach { str ->
        aCnt += gList.count { it == str }
    }
    bList.forEach { str ->
        bCnt += gList.count { it == str }
    }

    bw.write(if (aCnt > bCnt) "A" else if (bCnt > aCnt) "B" else "TIE")

    bw.flush()
    bw.close()
    close()
}