class Solution {
    var arr = arrayOf("zero","one","two","three","four","five","six","seven","eight","nine")
    fun solution(s: String): Int {
        var str = s
        for (i in 0 until arr.size) {
            str = str.replace(arr[i], i.toString())
        }
        return str.toInt()
    }
}