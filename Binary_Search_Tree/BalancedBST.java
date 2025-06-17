package Binary_Search_Tree;

import java.util.ArrayList;

public class BalancedBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node sortedArray_BalancedBST(ArrayList<Integer> arr, int st, int end) {
        if(st > end) {
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = sortedArray_BalancedBST(arr, st, mid-1);
        root.right = sortedArray_BalancedBST(arr, mid+1, end);

        return root;
    }

    public static void inorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }

        inorder(root.left, inorder);
        inorder.add(root.data);
        inorder(root.right, inorder);
    }

    static Node BST_BalancedBST(Node root) {
        // inorder
        ArrayList<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);

        // balanced bst
        root = sortedArray_BalancedBST(inorder, 0, inorder.size()-1);

        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
                    
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
        }

    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr.add(11);
        arr.add(12);

        // Node node1 = sortedArray_BalancedBST(arr, 0, arr.size() -1);
        // preorder(node1);
        // System.out.println();

        Node node2 = BST_BalancedBST(root);
        preorder(node2);
        System.out.println();
        
    }
    
}
