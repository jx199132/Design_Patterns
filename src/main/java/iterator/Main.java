package iterator;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("三国");
        Book book2 = new Book("西游记");
        Book book3 = new Book("水浒");

        BookAggregate bookAggregate = new BookAggregate(10);
        bookAggregate.addBook(book1);
        bookAggregate.addBook(book2);
        bookAggregate.addBook(book3);

        Iterator iterator = bookAggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
