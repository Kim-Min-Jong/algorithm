import java.io.*;
import java.util.StringTokenizer;

class Node {
    char data;
    Node left;
    Node right;

    public Node(char data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
class Tree{

    public void add(Node node, char data, char left, char right) {
        if(node.data == data) {
            if(left != '.')
                node.left = new Node(left, null, null);
            if(right != '.')
                node.right = new Node(right, null, null);
        } else {
            if(node.left != null)
                add(node.left, data, left, right);
            if(node.right != null)
                add(node.right, data, left, right);
        }

    }
    public void preOrder(Node node) {
        if(node == null)
            return;
        System.out.print(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(Node node) {
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+"");
    }
    public void inOrder(Node node) {
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data+"");
        inOrder(node.right);
    }

}
public class TreeSearch_1191 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Tree tree = new Tree();
        int n = Integer.parseInt(br.readLine());
        Node root = new Node('A', null, null);
        char subRoot;
        char left;
        char right;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            subRoot = st.nextToken().charAt(0);
            left = st.nextToken().charAt(0);
            right = st.nextToken().charAt(0);
            tree.add(root, subRoot, left, right);
        }
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();

        bw.flush();
        bw.close();
        br.close();
    }
}