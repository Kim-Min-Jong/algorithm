import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val set = mutableSetOf<String>()
    var cnt = 0
    repeat(n) {
        val person = readLine()
        if(person == "ENTER") set.clear()
        else {
            if((person in set).not()) {
                cnt++
                set.add(person)
            }
        }

    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}