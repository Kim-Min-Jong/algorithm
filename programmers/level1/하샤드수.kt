class Solution {
    fun solution(x: Int): Boolean {
        val div = x.toString().map{it.toString().toInt()}.toIntArray().sum()
        return if(x % div == 0) true else false
    }
}