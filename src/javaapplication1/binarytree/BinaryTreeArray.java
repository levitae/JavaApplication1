package javaapplication1.binarytree;

public class BinaryTreeArray {

    public String[] arr;
    public int lastUsedIndex;

    public BinaryTreeArray(int size) {
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Binary Tree size of " + size + " has been created");
    }

    public Boolean isFull() {
        return arr.length - 1 == lastUsedIndex;
    }

    public void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("The value of " + value + " has been inserted");
        } else {
            System.out.println("Binary Tree is full");
        }
    }

    // PreOrder Traversal
    public void preOrder(int index) {
        if (lastUsedIndex == 0) {
            return;
        }
        if (index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(index * 2); // left
        preOrder(index * 2 + 1); // right
    }

    // InOrder Traversal
    public void inOrder(int index) {
        if (lastUsedIndex == 0) {
            return;
        }
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2); // left
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1); // right
    }

    // PostOrder Traversal
    public void postOrder(int index) {
        if (lastUsedIndex == 0) {
            return;
        }
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(index * 2); // left
        postOrder(index * 2 + 1); // right
        System.out.print(arr[index] + " ");
    }

    // LevelOrder Traversal
    public void levelOrder() {
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Search Method
    public int search(String value) {
        for (int i = 1; i <= lastUsedIndex; i++) {
            if (arr[i].equals(value)) {
                System.out.println("The value of " + value + " is found");
                return i;
            }
        }
        System.out.println("The value of " + value + " is not found");
        return -1;
    }
    
    public void delete(String value) {
        /*
         Step:
         1. Find the node
         2. Find the deepest node
         3. Set deepest node's value to current node being deleted
         4. delete deepest node
         */
        int location = search(value);
        if(location == -1) {
            return;
        } 
        arr[location] = arr[lastUsedIndex];
        arr[lastUsedIndex] = null;
        lastUsedIndex--;
        System.out.println("The node successfully deleted");
    }
    
    // Delete Binary Tree
    public void deleteBinaryTree() {
        arr = null;
        lastUsedIndex = 0;
    }

}
