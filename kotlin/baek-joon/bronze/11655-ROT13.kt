import java.io.BufferedWriter
import java.io.OutputStreamWriter
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    bw.write(
        str.map {
            when (it) {
                in '0'..'9' -> it
                in 'A'..'Z' -> {
                    if (it + 13 > 'Z'){
                        it + 13 - 26
                    }
                    else it + 13
                }
                in 'a'..'z' -> {
                    if (it + 13 > 'z'){
                        it + 13 - 26
                    }
                    else it + 13
                }
                else -> it
            }
        }.joinToString("")
    )

    bw.flush()
    bw.close()
    close()
}