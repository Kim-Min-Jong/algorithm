import java.io.BufferedWriter
import java.io.OutputStreamWriter

data class Semina(val name: String, val cnt: Int)
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val list = mutableListOf<Semina>()
    repeat(7) {
        val (name, cnt) = readLine().split(" ")
        list.add(Semina(name, cnt.toInt()))
    }

    list.maxByOrNull { it.cnt }!!.run {
        bw.write("$name")
    }

    bw.flush()
    bw.close()
    close()
}