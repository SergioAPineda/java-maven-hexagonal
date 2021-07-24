package co.com.sofka.entities;

import java.util.UUID;

public interface BooksService {
    UUID createBook(String name, String author, String description);
    void deleteBook(UUID id);
}
