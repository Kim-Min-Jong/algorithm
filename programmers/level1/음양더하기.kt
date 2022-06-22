class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 123456789
        for(i in signs.indices){
            if(signs[i] == true)
                continue
            else
                absolutes[i] = -absolutes[i]
        }
            
        return absolutes.sum()
    }
}