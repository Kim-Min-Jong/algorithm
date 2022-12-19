class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr[0]
        var res = 0
        for(i in 1..arr.size-1){
            res = lcm(answer,arr[i])
            answer = res
        }
        return res
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