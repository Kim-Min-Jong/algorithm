import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val (h, v) = readLine().split(" ").map{it.toDouble()}

    // 대각선
    val sqrt = sqrt(h * h + v * v)
    // 각 이등분에 따른 변의 길이
    val x = v * (h / (h + sqrt))
    val y = v * (sqrt / (h + sqrt))

    // 평행사변형 밑변
    val k = sqrt(h * h + x * x)
    // 직사각형 밑변
    val resX = k / 2

    // 직사각형에서 삼각형 2개 뺸거 == 평사 넓이
    val resY = (h * v - h * x) / k

    bw.write(String.format("%.2f", resX)+" "+String.format("%.2f", resY))

    bw.flush()
    bw.close()
    close()
}