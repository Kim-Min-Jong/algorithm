import java.io.*
import java.util.*

internal class Node(var data: Char, var left: Node?, var right: Node?)
internal class Tree {
    fun add(node: Node?, data: Char, left: Char, right: Char) {
        if (node!!.data == data) {
            if (left != '.') node.left = Node(left, null, null)
            if (right != '.') node.right = Node(right, null, null)
        } else {
            if (node.left != null) add(node.left, data, left, right)
            if (node.right != null) add(node.right, data, left, right)
        }
    }

    fun preOrder(node: Node?) {
        if (node == null) return
        print(node.data)
        preOrder(node.left)
        preOrder(node.right)
    }

    fun postOrder(node: Node?) {
        if (node == null) return
        postOrder(node.left)
        postOrder(node.right)
        print(node.data.toString() + "")
    }

    fun inOrder(node: Node?) {
        if (node == null) return
        inOrder(node.left)
        print(node.data.toString() + "")
        inOrder(node.right)
    }
}

object Main {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        val br = BufferedReader(InputStreamReader(System.`in`))
        val tree = Tree()
        val n = br.readLine().toInt()
        val root = Node('A', null, null)
        var subRoot: Char
        var left: Char
        var right: Char
        for (i in 0 until n) {
            val st = StringTokenizer(br.readLine())
            subRoot = st.nextToken()[0]
            left = st.nextToken()[0]
            right = st.nextToken()[0]
            tree.add(root, subRoot, left, right)
        }
        tree.preOrder(root)
        println()
        tree.inOrder(root)
        println()
        tree.postOrder(root)
        println()
        bw.flush()
        bw.close()
        br.close()
    }
}