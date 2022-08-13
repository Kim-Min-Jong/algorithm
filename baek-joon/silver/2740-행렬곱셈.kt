import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs
import kotlin.math.floor
import kotlin.math.sqrt

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
    val arr1 = mutableListOf<IntArray>()
    val arr2 = mutableListOf<IntArray>()
    val (n, m) = readLine().split(" ").map{it.toInt()}

    repeat(n){
        val list = readLine().split(" ").map{it.toInt()}.toIntArray()
        arr1.add(list)
    }
    val (a, b) = readLine().split(" ").map{it.toInt()}
    repeat(a){
        val list = readLine().split(" ").map{it.toInt()}.toIntArray()
        arr2.add(list)
    }
    val answer = MutableList<MutableList<Int>>(arr1.size) {
        MutableList<Int>(arr2[0].size
        ) { _ -> 0 }
    }
    var sum = 0
    val a1_col = arr1[0].size
    val a2_col = arr2[0].size
    val a1_row = arr1.size
    val a2_row = arr2.size
    for (i in 0 until a1_row) {
        for (j in 0 until a2_col) {
            sum = 0;
            for (k in 0 until a1_col) {
                sum += arr1[i][k] * arr2[k][j];
            }
            answer[i][j] = sum;
        }
    }

    answer.forEach { it ->
        it.forEach {
            bw.write("$it ")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
    close()
}