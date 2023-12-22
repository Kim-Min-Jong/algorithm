import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val list = readLine().chunked(3)
    for (i in 0 until list.size) {
        for(j in i + 1 until list.size) {
            if(list[i] == list[j]) {
                bw.write("GRESKA")
                bw.flush()
                bw.close()
                close()
                return@with
            }
        }
    }
    val res = list.map { it[0] to (it[1] + it[2].toString()).toInt()}
    val arr = intArrayOf(13, 13, 13, 13)
    res.forEach {
        when(it.first) {
            'P' -> --arr[0]
            'K' -> --arr[1]
            'H' -> --arr[2]
            'T' -> --arr[3]
        }
    }
    bw.write(arr.joinToString(" "))

    bw.flush()
    bw.close()
    close()
}