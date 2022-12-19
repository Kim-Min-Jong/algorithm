class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): MutableList<MutableList<Int>> {
        val answer = MutableList<MutableList<Int>>(arr1.size,{MutableList<Int>(arr2[0].size,{i->0})})
        var sum = 0 
        val a1_col = arr1[0].size
        val a2_col = arr2[0].size 
        val a1_row = arr1.size 
        val a2_row = arr2.size
        for (i in 0..a1_row-1) {
            for (j in 0..a2_col-1) {
                sum = 0;
                for (k in 0..a1_col-1) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }
        return answer
    }
}