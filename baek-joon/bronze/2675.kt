import java.io.*
import java.util.StringTokenizer

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val T = br.readLine().toInt()
    for (k in 1..T) {

        val rs = StringTokenizer(br.readLine())
        val R = rs.nextToken().toInt()
        val S = rs.nextToken()
        var P = ""

        for (i in 0..S.length-1) {
            for (j in 1..R) {
                P += S[i]
            }
        }

        println(P)

    }

    br.close()

}