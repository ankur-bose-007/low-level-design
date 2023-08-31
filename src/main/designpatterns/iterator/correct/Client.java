package main.designpatterns.iterator.correct;


// In this implementation we wrap the iterators inside the
// container impl class. In this scenario the Tree is our
// container Impl. The implementation of the different
// traversals are completely hidden from the outside world
// and the client only needs to specify the traversal type
// in order to get an iterator. We have created a non-linear
// container for data structures like trees, graphs which support
// multiple traversal types.
public class Client {
    public void traverseTree(){
        Tree tree = new Tree();
        Iterator bfsIterator = tree.getBFSIterator();
        while(bfsIterator.hasNext())
            System.out.println(bfsIterator.next().toString());

        Iterator dfsIterator = tree.getDFSIterator();
        while (dfsIterator.hasNext())
            System.out.println(dfsIterator.next().toString());
    }
}
