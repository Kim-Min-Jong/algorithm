import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val list = readLine().toMutableList()
    var res = 0
    list.add(0, 'N')
    for(i in 1 until list.size) {
        when(list[i]) {
            'N' -> continue
            'Y' -> {
                for(j in i until list.size) {
                    if(j % i == 0) {
                        when (list[j]) {
                            'Y' -> list[j] = 'N'
                            'N' -> list[j] = 'Y'
                        }
                    }
                }
                res++
            }
        }
    }

    bw.write("$res")

    bw.flush()
    bw.close()
    close()
}