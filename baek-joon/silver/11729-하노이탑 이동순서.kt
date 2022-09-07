import java.io.*
var cnt = 0
var list = mutableListOf<Pair<String,String>>()
val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()){
        val n = readLine().toInt()
        hanoi(n,"1","2","3")
        println(cnt)
        for(i in list){
                bw.write("${i.first} ${i.second}\n")
        }
        bw.flush()
        bw.close()
}
fun hanoi(n:Int, from:String, tmp:String, to:String) {
        if(n == 1){
                list.add(Pair(from,to))
                cnt++
        }else {
                hanoi(n - 1, from, to, tmp)
                list.add(Pair(from,to))
                hanoi(n - 1, tmp, from, to)
                cnt++
        }

}
