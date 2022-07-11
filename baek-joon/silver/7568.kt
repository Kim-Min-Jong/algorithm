import java.util.*
import java.io.*

fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val n = readLine().toInt()
        val people = mutableListOf<Pair<Int,Int>>()
        val rank = IntArray(n){1}
        repeat(n){
                var p = readLine().split(" ").map{it.toInt()}
                people.add(Pair(p[0],p[1]))
        }
        for (i in 0 until n ){
                for (j in 0 until n){
                        if (people[i].first > people[j].first && people[i].second > people[j].second)
                                ++rank[j]
                }
        }
        rank.forEach {
                print("$it ")
        }
}