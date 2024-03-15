import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (body1, tail1) = readLine().split(" ")
    val (body2, tail2) = readLine().split(" ")

    val list = mutableListOf<String>()

    if (body1 !in list) list.add(body1)
    if (tail1 !in list) list.add(tail1)
    if (body2 !in list) list.add(body2)
    if (tail2 !in list) list.add(tail2)

    list.sort()
    for (i in list.indices) {
        for (j in list.indices) {
            bw.write("${list[i]} ${list[j]}\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}