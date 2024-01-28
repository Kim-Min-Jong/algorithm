class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = IntArray(k) { -1 }
        val list = arr.toSet().toList().take(k).toMutableList()
        while(list.size != k) {
            list.add(-1)
        }
        return list.toIntArray()
    }
}