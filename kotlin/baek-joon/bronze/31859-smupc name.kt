import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    var (n, input)= readLine().split(" ")
    // 1
    val arr = input.toCharArray().toSet().map{ it.toString() }.toMutableList()

    // 2
    arr.add((input.length - arr.size + 4).toString())

    // 3
    arr.add(0, (1906 + n.toInt()).toString().reversed())

    // 4
    arr.reverse()

    // 5
    val res = "smupc_" + arr.joinToString("")

    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}// re..