import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    var i = 0
    var sum = 0
    while (i + sum < n) {
        sum += i++
    }

    var a = if (i % 2 == 0) n - sum else i + 1 - (n - sum)
    var b = i + 1 - a

    print("%d/%d".format(a, b))
    br.close()
}