import java.io.*

fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val (n,m) = readLine().split(" ").map{it.toInt()}
        val set = mutableSetOf<String>()
        var cnt = 0
        repeat(n){
            set.add(readLine())
        }
        for(i in 0 until m){
            if(set.contains(readLine()))
                cnt++
        }
        bw.write("$cnt")
        bw.flush()
        bw.close()
        this.close()
}