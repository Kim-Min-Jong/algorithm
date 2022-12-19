import java.util.*
import java.io.*


fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val n = readLine().toInt()
        val list = mutableListOf<Int>()
        var cnt = 0
        var mapValue = 0
        for (i in 0 until n) {
                list.add(readLine().toInt())
        }
        list.sort()
        var avg = Math.round((list.sum().toDouble() / n))
        var map = list.groupBy{it}.map{it.key to it.value.size}.toMap()
        var mapMax = map.filter{it.value == Collections.max(map.values)}

        bw.write(avg.toString()+"\n") // 1
        bw.write(list[n/2].toString()+"\n") // 2
        for(i in mapMax){
                mapValue = i.key
                cnt++
                if(cnt == 2) break
        }

        if(mapMax.size == 1) bw.write(mapMax.keys.first().toString()+"\n") //3
        else bw.write(mapValue.toString()+"\n") //3

        if(list.size == 1) bw.write("0") // 4
        else bw.write((list[n-1]-list[0]).toString()+"\n") // 4
    
        bw.flush()
        bw.close()
        this.close()
}

