import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    while(true){
        val n = readLine().toInt()
        if(n == 0) break
        val list = n.toString().chunked(1)
        if(list.size % 2 == 0){
            val front = list.slice(0 until (list.size/2))
            val back = list.slice((list.size/2) until list.size)
            val f = front.joinToString("").reversed()
            val b = back.joinToString("")
            if(f == b) bw.write("yes\n")
            else bw.write("no\n")
        }else{
            val front = list.slice(0 until (list.size/2))
            val back = list.slice((list.size/2)+1 until list.size)
            val f = front.joinToString("").reversed()
            val b = back.joinToString("")
            if(f == b) bw.write("yes\n")
            else bw.write("no\n")
        }
    }

    bw.flush()
    bw.close()
    this.close()
}