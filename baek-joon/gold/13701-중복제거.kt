import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){

    val bs = BitSet()
    val st = StringTokenizer(readLine())
    for(i in 0 until st.countTokens()){
        val tmp = Integer.parseInt(st.nextToken())
        if(!bs.get(tmp)){
            bs.set(tmp)
            bw.write("$tmp ")
        }
    }

    bw.flush()
    bw.close()
    close()
}