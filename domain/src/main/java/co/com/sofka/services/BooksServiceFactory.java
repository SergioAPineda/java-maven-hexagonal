package co.com.sofka.services;

import co.com.sofka.entities.BooksService;
import co.com.sofka.repositories.BooksRepository;

public class BooksServiceFactory {
    public static BooksService getBooksService(BooksRepository booksRepository) {
        return new BooksServiceImpl(booksRepository);
    }
}
