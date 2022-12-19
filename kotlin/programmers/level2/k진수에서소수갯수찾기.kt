class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer = n.toString(k)
        var result = answer.split("0").filter{it != ""}
        var sum = 0
        for(i in result){
            if(isPrime(i.toLong()))
                sum++
        }
        return sum
    }
    fun isPrime(num:Long):Boolean{
        if(num <= 1) return false
        return (2..Math.sqrt(num.toDouble()).toLong()).none{ num % it.toLong() == 0L }
    }
}