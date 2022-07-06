import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()

    for(i in 0 until n){
        for(j in 0 until n){
            if(i <= j)
                bw.write("*")
            else bw.write(" ")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    this.close()
}