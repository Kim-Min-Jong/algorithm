import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*


val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    val list = mutableListOf<Pair<Int,Int>>()
    lateinit var tmp: Pair<Int, Int>
    repeat(n){
        val m = readLine().toInt()
        var cnt = 1
        repeat(m){
            val (a, b) = readLine().split(" ").map{it.toInt()}
            list.add(Pair(a,b))
        }
        list.sortBy { it.first}
        tmp = list[0]
        for(i in 1 until m){
            if(list[i].second < tmp.second) {
                cnt += 1
                tmp = list[i]
            }
        }
        bw.write("$cnt\n")
        list.clear()
    }

    bw.flush()
    bw.close()
    close()
}