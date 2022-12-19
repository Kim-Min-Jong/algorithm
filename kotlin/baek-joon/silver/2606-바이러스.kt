import java.util.*
import java.io.*
val bw = BufferedWriter(OutputStreamWriter(System.out))
var cnt = 0
var visited = booleanArrayOf()
var array : Array<IntArray> = arrayOf()
var iArray :List<Int> = listOf()

fun dfs(v: Int): Int{
    visited[v] = true
//    bw.write("${v+1} ")
    for(i in 0 until iArray[0]){
        if(array[v][i] != 0 && !visited[i]){
            dfs(i)
        }
    }
    cnt++
    return cnt
}

fun main() = with(System.`in`.bufferedReader()){
//    var list = readLine().split(" ").map{it.toInt()}
    var list:List<Int> = listOf(readLine().toInt(), readLine().toInt() , 1)

    // 방문한 노드 저장
    visited = booleanArrayOf()

    // 입력 첫줄
    iArray = list

    //그래프
    array = Array(list[0]){ IntArray(list[0]) }

    visited = BooleanArray(list[0])

    for(i in 0 until list[1]){
        var input = readLine()
        var temp = input.split(" ").map{it.toInt()}
        array[temp[0]-1][temp[1]-1]= 1
        array[temp[1]-1][temp[0]-1]=1
    }
    visited.fill(false)
    bw.write("${dfs(iArray[2]-1)-1}")

    bw.flush()
    bw.close()
    this.close()
}

