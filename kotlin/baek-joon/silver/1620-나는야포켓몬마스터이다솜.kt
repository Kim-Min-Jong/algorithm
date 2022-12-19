import java.io.*

fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val (n,m) = readLine().split(" ").map{it.toInt()}
        val map = hashMapOf<String ,Int>()
        val arr = mutableListOf<String>()
        for(i in 1..n){
            var a = readLine()
            map[a] = i
            arr.add(a)
        }
        repeat(m){
            var a = readLine()
            try {
                if (a.toInt() in 1..100004) { // 만약 숫자가 입력되었다면
                    bw.write("${arr[a.toInt() - 1]}\n")
                }
            } catch (e : Exception) { // 만약 문자라면
                bw.append("${map[a]!!}\n")
           }
        }


        bw.flush()
        bw.close()
        this.close()
}