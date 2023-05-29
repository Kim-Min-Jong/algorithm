class Solution {
    fun solution(data: Array<IntArray>, col: Int, row_begin: Int, row_end: Int): Int {
        var index = row_begin
        val answer = data.sortedWith(compareBy<IntArray>{it[col-1]}.thenByDescending{it[0]}).slice(row_begin-1..row_end-1).map {
            var sum = 0
            for(i in it){
                sum += i % index
            }
            index++
            sum
        }.reduce{first, next -> first xor next}

        return answer
    }
}