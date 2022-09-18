package io.github.kongpf8848.pattern.iterator;

import java.util.Iterator;

/**
 * Created by pengf on 2017/3/3.
 */
public class BookIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private int index;

    public BookIterator(BookShelf bookShelf)
    {
        this.bookShelf=bookShelf;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        if(index<bookShelf.getLength())
        {
            return true;
        }
        return false;
    }

    @Override
    public Book next() {
        Book book=this.bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
