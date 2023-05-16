import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import javax.lang.model.type.ArrayType
import kotlin.math.abs
import kotlin.math.log10
import kotlin.math.min
import kotlin.math.sqrt
import kotlin.system.exitProcess


val bw = BufferedWriter(OutputStreamWriter(System.out))
lateinit var tmpList: MutableList<Int>
lateinit var list: MutableList<Int>
var a = 0
var cnt = 0
var flag = -1 // 0 -> b 1 -> w
var overLabCount = 0
lateinit var arr: List<Int>
const val INF = 10000000
lateinit var route: IntArray
lateinit var graph_4963: Array<IntArray>
lateinit var graph_2667: Array<IntArray>
lateinit var graph_2468: Array<IntArray>
lateinit var graph: Array<IntArray>
lateinit var charGraph: Array<CharArray>
lateinit var graph_10026: Array<CharArray>
lateinit var visited: Array<BooleanArray>
lateinit var distance: IntArray
val dx = intArrayOf(1, -1, 0, 0)
val dy = intArrayOf(0, 0, -1, 1)
lateinit var resultSet: MutableSet<String>
lateinit var tmp: MutableList<Char>
var sheep = 0
var wolf = 0
val dp = Array<Long>(10000000) {0L}
var pivot: Char = ' '
fun main() = with(System.`in`.bufferedReader()) {
//    //27087
//    val n = readLine().toInt()
//    repeat(n) {
//        val (a, b, c, p) = readLine().split(" ").map{it.toInt()}
//        var res = 0
//
//        for(i in listOf(a,b,c)) {
//            if(i % p == 0) res++
//        }
//        val answer = if(res >= 1) 1 else 0
//        bw.write("$answer\n")
//
//    }
    // (100+1+ | 01)+
//    val regex = "^(100+1+|01)+$".toRegex()
//    val regex = "^[A-F]?A+F+C+[A-F]?$".toRegex()
//    val regex = Regex(StringBuilder().append("^").append(prefix).append("[a-z]*").append(suffix).append("$").toString())
    val str = readLine()
    val stack = Stack<Char>()
    var chk = false

    for(i in str.indices) {
        // 새로운 꺽쇠시작 - 이전거 다 출력
        if(str[i] == '<') {
            chk = true
            printAll(stack)
            bw.write(str[i].toString())
        } else if(str[i] == '>') { // 닫는 꺽쇠 - 다시 열기 위해 chk 조정
            // 꺽쇠 안쪽 그대로 출력
            chk = false
            bw.write(str[i].toString())
        } else if(chk) { // 꺽쇠 사이 - 그대로 출력
            bw.write(str[i].toString())
        } else if(!chk) { // 꺽쇠 바깥
            if(str[i] == ' ') {
                printAll(stack)
                bw.write(str[i].toString())
            } else {
                stack.push(str[i])
            }
        }
        printAll(stack)
    }


    bw.flush()
    bw.close()
    close()
}
fun printAll(stack: Stack<Char>) {
    while(stack.isNotEmpty()) {
        bw.write(stack.pop().toString())
    }
}