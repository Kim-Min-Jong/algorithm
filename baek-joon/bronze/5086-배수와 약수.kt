import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    while(true) {
        val (n,m) = readLine().split(" ").map { it.toInt() }
        if(n==0 && m==0) break
        if(n>m){
            if(n%m==0) bw.write("multiple\n")
            else bw.write("neither\n")
        }else{
            if(m%n==0) bw.write("factor\n")
            else bw.write("neither\n")
        }
    }
    bw.flush()
    bw.close()
    close()
}