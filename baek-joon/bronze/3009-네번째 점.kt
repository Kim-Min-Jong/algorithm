import java.io.*
import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val a = readLine().split(" ").map{it.toInt()}
    val b = readLine().split(" ").map{it.toInt()}
    val c = readLine().split(" ").map{it.toInt()}

    var x = 0
    var y = 0

    x = if(a[0] == b[0]){
        c[0];
    } else if (a[0] == c[0]) {
        b[0];
    } else {
        a[0];
    }


    y = if (a[1] == b[1]) {
        c[1];
    } else if (a[1] == c[1]) {
        b[1];
    } else {
        a[1];
    }

    bw.write("$x $y ");
    bw.flush()
    bw.close()
    close()
}
