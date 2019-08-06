package iterator;

/**
 * 迭代器接口类
 */
public interface Iterator extends Aggregate {
    boolean hasNext();
    Object next();
}
