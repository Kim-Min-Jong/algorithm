import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Exception
import java.lang.StringBuilder
import java.math.BigInteger
import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayDeque
import kotlin.collections.HashMap
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
val list = mutableListOf<Int>()
lateinit var result: Array<String>
lateinit var map: HashMap<Long, Long>
const val INF = 10000000
data class MutablePair<T1, T2>(var first: T1, var second: T2)
fun main() = with(System.`in`.bufferedReader()) {
val t = readLine().toInt()
    for(i in 0 until t) {
        val n = readLine().toInt()
        // TreeMap은 이진트리를 기반으로 한 Map 컬렉션
        // TreeMap에 객체를 저장하면 자동으로 정렬되는데, 키는 저장과 동시에 자동 오름차순으로 정렬
        // 우선 순위 큐 처럼 정렬을 하고, 검색, 삭제에 있어서 시간복잡도 향상을 노려볼 수 있음
        val treeMap = TreeMap<Int, Int>()
        for(j in 0 until n) {
            val (command, num) = readLine().split(" ")
            val intNum = num.toInt()
            when(command) {
                "I" -> {
                    treeMap[intNum] = treeMap.getOrDefault(intNum , 0) + 1
                }
                "D" -> {
                    var tmp = 0
                    if(treeMap.size == 0) continue
                    when(intNum) {
                        1 -> {
                            tmp = treeMap.lastKey()
                        }
                        -1 -> {
                            tmp = treeMap.firstKey()
                        }
                    }
                    if (treeMap.put(tmp, treeMap[tmp]?.minus(1) ?: 0) == 1) {
                        treeMap.remove(tmp)
                    }
                }
            }
        }
        if(treeMap.size == 0){
            bw.write("EMPTY\n")
        } else {
            bw.write("${treeMap.lastKey()} ${treeMap.firstKey()}\n")
        }
    }

    bw.flush()
    bw.close()
    close()
} // TreeMap으로 변경 후 성공.. (참고)