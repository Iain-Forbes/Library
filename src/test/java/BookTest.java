import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book myBook;

    @Before
    public void before(){
        myBook = new Book("Dune", "Frank Herbet", "Sci-fi");

    }

    @Test
    public void canGetBookTitle(){
        assertEquals("Dune", myBook.getTitle());
    }

    @Test
    public void canGetBookAuthor(){
        assertEquals("Frank Herbet", myBook.getAuthor());
    }

    @Test
    public void canGetBookGenre(){
        assertEquals("Sci-fi", myBook.getGenre());
    }

}
