class Solution {
    fun solution(n: Long): Long {
        return n.toString().map{it.toString().toInt()}.toIntArray().sortedByDescending{it}.joinToString("").toLong()
    }
}