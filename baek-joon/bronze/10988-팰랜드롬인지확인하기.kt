import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val n = readLine()
    val list = n.toString().chunked(1)
    if(list.size % 2 == 0){
        val front = list.slice(0 until (list.size/2))
        val back = list.slice((list.size/2) until list.size)
        val f = front.joinToString("").reversed()
        val b = back.joinToString("")
        if(f == b) bw.write("1\n")
        else bw.write("0\n")
    }else{
        val front = list.slice(0 until (list.size/2))
        val back = list.slice((list.size/2)+1 until list.size)
        val f = front.joinToString("").reversed()
        val b = back.joinToString("")
        if(f == b) bw.write("1\n")
        else bw.write("0\n")
    }

    bw.flush()
    bw.close()
    this.close()
}