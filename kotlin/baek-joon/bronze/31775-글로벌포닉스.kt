import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val list = mutableListOf<String>()
    list.apply {
        add(readLine())
        add(readLine())
        add(readLine())
    }

    val isStartL = list.find { it.startsWith("l") }?.isNotEmpty() ?: false
    val isStartK = list.find { it.startsWith("k") }?.isNotEmpty() ?: false
    val isStartP = list.find { it.startsWith("p") }?.isNotEmpty() ?: false

    bw.write(if (isStartL && isStartK && isStartP) "GLOBAL" else "PONIX")

    bw.flush()
    bw.close()
    close()
}