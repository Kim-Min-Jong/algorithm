import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var n = readLine().toInt()   

    repeat(n) {
        val input = readLine()     
        var score = 0  
        var sum = 0    
        
        for (i in 0 until input.length) {
            if (input[i] == 'O') {
                score++    
                sum += score 
            } else score = 0  
        }
        println(sum)  
    }
}