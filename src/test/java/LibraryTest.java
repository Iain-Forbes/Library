import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library myLibrary;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before() {
        myLibrary = new Library(3);
        book1 = new Book("Dune", "Frank Herbet", "Sci-fi");
        book2 = new Book("The Scary Book", "Mr Scary", "Comedy");
        book3 = new Book("How To Eat Cheese", "Mr Mouse", "Educational");
        book4 = new Book("No More Space", "Bobby", "Space Opera");
    }

    @Test
    public void canAddBook() {
        myLibrary.addBook(book2);
        assertEquals(1, myLibrary.bookInventory());
    }

    @Test
    public void cantAddMoreThanCapacity(){
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.addBook(book4);
        assertEquals(3, myLibrary.bookInventory());
    }
}

