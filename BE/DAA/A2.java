import java.util.PriorityQueue;

class Node {
    char c;
    int freq;
    Node left, right;

    public Node(char c, int f, Node l, Node r) {
        this.c = c;
        freq = f;
        left = l;
        right = r;
    }
}

public class A2 {

    public static void main(String[] args) {
        A2 temp = new A2();
        int[] freq = { 80, 40, 60, 20, 90 };
        char[] c = { 'a', 'f', 'd', 'r', 's' };
        temp.buildHuffmanTree(freq, c);
    }

    public void buildHuffmanTree(int f[], char c[]) {
        PriorityQueue<Node> h = new PriorityQueue<Node>((n1, n2) -> (n1.freq - n2.freq));
        for (int i = 0; i < f.length; i++) {
            h.add(new Node(c[i], f[i], null, null));
        }

        while (h.size() > 1) {
            Node l = h.poll();
            Node r = h.poll();
            h.add(new Node('$', l.freq + r.freq, l, r));
        }

        printRec(h.peek(), "");
    }

    public void printRec(Node root, String s) {
        if (root.c != '$') {
            System.out.print(root.c + " " + s + "\n");
            return;
        }
        printRec(root.left, s + "0");
        printRec(root.right, s + "1");
    }
}
