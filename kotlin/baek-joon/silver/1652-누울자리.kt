import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val board = Array(n) { Array<Char>(n) { ' ' } }

    var xCnt = 0
    var yCnt = 0

    for (i in 0 until n) {
        val str = readLine().toCharArray()
        for (j in 0 until n) {
            board[i][j] = str[j]
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i + 1 < n) {
                if (board[i][j] == '.' && board[i + 1][j] == '.' && (i + 2 >= n || board[i + 2][j] == 'X')) {
                    yCnt++
                }
            }
            if (j + 1 < n) {
                if (board[i][j] == '.' && board[i][j + 1] == '.' && (j + 2 >= n || board[i][j + 2] == 'X')) {
                    xCnt++
                }
            }
        }
    }

    bw.write("$xCnt $yCnt")

    bw.flush()
    bw.close()
    close()
}