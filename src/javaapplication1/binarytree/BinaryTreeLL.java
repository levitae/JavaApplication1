package javaapplication1.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {

    public BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    // PreOrder Traversal
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // InOrder Traversal
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // PostOrder Traversal
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // LevelOrder Traversal
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    // Search Method
    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value != value) {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            } else {
                System.out.println("The value " + value + " is found in Tree");
                return;
            }
        }
        System.out.println("The value " + value + " is not found in Tree");
    }

    // Insert Method
    public void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (root == null) {
            root = newNode;
            System.out.println("New node is inserted at Root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Successfully inserted");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Successfully inserted");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    // Get Deepest Node
    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }
    
    // Get Deepest Node
    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }  
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    // Delete Method
    public void delete(String value) {
        /*
         Step:
         1. Find the node
         2. Find the deepest node
         3. Set deepest node's value to current node being deleted
         4. delete deepest node
         */
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The value " + value + " is deleted");
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value " + value + " is not found in Tree");
    }
    
    // Delete Tree
    public void deleteTree() {
        root = null;
        System.out.println("Binary Tree has been successfully deleted");
    }
}
