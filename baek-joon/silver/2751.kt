import java.util.*
import java.io.*

fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val n = readLine().toInt()
        val list = mutableListOf<Int>()
        repeat(n){
                list.add(readLine().toInt())
        }
        list.sort()
        for(i in list)
                bw.write(i.toString() + "\n")
        bw.flush()
        bw.close()
}
