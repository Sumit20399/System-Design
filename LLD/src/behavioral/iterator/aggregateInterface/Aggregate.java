package behavioral.iterator.aggregateInterface;

import behavioral.iterator.iteratorInterface.Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
