import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true){
        var list = readLine().split(" ").map{it.toInt()}.sorted()
        if(list[0] == 0 && list[1] == 0 && list[2] == 0) break
        if((list[0]*list[0])+(list[1]*list[1]) == list[2]*list[2])
            bw.write("right\n")
        else{
            bw.write("wrong\n")
        }
    }
    bw.flush()
    bw.close()
    close()
}