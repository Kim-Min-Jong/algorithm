import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
        val n = readLine().toInt()

        for(i in 0..n-1){
                for(j in 0..n-1){
                        recur(j,i,n)
                }
                bw.write("\n")
        }
        bw.flush()
        bw.close()
}
fun recur(a:Int, b:Int, n:Int){
        if((a/n)%3==1 && (b/n)%3==1){
                bw.write(" ")
        }else if (n / 3 == 0){
                bw.write("*")
        }else{
                recur(a,b,n/3)
        }
}
