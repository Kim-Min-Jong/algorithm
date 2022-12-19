import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
        val n = readLine().toInt()
    repeat(n){
        val map = hashMapOf<String, Int>()
        val m = readLine().toInt()
        repeat(m){
            val (name, kind) = readLine().split(" ")
            map.put(kind, map.getOrDefault(kind, 0) + 1)
        }
        var cnt = 1
        for(i in map.keys){
            cnt *= (map[i]?.plus(1)!!)
        }
        bw.write("${cnt-1}\n")
    }

    bw.flush()
    bw.close()
    close()
}