package exc01;

public class binaryTree <E> {
    private Node root;

    /**
     * Create an empty binary tree.
     */
    public binaryTree() {
        root = null;
    }

    /**
     * Create a binary tree with one node.
     */
    public binaryTree(E rootData) {
        root = new Node(rootData);
    }

    /**
     * Create a BinaryTree with a root node, and
     * 'left' as left subtree and 'right' as right subtree.
     * Pre: 'left' != 'right'.
     * Note: 'left' and 'right' are nullable.
     */
    public binaryTree(E rootData, binaryTree<E> left, binaryTree<E> right) {
        root = new Node(rootData);
        if (left != null) {
            root.left = left.root;
        }
        if (right != null) {
            root.right = right.root;
        }
    }

    //-------------------------------------------------------------------------

    /**
     * Return true if this tree is empty.
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Return the data at the root of this tree.
     * Pre: The tree is not empty.
     */
    public E rootData() {
        return root.data;
    }

    /**
     * Return a reference to the left subtree of this tree.
     * Pre: The tree is not empty.
     * Note: Nullable return value.
     */
    public binaryTree<E> left() {
        if(root.left == null){
            return null;
        }
        binaryTree<E> leftTree = new binaryTree<>();
        leftTree.root = root.left;
        return leftTree;
    }

    /**
     * Return a reference to the right subtree of this tree.
     * Pre: The tree is not empty.
     * Note: Nullable return value.
     */
    public binaryTree<E> right() {
        if(root.right == null){
            return null;
        }
        binaryTree<E> rightTree = new binaryTree<>();
        rightTree.root = root.right;
        return rightTree;
    }

    //-------------------------------------------------------------------------

    private class Node {
        private E data;
        private Node left;
        private Node right;

        public Node(E data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}