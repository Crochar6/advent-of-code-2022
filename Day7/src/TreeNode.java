import java.util.ArrayList;

public class TreeNode {
    public int size = 0;
    public String name;
    public ArrayList<TreeNode> children = new ArrayList<>();
    public TreeNode parent;

    public TreeNode(String name,  TreeNode parent) {
        this.name = name;
        this.parent = parent;
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }

    public void addSize(int size) {
        this.size += size;
        if (this.parent != null) {
            parent.addSize(size);
        }
    }
}
