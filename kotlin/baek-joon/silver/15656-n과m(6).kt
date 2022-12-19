import java.io.*
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val (n,m) = readLine().split(" ").map{it.toInt()}
    val list = readLine().split(" ").map{it.toInt()}
    var tmpList = MutableList(m){i->0}
    overLabPermutation(m,tmpList,0, list.sorted())
    bw.flush()
    bw.close()
    close()
}
fun <T> overLabPermutation(r:Int, temp: MutableList<T>, current:Int, arr:List<T>){
    val tmp = temp.toMutableList()
    var cnt = 0
    if(r == current){
        for(i in tmp.indices){
            bw.write("${tmp[i]} ")
            cnt++
            if(cnt % r == 0) {
                    bw.write("\n")
            }
        }
    } else{
        for(i in arr.indices){
            tmp[current] = arr[i]
            overLabPermutation(r,tmp,current+1, arr)
        }
    }
}