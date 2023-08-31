package main.designpatterns.iterator.wrong;

// This implementation of tree traversal is okay but
// let's say we want to add more traversals. Also, the
// client might have a requirement to process the tree
// elements ony by one(lazily) like a stream rather than all
// the data at once. The best pattern for this use case is
// iterator which is the fundamental of many collections in
// java.
public class Client {
    public void traverseTree(){
        Tree tree = new Tree();
        TreeTraversals treeTraversals = new TreeTraversals();
        treeTraversals.bfs(tree);
        treeTraversals.dfs(tree);
    }
}
