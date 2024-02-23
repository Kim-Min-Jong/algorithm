import java.util.*
import java.io.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()){
    val apartment = Array(15) { Array(15) { 0 } }
    for (i in 0..14){
        apartment[0][i] = i    // 0 층 초기화
        apartment[i][1] = 1    // i 층 1호 초기화
    }
    for(i in 1..14){
        for(j in 2..14){
            apartment[i][j] = apartment[i-1][j] + apartment[i][j-1]
        }
    }
    val testCase = readLine().toInt()
    for(i in 1..testCase){
        val k = readLine().toInt()
        val n = readLine().toInt()
        println(apartment[k][n])
    }
}