class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var acnt:Double = a.toDouble()
        var bcnt:Double = b.toDouble()
        while(true){
            if(acnt.toInt() % 2 ==0){
                if(acnt.toInt() - 1 == bcnt.toInt()) 
                    break
            }else{
                if(acnt.toInt() + 1 == bcnt.toInt())
                    break
            }
            acnt = Math.ceil(acnt.toDouble() / 2) 
            bcnt = Math.ceil(bcnt.toDouble() / 2) 
            answer++
        }
        return answer+1
    }
}