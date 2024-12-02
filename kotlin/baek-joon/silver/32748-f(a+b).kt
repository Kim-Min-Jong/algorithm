import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.HashMap

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val map = hashMapOf<String, String>()
    val resMap = hashMapOf<String, String>()
    readLine().split(" ").mapIndexed { idx, str ->
        map[str] = idx.toString()
        resMap[idx.toString()] = str
    }
    val (a, b) = readLine().split(" ")

    val fa = StringBuilder()
    val fb = StringBuilder()
    val res = StringBuilder()

    a.forEach {
        fa.append(map[it.toString()])
    }
   b.forEach {
        fb.append(map[it.toString()])
    }

    val ab = (fa.toString().toInt() + fb.toString().toInt()).toString()
    ab.forEach {
        res.append(resMap[it.toString()])
    }

    bw.write(res.toString())

    closeBW()
    close()
}