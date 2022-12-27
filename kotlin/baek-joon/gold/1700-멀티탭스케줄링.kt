import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map{ it.toInt() }
    val list = readLine().split(" ").map{ it.toInt() }
    val plugs = mutableListOf<Int>()
    var cnt = 0
    for(i in list.indices) {
        if(list[i] in plugs) continue
        if(plugs.size < n)
            plugs.add(list[i])
        else {
            var valid = 0
            var idx = -999
            cnt += 1
            val tmp = list.subList(i, list.size)

            for(j in plugs) {
                if(j in tmp) {
                    val x = tmp.indexOf(j)
                    if(idx < x) {
                        idx = x
                        valid = j
                    }
                } else { 
                    valid = j
                    break
                }
            }
            plugs[plugs.indexOf(valid)] = list[i]
        }
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
    close()
}