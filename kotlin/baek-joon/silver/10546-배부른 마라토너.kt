import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val participant = mutableListOf<String>()
    val completion = mutableListOf<String>()
    repeat(n) {
        participant.add(readLine())
    }
    repeat(n-1) {
        completion.add(readLine())
    }
    participant.sort()
    completion.sort()

    for (i in completion.indices) {
        if(participant[i] != completion[i]) {
            println(participant[i])
            return@with
        }
    }

    bw.write(participant[participant.size-1])

    bw.flush()
    bw.close()
    close()
}