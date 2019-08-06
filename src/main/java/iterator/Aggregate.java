package iterator;

/**
 * 聚集接口
 */
public interface Aggregate {

    /**
     * 提供一个迭代集合数据的方法
     * @return 迭代器
     */
    Iterator iterator();
}
