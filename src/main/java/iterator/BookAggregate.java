package iterator;

/**
 * 图书 具体聚集类
 */
public class BookAggregate implements Aggregate{

    private Book[] books;

    // 记录最后一本书的下标，初始化为 -1
    private int last;

    public int getLength(){
        return last + 1;
    }

    public void addBook(Book book){
        last++;
        books[last] = book;
    }

    public Book getBook(int index){
        return books[index];
    }

    public BookAggregate(int maxSize){
        books = new Book[maxSize];
        this.last = -1;
    }

    @Override
    public Iterator iterator() {
        return new BookIterator(this);
    }
}
