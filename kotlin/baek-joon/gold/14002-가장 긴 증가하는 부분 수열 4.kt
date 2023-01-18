import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val l = readLine().split(" ").map{it.toInt()}
    val dp = IntArray(n){1}
    val list = mutableListOf<Int>()
    for(i in 1 until n){
        for(j in 0 until i){
            if(l[j] < l[i]) {
                dp[i] = Math.max(dp[i], dp[j] + 1)
            }
        }
    }
    var max = dp.maxOrNull()
    for(i in n-1 downTo 0) {
        if(dp[i] == max) {
            list.add(l[i])
            --max
        }
    }
    bw.write("${dp.maxOrNull()}\n")
    list.reversed().forEach {
        bw.write("$it ")
    }
    /*
    var min = dp.minOrNull()
    for(i in 0 until n) {
        if(dp[i] == min) {
            list.add(l[i])
            ++min
        }
    }
    bw.write("${dp.maxOrNull()}\n")
    list.forEach {
        bw.write("$it ")
    }
    */

    bw.flush()
    bw.close()
    close()
} // LIS 응용- LIS 길이 구하고 그 내용 출력
// 내용 출력할 때, 작은 값부터 dp안에서 1,2,3,4... 순서로 인덱스를 찾아 출력을 하고자 했으나 틀렸습니다를 받게 되었다.
// 생각해보니 dp에 저장이 될 때 조건을 만족하지 않으면 dp 내부의 값이 계속 유지되는데, 이때 주석 된 코드처럼작은 값 부터 찾게 되면
// LIS에 걸리지 않는 값이 이전에 검출되고 인덱스가 커지게 되어 잘못된 내용을 출력하게 된다. 
// 이것을 방지하고자 dp의 앞이 아닌 뒤부터 시작하여 (n,n-1..1) 순으로 검출하여 이 오류를 방지한다.
// 주석 된 코드의 틀린 test case
/*
input
5
1 4 2 3 5
dp : [1, 2, 2, 3, 4]  -> dp와 원본 input의 2번째,3번째 위치를 보면 왜그런지 이해 할 수 있을 것이다.
wrong answer
4
1 4 3 5 
answer
4
1 2 3 5 
*/