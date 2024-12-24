public class BinaryTree {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.right = new Node(6);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        // 		1
        //	  2   3
        //  4  5

        tree.inOrder(tree.root); // Output: 4 2 5 1 3
    }
}
/*
Inorder traversal is defined as a type of tree traversal technique,
which follows the Left-Root-Right pattern, such that:

The left subtree is traversed first
Then the root node for that subtree is traversed
Finally, the right subtree is traversed
*/
