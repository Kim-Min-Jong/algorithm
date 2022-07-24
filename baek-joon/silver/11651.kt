import java.io.*
fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val n = readLine().toInt()
        var pList = mutableListOf<Pair<Int,Int>>()
        repeat(n){
                var line = readLine().split(" ")
                pList.add(Pair(line[0].toInt(),line[1].toInt()))
        }
        pList.sortWith(compareBy({it.second}, {it.first}))

        for(i in pList){
                bw.write("${i.first} ${i.second}\n")
        }

        bw.flush()
        bw.close()
        this.close()
}