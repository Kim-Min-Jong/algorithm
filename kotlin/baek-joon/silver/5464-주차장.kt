import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }

    // 현재 어디에 몇번 차
    val parkingNumber = IntArray(n) { 0 }
    // 차량들의 무게
    val carWeight = IntArray(m) { 0 }
    // 주차 공간들의 단위 무게당 요금
    val parkingPee = IntArray(n) { 0 }

    var sum = 0

    val waitQueue: Queue<Int> = LinkedList()

    (0 until n).forEach {
        parkingPee[it] = readLine().toInt()
    }
    (0 until m).forEach {
        carWeight[it] = readLine().toInt()
    }

    for (i in 0 until 2 * m) {
        val inputCarNum = readLine().toInt()
        // 들어옴
        if (inputCarNum > 0) {
           val index = parkingNumber.indexOfFirst { it == 0 }
           if (index == -1) {
               waitQueue.add(inputCarNum)
           } else {
               parkingNumber[index] = inputCarNum
           }
        } else {
            for (j in 0 until n) {
                if (parkingNumber[j] == -1 * inputCarNum) {
                    parkingNumber[j] = 0
                    sum += carWeight[(inputCarNum * -1) - 1] * parkingPee[j]
                    if (waitQueue.isNotEmpty()) {
                        parkingNumber[j] = waitQueue.poll()
                    }
                    break
                }
            }

        }
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
    close()
}