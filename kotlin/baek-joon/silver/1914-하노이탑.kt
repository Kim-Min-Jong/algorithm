import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.math.BigInteger

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    // 하노이탑을 완성하는 데 드는 횟수
    bw.write("${pow(2, n) - 1.toBigInteger()}\n")
    if(n <= 20)
        hanoi_print(1, 2, 3, n)

    bw.flush()
    bw.close()
    close()
}
fun hanoi_print(first: Int, second:Int, third:Int, count:Int) {
    if(count == 1) {
        bw.write("$first $third\n")
        return
    }
    // 원판 n-1개를 두 번째 기둥으로 옮기기
    hanoi_print(first, third, second, count - 1)
    bw.write("$first $third\n")
    //두 번째 기둥에 있는 원판을 마지막 기둥으로 옮기기
    hanoi_print(second, first, third, count - 1)
}

fun pow(a: Int, n: Int): BigInteger {
    var ans = BigInteger("1")
    for (i in 0 until n) {
        ans *= a.toBigInteger()
    }
    return ans
}