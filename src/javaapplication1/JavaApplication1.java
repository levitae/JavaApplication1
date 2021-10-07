package javaapplication1;

import javaapplication1.animalshelter.Dog;
import javaapplication1.animalshelter.Cat;
import javaapplication1.animalshelter.AnimalQueue;
import javaapplication1.basictree.TreeNode;
import javaapplication1.binarytree.searchtree.BinarySearchTree;
import javaapplication1.binarytree.BinaryNode;
import javaapplication1.binarytree.BinaryTreeArray;
import javaapplication1.binarytree.BinaryTreeLL;

/**
 *
 * @author Ideapad
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        binarySearchTree();
    }

    public static void animalShelter() {
        AnimalQueue q = new AnimalQueue();
        q.enqueue(new Cat("Kiki"));
        q.enqueue(new Cat("Kari"));
        q.enqueue(new Dog("Beji"));
        q.enqueue(new Cat("Reki"));
        q.enqueue(new Dog("Dexter"));

        System.out.println(q.dequeueAny().name());
        System.out.println(q.dequeueDogs().name());
        System.out.println(q.dequeueCats().name());
    }

    public static void basicTree() {
        TreeNode root = new TreeNode("Drinks");

        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");

        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");

        TreeNode soda = new TreeNode("Soda");
        TreeNode alcohol = new TreeNode("Alcohol");

        root.addChild(hot);
        root.addChild(cold);

        hot.addChild(tea);
        hot.addChild(coffee);

        cold.addChild(soda);
        cold.addChild(alcohol);

        root.print(0);
    }

    public static void binaryTreeTraversal() {
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        BinaryNode N1 = new BinaryNode();
        N1.value = "N1";
        BinaryNode N2 = new BinaryNode();
        N2.value = "N2";
        BinaryNode N3 = new BinaryNode();
        N3.value = "N3";
        BinaryNode N4 = new BinaryNode();
        N4.value = "N4";
        BinaryNode N5 = new BinaryNode();
        N5.value = "N5";
        BinaryNode N6 = new BinaryNode();
        N6.value = "N6";
        BinaryNode N7 = new BinaryNode();
        N7.value = "N7";
        BinaryNode N8 = new BinaryNode();
        N8.value = "N8";
        BinaryNode N9 = new BinaryNode();
        N9.value = "N9";

        N1.left = N2;
        N1.right = N3;

        N2.left = N4;
        N2.right = N5;

        N3.left = N6;
        N3.right = N7;

        N4.left = N8;
        N4.right = N9;

        binaryTree.root = N1;

        System.out.println("PreOrder >> ");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("");
        System.out.println("InOrder >> ");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("");
        System.out.println("PostOrder >> ");
        binaryTree.postOrder(binaryTree.root);
        System.out.println("");
        System.out.println("LevelOrder >> ");
        binaryTree.levelOrder();
        System.out.println("");
        System.out.println("Search >> ");
        binaryTree.search("N5");
        binaryTree.search("N10");
        System.out.println("");
    }

    public static void binaryTreeInsert() {
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        System.out.println("LevelOrder >> ");
        binaryTree.levelOrder();
        binaryTree.delete("N2");
        System.out.println("LevelOrder >> ");
        binaryTree.levelOrder();
    }

    public static void binaryTreeArray() {
        BinaryTreeArray bt = new BinaryTreeArray(9);
        bt.insert("N1");
        bt.insert("N2");
        bt.insert("N3");
        bt.insert("N4");
        bt.insert("N5");
        bt.insert("N6");
        bt.insert("N7");
        bt.insert("N8");
        bt.insert("N9");

        bt.levelOrder();
        bt.delete("N2");
        bt.levelOrder();
    }

    public static void binarySearchTree() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);
        bst.insert(75);
        bst.insert(85);
        bst.levelOrder();
        System.out.println("");
        bst.deleteNode(bst.root, 90);
        bst.levelOrder();
        System.out.println("");
        bst.insert(90);
        bst.levelOrder();
        System.out.println("");
        bst.deleteTree();
        bst.levelOrder();
    }
}
