package udemy.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public Node root;

    public class Node {
        public int value;
        public Node left;
        public Node right;

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

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.remove();
            result.add(currentNode.value);

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return result;
    }

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> result = new ArrayList<>();

        class Travers {
            Travers(Node currentNode) {
                result.add(currentNode.value);
                if (currentNode.left != null) {
                    new Travers(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Travers(currentNode.right);
                }
            }
        }
        new Travers(root);
        return result;

    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> result = new ArrayList<>();

        class Travers {
            Travers(Node currentNode) {
                if (currentNode.left != null) {
                    new Travers(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Travers(currentNode.right);
                }
                result.add(currentNode.value);

            }
        }
        new Travers(root);
        return result;
    }

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> result = new ArrayList<>();

        class Travers {
            Travers(Node currentNode) {
                if (currentNode.left != null) {
                    new Travers(currentNode.left);
                }
                result.add(currentNode.value);
                if (currentNode.right != null) {
                    new Travers(currentNode.right);
                }
            }
        }
        new Travers(root);
        return result;
    }

}
