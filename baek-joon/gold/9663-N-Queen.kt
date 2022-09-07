import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))
var answer = 0
var col = IntArray(15){0}
fun main() = with(System.`in`.bufferedReader()){
    val n = readLine().toInt()
    bw.write("${dfs_nQueen(0,n)}")

    bw.flush()
    bw.close()
    this.close()
}
fun dfs_nQueen(x : Int,n: Int):Int{
    if(x == n) answer++
    else{
        for(i in 0 until n){
            col[x] = i
            if(checkRow(x))
                dfs_nQueen(x+1, n)
        }
    }
    return answer
}

fun checkRow(num : Int) : Boolean{
    for(i in 0 until num)
        if(col[i] == col[num] || Math.abs(col[num] - col[i]) == num - i)
            return false
    return true
}
