package mainTask;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final ArrayList<Book> bookList = new ArrayList<>();

    void add(Book book) {
        bookList.add(book);
    }

    public static void show(List<Book> books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    List<Book> getBooks() {
        System.out.println("Книги магазина:");
        return bookList;
    }

    List<Book> getBooksByAuthor(String author) {
        System.out.println("\nКниги. " + author + ":");
        List<Book> list = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getAuthor().equals(author)) {
                list.add(b);
            }
        }
        return list;
    }

    List<Book> getBooksByPublishingHouse(String publishingHouse) {
        System.out.println("\nКниги издательства \"" + publishingHouse + "\"");
        List<Book> list = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getPublishingHouse().equals(publishingHouse)) {
                list.add(b);
            }
        }
        return list;
    }

    List<Book> getBooksByYearOfPublication(int year) {
        System.out.println("\nКниги, изданные после " + year + " года:");
        List<Book> list = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getYearOfPublication() > year) {
                list.add(b);
            }
        }
        return list;
    }
}
