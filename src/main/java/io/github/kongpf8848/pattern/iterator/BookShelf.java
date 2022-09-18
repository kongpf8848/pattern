package io.github.kongpf8848.pattern.iterator;

import java.util.Iterator;

/**
 * Created by pengf on 2017/3/3.
 */
public class BookShelf implements Iterable<Book>{
    private Book[] books;
    private int size = 0;

    public BookShelf(int max) {
        books = new Book[max];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void add(Book book) {
        books[size++] = book;
    }

    public int getLength() {
        return size;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(this);
    }
}
