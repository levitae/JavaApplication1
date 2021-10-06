package javaapplication1.basictree;

import java.util.ArrayList;

public class TreeNode {

    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    public String print(int level) {
        String ret = "";
        for(int i = 0; i < level; i++) {
            ret = ret + "  ";
        }
        ret = ret + data + "\n";
        for (TreeNode node : this.children) {
            ret += node.print(level+1);
            System.out.println("==============");
            System.out.println("ret >> " + ret);
        }
        return ret;
    }
}
