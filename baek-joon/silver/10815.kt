import java.io.*

fun main() = with(System.`in`.bufferedReader()){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val n = readLine().toInt()
        val list = readLine().split(" ").map{it.toInt()}.sorted()
        val m = readLine().toInt()
        val checkList = readLine().split(" ").map{it.toInt()}

        for(i in checkList){
            print("${binary(list, i)} ")
        }

        bw.flush()
        bw.close()
        this.close()
}
fun binary(arr: List<Int>, search: Int): Int {
    var low = 0 
    var high = arr.size - 1 
    var mid: Int; 

    while (low <= high) {
        mid = (low + high) / 2


        if (search == arr[mid]) {
            return 1
        }

        else if (search < arr[mid]) {
            high = mid - 1 
        }

        else low = mid + 1 
    }
    return 0
}