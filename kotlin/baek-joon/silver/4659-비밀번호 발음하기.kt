import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val str = readLine()
        if(str == "end") break

        if(checkStr1(str) && checkStr2(str) && checkStr3(str)) {
            bw.write("<$str> is acceptable.\n")
        } else {
            bw.write("<$str> is not acceptable.\n")
        }
    }

    bw.flush()
    bw.close()
    close()
}
fun checkStr1(str: String): Boolean {
    val arr = arrayOf('a', 'e', 'i', 'o', 'u')
    arr.forEach { char ->
        if(str.find { it == char } != null)
            return true
    }
    return false
}
fun checkStr2(str: String): Boolean {
    val arr = arrayOf('a', 'e', 'i', 'o', 'u')
    for(i in 0 until str.length - 2) {
        if(str[i] in arr && str[i+1] in arr && str[i+2] in arr) {
            return false
        } else if (str[i] !in arr && str[i+1] !in arr && str[i+2] !in arr) {
            return false
        } 
    }
    return true
}
fun checkStr3(str: String): Boolean {
    for(i in 0 until str.length - 1) {
        if(str[i] == str[i + 1]) {
            return str[i] == 'e' || str[i] =='o'
        }
    }
    return true
}