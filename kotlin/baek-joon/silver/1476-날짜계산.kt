import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (earth, sun, moon) = readLine().split(" ").map{ it.toInt() }
    val earthRange = 1 until 15
    val sunRange = 1 until 28
    val moonRange = 1 until 19
    var (startEarth, startSun, startMoon) = mutableListOf<Int>(1, 1, 1)

    var cnt = 1
    while (true) {
        if (startEarth == earth && startMoon == moon && startSun == sun) break

        startMoon = if (startMoon in moonRange) startMoon + 1 else 1
        startSun = if (startSun in sunRange) startSun + 1 else 1
        startEarth = if (startEarth in earthRange) startEarth + 1 else 1
        cnt++
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}