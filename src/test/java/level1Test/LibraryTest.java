package level1Test;

import level1.Library;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    private Library library;

    @BeforeEach
    public void init(){
        this.library = new Library();
    }

    @Test
    public void testAddBook() {
        //Given
        String title = "El caso";

        //When
        library.addBook(title);

        //Then
        assertNotNull(library);
    }

    @Test
    public void testGetBooks() {
        //Given
        library.addBook("Meditaciones");
        library.addBook("Cartas a Lucilio");
        library.addBook("El obstáculo es el camino");
        library.addBook("El arte de la buena vida");

        //When
        int listSize = library.getBooks().size();

        //Then
        assertEquals(4, listSize);
    }

    @Test
    public void testGetBookByPosition() {
        //Given
        library.addBook("Meditaciones");
        library.addBook("Cartas a Lucilio");
        library.addBook("El obstáculo es el camino");
        library.addBook("El arte de la buena vida");

        //When
        String bookTitle = "Meditaciones";
        String position = library.getBookByPosition(3);

        //Then
        assertEquals(bookTitle, position);
    }

    @Test
    public void testInsertBookIntoPosition() {
        //Given
        library.addBook("Meditaciones");
        library.addBook("Meditaciones");

        //When
        int book = library.getBooks().size();

        //Then
        assertEquals(1, book);
    }

    @Test
    //5 Comprueban que se puede recuperar el título de un libro dada una posición específica.
    public void testGetBookByPosition2() {
        //Given
        library.addBook("Meditaciones");
        library.addBook("Cartas a Lucilio");
        library.addBook("El obstáculo es el camino");
        library.addBook("El arte de la buena vida");

        //When
        String book = "Cartas a Lucilio";
        String position = library.getBookByPosition(0);

        //Then
        assertEquals(book, position);
    }

    @Test
    //6 Aseguran que añadir un libro modifica correctamente la lista.
    public void testInsertBookIntoPosition2() {
        //Given
        library.addBook("Meditaciones");
        library.addBook("Cartas a Lucilio");
        library.addBook("El obstáculo es el camino");
        library.addBook("El arte de la buena vida");

        //When
        boolean book = library.insertBookIntoPosition(2, "La cruz");

        //Then
        assertTrue(book);
    }

    @Test
    //7 Confirman que eliminar un libro disminuye el tamaño de la lista.
    public void testDeleteBook() {
        //Given
        library.addBook("Meditaciones");
        library.deleteBook("Meditaciones");

        //When
        int numero = library.getBooks().size();
        int numero2 = 0;

        //Then
        assertEquals(numero2, numero);
    }

    @Test
    //8 Verifican que la lista permanece ordenada alfabéticamente después
    // de añadir o eliminar un libro.
    public void testSortAlphabetically() {
        //Given
        library.addBook("Meditaciones");
        library.addBook("Cartas a Lucilio");
        library.addBook("El obstáculo es el camino");
        library.addBook("El arte de la buena vida");

        //When
        List<String> books = library.getBooks();

        //Then
        assertEquals(List.of("Cartas a Lucilio", "El arte de la buena vida", "El obstáculo es el camino", "Meditaciones"), books);
    }
}
























