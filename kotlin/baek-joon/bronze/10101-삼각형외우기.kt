import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine().toInt()
    val b = readLine().toInt()
    val c = readLine().toInt()

    when {
        a == 60 && b== 60 && c == 60 -> bw.write("Equilateral")
        is180(a, b, c) && (a == b || b == c || a == c) -> bw.write("Isosceles")
        is180(a, b, c) && (a != b && b != c && a != c) -> bw.write("Scalene")
        !is180(a, b, c) -> bw.write("Error")
    }

    bw.flush()
    bw.close()
    close()
}
fun is180(a: Int, b: Int, c: Int) = a + b + c == 180