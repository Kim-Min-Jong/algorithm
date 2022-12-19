import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = mutableListOf<String>()
    repeat(n) {
        list.add(readLine())
    }

    list.sortWith(Comparator { t1, t2 ->
        if (t1.length != t2.length)
            t1.length - t2.length
        else {
            val o1 = chSum(t1)
            val o2 = chSum(t2)
            if (o1 != o2) {
                o1.compareTo(o2)
            } else {
                t1.compareTo(t2)
            }
        }
    })

    list.forEach {
        bw.write("$it\n")
    }

    bw.flush()
    bw.close()
    close()
}

fun chSum(str: String): Int {
    var result = 0
    val list = str.split("")
    list.forEach {
        try {
            result += it.toInt()
        } catch (e: Exception) {
            result += 0
        }
    }
    return result
}