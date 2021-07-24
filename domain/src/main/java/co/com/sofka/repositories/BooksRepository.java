package co.com.sofka.repositories;

import co.com.sofka.entities.Book;

import java.util.UUID;

public interface BooksRepository{
    void save(Book book);
    void delete(UUID id);
}
