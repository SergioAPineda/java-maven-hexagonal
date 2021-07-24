package co.com.sofka;

import co.com.sofka.entities.BooksService;
import co.com.sofka.repositories.BooksRepositoryImpl;
import co.com.sofka.services.BooksServiceFactory;
import co.com.sofka.usecases.ConsoleApp;

public class ApplicationMain {
    public static void main(String[] args) {
        BooksService booksService = BooksServiceFactory.getBooksService(new BooksRepositoryImpl());
        ConsoleApp consoleApp = new ConsoleApp(System.console(), booksService);
        consoleApp.waitForCommand();
    }
}
