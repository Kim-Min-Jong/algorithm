import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val day = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    val (x, y) = readLine().split(" ").map{it.toInt()}
    var total = 0
    if (x == 2) {
        total += 31
    } else if (x == 3) {
        total += 59
    } else if (x == 4) {
        total += 90
    } else if (x == 5) {
        total += 120
    } else if (x == 6) {
        total += 151
    } else if (x == 7) {
        total += 181
    } else if (x == 8) {
        total += 212
    } else if (x == 9) {
        total += 243
    } else if (x == 10) {
        total += 273
    } else if (x == 11) {
        total += 304
    } else if (x == 12) {
        total += 334
    }
    total += y
    val a = total % 7
    bw.write("${day[a]}")
    bw.flush()
    bw.close()
    this.close()
}