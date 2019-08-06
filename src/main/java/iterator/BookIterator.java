package iterator;

/**
 * 图书 迭代器
 */
public class BookIterator implements Iterator{

    private BookAggregate aggregate;
    private int last;

    public BookIterator(BookAggregate bookAggregate){
        this.last = -1;
        this.aggregate = bookAggregate;
    }

    @Override
    public boolean hasNext() {
        if(last < aggregate.getLength() - 1){
            last++;
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return aggregate.getBook(last);
    }
}
