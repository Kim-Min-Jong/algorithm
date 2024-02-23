import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }.toMutableList().apply {
        add(0, 0)
        add(0)
    }
    val topBottomSurface = (list.size.toLong() - 2) * 2
    val frontBackSurface = list.sum().toLong() * 2
    var sideSurface = 0L
    for (i in 1 until list.size - 1) {
        val left = if(list[i] - list[i-1] <= 0) 0L else (list[i] - list[i-1]).toLong()
        val right = if(list[i] - list[i+1] <= 0) 0L else (list[i] - list[i+1]).toLong()
        sideSurface += left + right
    }

    bw.write("${topBottomSurface + frontBackSurface + sideSurface}")

    bw.flush()
    bw.close()
    close()
}