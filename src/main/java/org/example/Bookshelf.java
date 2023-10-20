package org.example;

import java.util.*;

public class Bookshelf {
    ArrayList<Book> bookshelf = new ArrayList<>();
    void AddBook()
    {
        var scanner = new Scanner(System.in);
        System.out.println("Opcje dodawania ksiązki");
        System.out.println("Podaj tytuł ksiązki");
        String name = scanner.nextLine();
        System.out.println("Podaj cenę");
        Integer cost = Integer.parseInt(scanner.nextLine());
        bookshelf.add(new Book(name,cost));
    }

    void PrintEveryBooks()
    {
        bookshelf.forEach(System.out::println);
    }

    void DeleteBook()
    {
        var scanner = new Scanner(System.in);
        System.out.println("Napisz numer książki do usunięcia ");
        Integer number = Integer.parseInt(scanner.nextLine());
        bookshelf.remove(number);
    }
}
