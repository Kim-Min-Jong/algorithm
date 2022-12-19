import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
var cnt1 = 0
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    repeat(n){
        cnt1 = 0
        val res = _25501(readLine())
        bw.write("$res $cnt1\n")
    }
    bw.flush()
    bw.close()
    close()
}

fun recur(s: String, l:Int, r:Int):Int{
    cnt1 += 1
    return if(l >= r) 1
    else if(s[l] != s[r]) 0
    else recur(s, l+1, r-1)
}
fun _25501(s:String):Int{
    return recur(s, 0, s.length - 1)
}
