package main.designpatterns.iterator.correct;

public class Tree implements NonLinearContainer {
    Tree next;

    @Override
    public Iterator getBFSIterator() {
        return new BfsIterator();
    }

    @Override
    public Iterator getDFSIterator() {
        return new DfsIterator();
    }

    // Dummy bfs logic
    private class BfsIterator implements Iterator{

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Object next() {
            return next;
        }
    }

    // Dummy dfs logic
    private class DfsIterator implements Iterator{

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Object next() {
            return next;
        }
    }
}
