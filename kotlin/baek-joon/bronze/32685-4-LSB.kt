import java.io.BufferedWriter
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    var str = ""

    repeat(3) {
        var num = readLine().toInt().toString(2).takeLast(4)
        if (num.length < 4) {
            var tmp = ""
            repeat(4-num.length) {
                tmp += "0"
            }
            num = tmp + num
        }
        str += num
    }

    var res = str.toInt(2).toString()
    if (res.length < 4) {
        var tmp = ""
        repeat(4-res.length) {
            tmp += "0"
        }
        res = tmp + res
    }
    bw.write(res)

    bw.flush()
    bw.close()
    close()
}