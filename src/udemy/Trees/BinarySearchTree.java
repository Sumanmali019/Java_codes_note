package udemy.Trees;

public class BinarySearchTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    // Insert
    // pseudo code
    /*
     * Create newNode
     * if ( root === null ) {
     * root = newNode;
     * }
     * 
     * while ()
     * if newNode == temp return false;
     * if < left else > right
     * if null insert newNode else movw to next
     */

    public boolean insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) {
                return false;
            }
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    // pseudo code
    /*
     * Create newNode
     * if ( root === null ) {
     * retur false;
     * }
     * 
     * while (temp != null)
     * if < left
     * else if > right
     * else == return true
     * return false;
     * 
     */

    public boolean Conains(int value) {
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
