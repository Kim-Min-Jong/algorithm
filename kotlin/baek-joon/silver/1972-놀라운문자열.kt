import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val str = readLine()
        if (str == "*") break
        var isSurprising = true

        loop@for (i in 0 until str.length - 1) {
            val set = mutableSetOf<String>()
            for (j in 0 until str.length - i - 1) {
                val tmp = "${str[j]}${str[i+j+1]}"
                if (tmp in set) {
                    isSurprising = false
                    break@loop
                }
                set.add(tmp)
            }
        }

        bw.write(if (isSurprising) "$str is surprising.\n" else "$str is NOT surprising.\n")
    }

    bw.flush()
    bw.close()
    close()
}