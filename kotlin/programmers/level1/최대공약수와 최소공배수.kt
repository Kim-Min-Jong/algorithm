class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf(gcd(n,m), lcm(n,m))
        return answer
    }
    fun gcd(n:Int, m:Int):Int{
        return if(n < m){
            if(n == 0) m else gcd(n, m % n)
        }else{
            if(m == 0) n else gcd(m, n % m)
        }
    }
    fun lcm(n:Int, m:Int):Int{
        return (n * m) / gcd(n, m)
    }
}