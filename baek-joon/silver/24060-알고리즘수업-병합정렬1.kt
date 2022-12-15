import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.system.exitProcess

val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var tmpList: MutableList<Int>
lateinit var list: MutableList<Int>
var a = 0
var cnt = 0
fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map{it.toInt()}
    list = readLine().split(" ").map{it.toInt()}.toMutableList()
    tmpList = MutableList<Int>(n) {0}
    a = k
    mergeSort(0, n - 1)
    bw.write("-1")

    bw.flush()
    bw.close()
    close()
}
fun mergeSort(p: Int, r: Int) {
    var q = 0
    if(p < r) {
        q = (p+r) / 2
        mergeSort(p, q)
        mergeSort(q+1,r)
        merge(p, q, r)
    }
}
fun merge(p: Int, q: Int, r:Int) {
    var i = p
    var j = q + 1
    var t = 0
    while(i <= q && j <= r) {
        if(list[i] <= list[j]) {
            tmpList[t++] = list[i++]
        } else {
            tmpList[t++] = list[j++]
        }
    }
    while(i <= q) {
        tmpList[t++] = list[i++]
    }
    while(j <= r) {
        tmpList[t++] = list[j++]
    }
    i = p
    t = 0
    while(i <= r){
        list[i++] = tmpList[t++]
        cnt++
        if(cnt == a) {
            println("${list[i-1]}")
            exitProcess(0)
        }
    }
}