val max = 10000
var arr = IntArray(max) 
var ori = 1

 
fun d(n: Int) {
    var num = n
    var sum = n
        

    while (num > 0) {
       sum += num%10
        num /= 10
    }

    if (sum >= max) {
       return
    } else {
        arr[sum]++
        d(sum)
    }
}
fun main(){
    while (ori < max) {
        d(ori++)
    }
    for (i in arr.indices) {
        if (i != 0 && arr[i] == 0) {
            println(i)
        }
    }
}