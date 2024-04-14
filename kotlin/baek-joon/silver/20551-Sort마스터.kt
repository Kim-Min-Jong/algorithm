import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n) { readLine().toInt() }.sortedArray()
    repeat(m) {
        val value = readLine().toInt()
        val index = binarySearch(arr.toList(), value)
        bw.write("$index\n")
    }

    bw.flush()
    bw.close()
    close()
}
fun binarySearch(arr: List<Int>, search: Int): Int {
    var low = 0 //가장 작은 값 초기 0
    var high = arr.size - 1 //가장 큰값 초기 사이즈-1
    var mid: Int; //중간값

    while (low < high) {
        mid = (low + high) / 2
        if (arr[mid] >= search) high = mid
        else low = mid + 1
    }

    return if(low < arr.size && arr[low] == search) low else - 1
}
