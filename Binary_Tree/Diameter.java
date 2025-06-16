package Binary_Tree;

public class Diameter {

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

    static class BinaryTree {

        public static int height(Node root) {
            if(root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);

            int h = Math.max(lh, rh) + 1;
            return h;
        }

        public static int diameter2(Node root) { //O(n^2)
            if(root == null) {
                return 0;
            }
            int ld = diameter2(root.left);
            int rd = diameter2(root.right);
            int lh = height(root.left);
            int rh = height(root.right);

            int self = lh + rh + 1;

            return Math.max(self, Math.max(ld, rd));
        }

        static class Info{
            int diam;
            int ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public static Info diameter(Node root) { //O(n)
            if(root == null) {
                return new Info(0,0);
            }

            Info leftInfo = diameter(root.left);
            Info rigInfo = diameter(root.right);

            int diam = Math.max(leftInfo.ht + rigInfo.ht + 1 ,Math.max(leftInfo.diam, rigInfo.diam));
            int ht = Math.max(leftInfo.ht, rigInfo.ht) + 1;

            return new Info(diam, ht);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Diameter of tree: " + tree.diameter(root));
        System.out.println("Diameter of tree: " +tree.diameter(root).diam);
    }
    
}
