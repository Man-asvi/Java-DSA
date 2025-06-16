package Binary_Tree;
import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

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
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelorder(Node root) {
            if(root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node curr = q.remove();
                if(curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data + " ");
                    if(curr.left != null) {
                        q.add(curr.left);
                    }
                    if(curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }

        public static int height(Node root) {
            if(root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);

            int h = Math.max(lh, rh) + 1;
            return h;
        }

        public static int countNode(Node root) {
            if(root == null) {
                return 0;
            }
            int lc = countNode(root.left);
            int rc = countNode(root.right);

            return lc + rc + 1;
        }

        public static int sumNodes(Node root) {
            if(root == null) {
                return 0;
            }
            int ls = sumNodes(root.left);
            int rs = sumNodes(root.right);

            return ls + rs + root.data;
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Root node: " + root.data);

        System.out.print("Preorder traversal: ");
        tree.preorder(root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        tree.inorder(root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorder(root);
        System.out.println();

        System.out.println("Levelorder traversal: ");
        tree.levelorder(root);

        System.out.println("Height of Tree: " + tree.height(root));
        System.out.println("Count of Nodes: " + tree.countNode(root));
        System.out.println("Sum of Nodes: " + tree.sumNodes(root));

    }
}