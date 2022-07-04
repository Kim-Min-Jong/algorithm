import java.io.*
import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (x,y,w,h) = readLine().split(" ").map{it.toInt()}
    if(x>w && y>h){
        bw.write("${Math.sqrt((((x-w)*(x-w))+((y-h)*(y-h))).toDouble())}")
    } else if(x<=w && y>h){
        bw.write("${y-h}")
    } else if(x>w && y<=h){
        bw.write("${x-w}")
    } else if(x<w && y<h){
        bw.write("${min(min(x,y),min(w-x,h-y))}")
    }
    bw.flush()
    bw.close()
    close()
}