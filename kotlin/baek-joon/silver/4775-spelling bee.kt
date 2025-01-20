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
    val set = hashSetOf<String>()

    repeat(n) {
        set.add(readLine())
    }

    val t = readLine().toInt()
    val notExist = mutableListOf<String>()
    for (i in 1..t) {
        while (true) {
            val data = readLine()
            if (data == "-1") break

            if (data !in set) {
                notExist.add(data)
            }
        }
        bw.write(if (notExist.isEmpty()) "Email $i is spelled correctly.\n" else "Email $i is not spelled correctly.\n")
        notExist.forEach {
            bw.write("$it\n")
        }
    }
    bw.write("End of Output")


    closeBW()
    close()
}