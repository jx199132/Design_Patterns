package iterator;

import lombok.Data;

/**
 * 图书类
 */

@Data
public class Book {
    private String name;

    public Book(String name){
        this.name = name;
    }
}
