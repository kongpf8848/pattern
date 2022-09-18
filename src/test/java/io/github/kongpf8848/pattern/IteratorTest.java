package io.github.kongpf8848.pattern;

import io.github.kongpf8848.pattern.iterator.Book;
import io.github.kongpf8848.pattern.iterator.BookShelf;
import org.junit.Test;

import java.util.Iterator;

public class IteratorTest {

    @Test
    public void testIterator(){
        //迭代器模式
        System.out.println("迭代器模式+++++++++++++++++++++++++++++++++++");
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.add(new Book("aa"));
        bookShelf.add(new Book("bb"));
        bookShelf.add(new Book("cc"));
        bookShelf.add(new Book("dd"));
        Iterator<Book> iterator = bookShelf.iterator();
        while(iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("name:" + book.getName());
        }

    }
}
