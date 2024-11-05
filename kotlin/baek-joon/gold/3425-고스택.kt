import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.*

val bw = BufferedWriter(OutputStreamWriter(System.out))
fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val commands = mutableListOf<String>()

        while (true) {
            val innerCmd = readLine()
            when(innerCmd) {
                "QUIT" -> {
                    bw.flush()
                    bw.close()
                    close()
                    return@with
                }
                "END" -> break
            }
            commands.add(innerCmd)
        }

        val n = readLine().toInt()
        repeat(n) {
            // 스택 계산 시작
            val num = readLine().toInt()
            val answer = runStack(num, commands)
            bw.write("$answer\n")
        }
        readLine()
        bw.write("\n")
    }
}

fun runStack(num: Int, commands: List<String>): String {
    val stack = Stack<Int>().apply { add(num) }
    commands.forEach { command ->
        val splitCommand = command.split(" ")
        if (stack.isEmpty()) return "ERROR"              
        when(splitCommand.first()) {
            "NUM" -> stack.add(splitCommand.last().toInt())
            "POP" -> stack.pop()
            "INV" -> {
                val tmp = stack.pop() * -1
                stack.add(tmp)
            }
            "DUP" -> if (stack.isNotEmpty()) stack.add(stack.peek())
            "SWP" -> {
                val tmp1 = stack.pop()
                val tmp2 = stack.pop()
                stack.add(tmp1)
                stack.add(tmp2)
            }
            "ADD" -> {
                val tmp = stack.pop() + stack.pop()
                if (abs(tmp) > 1_000_000_000) {
                    return "ERROR"
                }
                stack.add(tmp)
            }
            "SUB" -> {
                val tmp = -stack.pop() + stack.pop()
                if (abs(tmp) > 1_000_000_000) {
                    return "ERROR"
                }
                stack.add(tmp)
            }
            "MUL" -> {
                val tmp = stack.pop() * stack.pop()
                if (abs(tmp) > 1_000_000_000) {
                    return "ERROR"
                }
                stack.add(tmp)
            }
            "DIV" -> {
                val tmp1 = stack.pop()
                val tmp2 = stack.pop()
                if (tmp1 == 0) return "ERROR"
                var tmp = abs(tmp2) / abs(tmp1)
                if ((tmp1 < 0 && tmp2 > 0) || (tmp1 > 0 && tmp2 < 0)){
                    tmp *= -1
                }
                if (abs(tmp) > 1_000_000_000) {
                    return "ERROR"
                }
                stack.add(tmp)
            }
            "MOD" -> {
                val tmp1 = stack.pop()
                val tmp2 = stack.pop()
                if (tmp1 == 0) return "ERROR"
                var tmp = abs(tmp2) % abs(tmp1)
                if (tmp2 < 0) tmp *= -1
                if (abs(tmp) > 1_000_000_000) {
                    return "ERROR"
                }
                stack.add(tmp)
            }
            else -> return "ERROR"
        }
    }
    if (stack.size == 1) return stack.first().toString()
    return "ERROR"
} // 보완필요..