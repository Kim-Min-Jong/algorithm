import java.io.*

fun main() = with(System.`in`.bufferedReader()){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    repeat(n){
        val list = readLine().split(" ").map{it.toInt()}
        val x1 = list[0]
        val y1 = list[1]
        val r1 = list[2]
        val x2 = list[3]
        val y2 = list[4]
        val r2 = list[5]
        val sqd = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)
        val rs = (r1+r2)*(r1+r2)
        val rd = (r1-r2)*(r1-r2)
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            bw.write("-1\n")
        } else if (sqd > rs) {
            bw.write("0\n")
        } else if (sqd == rs) {
            bw.write("1\n")
        } else if (rd < sqd) {
            bw.write("2\n")
        } else if (sqd == rd) {
            bw.write("1\n")
        } else {
            bw.write("0\n")
        }
    }
    bw.flush()
    bw.close()
    this.close()
}