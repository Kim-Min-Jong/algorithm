import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = listOf("keys", "phone", "wallet")
    val res = mutableListOf<String>()
    repeat(n) {
        val str = readLine()
        if (str in list) {
            res.add(str)
        }
    }

    val f = list - res

    if (f.isEmpty()) {
        bw.write("ready")
    } else {
        f.forEach {
            bw.write("$it\n")
        }
    }
    closeBW()
    close()
}