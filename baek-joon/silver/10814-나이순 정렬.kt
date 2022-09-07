import java.io.*


fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val n = readLine().toInt()
        var pList = mutableListOf<Pair<Int,String>>()
        repeat(n){
                var line = readLine().split(" ")
                pList.add(Pair(line[0].toInt(),line[1]))
        }
        pList.sortWith(compareBy { it.first })

        for(i in pList){
                bw.write("${i.first} ${i.second}\n")
        }

        bw.flush()
        bw.close()
        this.close()
}