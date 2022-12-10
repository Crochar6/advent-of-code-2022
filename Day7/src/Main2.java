import java.util.ArrayList;
import java.util.Objects;

public class Main2 {
    static int DELETE_SIZE = 30000000;
    static int AVAILABLE = 70000000;
    public static void main(String[] args) {
        // Variables

        ArrayList<String> data;

        // Read file
        data = FileReader.readFile("data.txt");

        TreeNode tree = new TreeNode("/", null);

        // Compute
        Integer[] totalSize = {0};
        TreeNode[] result = {tree};
        for (int i = 1; i < data.size(); i++) {
            String[] d = data.get(i).split(" ");
            if (Objects.equals(d[0], "$")) {
                if (Objects.equals(d[1], "cd")) {
                    if (Objects.equals(d[2], "..")) {
                        tree = tree.parent;
                    } else if (Objects.equals(d[2], ".")) {

                    } else {
                        tree = tree.children.get(findChildNamed(d[2], tree));
                    }
                } else if (Objects.equals(d[1], "ls")) {
                    while (i+1 < data.size() && !Objects.equals(data.get(++i).split(" ")[0], "$")) {
                        // Afegim fills al ls
                        String[] a = data.get(i).split(" ");
                        TreeNode newNode;
                        if (Objects.equals(a[0], "dir")) {
                            newNode = new TreeNode(a[1], tree);
                        } else {
                            newNode = new TreeNode(a[1], tree);
                            newNode.addSize(Integer.parseInt(a[0]));
                        }
                        tree.addChild(newNode);
                    }
                    i--;
                }
            }

        }

        // Goto root
        while (tree.parent != null) {
            tree = tree.parent;
        }
        printResult(tree, totalSize);
        AVAILABLE -= tree.size;
        DELETE_SIZE -= AVAILABLE;
        printResult(tree, result);

        // Print
        System.out.println("Result: " + result[0].size);
    }

    private static int findChildNamed(String name, TreeNode parent) {
        for (int i = 0; i < parent.children.size(); i++) {
            TreeNode node = parent.children.get(i);
            if (Objects.equals(node.name, name)) return i;
        }
        return 0;
    }

    private static void printResult(TreeNode node, Integer result[]) {
        if (node.children.size() > 0) {
            if (node.size < 100000) {
                result[0] += node.size;
            }
            for (TreeNode child: node.children
            ) {
                printResult(child, result);

            }
        }

    }

    private static void printResult(TreeNode node, TreeNode result[]) {
        if (node.children.size() > 0) {
            if (node.size >= DELETE_SIZE && node.size < result[0].size) {
                System.out.println(node.size);
                result[0] = node;
            }
            for (TreeNode child: node.children
            ) {
                printResult(child, result);

            }
        }

    }
}
