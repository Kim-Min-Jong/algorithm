class Solution {
    data class album(val genre:String, val plays:Int)
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        var answer = intArrayOf()
        var result = mutableListOf<Int>()
        var play = mutableListOf<Int>()
        var list = mutableListOf<album>()
        var eachMap:Map<String,List<Int>> = mapOf()
        for(i in genres.indices){
            list.add(album(genres[i],plays[i]))
        }
        eachMap = list.groupBy{it.genre}.map{it.key to it.value.map{ album -> album.plays }}
    .toMap()

        result = eachMap.toList().sortedByDescending{it.second.sum()}.toMap().map{it.value.sortedByDescending{it}.take(2)}.flatten().toMutableList()

        for(i in 0..plays.size-1){
            play.add(plays[i])
        }

        for(i in 0..result.size-1){
            answer = answer.plus(play.indexOf(result[i]))
            play[play.indexOf(result[i])] = 1
        }
        return answer
    }

}