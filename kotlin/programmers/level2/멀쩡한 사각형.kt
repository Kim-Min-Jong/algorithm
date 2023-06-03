class Solution {
    fun solution(w: Int, h: Int): Long {
        var answer: Long = 0
        if(w == 1 || h == 1) return 0
        answer = (w.toLong() * h.toLong()) - (w + h - gcd(w, h))
        return answer
    }
    fun gcd(w: Int, h: Int): Long = if(w < h) {
            if(w==0) h.toLong() else gcd(w, h%w)
        } else {
            if(h==0) w.toLong() else gcd(h, w%h)
        }
}