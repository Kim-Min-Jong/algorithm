class Solution {
    val list = mutableListOf<IntArray>()
    fun solution(n: Int): List<IntArray> {
        hanoi(n, 1, 2, 3)
        return list.toList()
    }
    fun hanoi(n:Int, from:Int, tmp:Int, to:Int) {
        if(n == 1){
                list.add(intArrayOf(from,to))
        }else {
                hanoi(n - 1, from, to, tmp)
                list.add(intArrayOf(from,to))
                hanoi(n - 1, tmp, from, to)
        }
    }
}