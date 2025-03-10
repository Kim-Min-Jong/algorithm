import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun closeBW() {
    bw.flush()
    bw.close()
}

fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine()
    val b = readLine()

    if (a == "null") {
        bw.write("NullPointerException\n")
        bw.write("NullPointerException")
    } else {
        if (a == b) {
            bw.write("true\n")
        } else {
            bw.write("false\n")
        }

        if (b == "null") {
            bw.write("false")
        } else {
            if (a.lowercase() == b.lowercase()) {
                bw.write("true")
            } else {
                bw.write("false")
            }
        }
    }

    closeBW()
    close()
}