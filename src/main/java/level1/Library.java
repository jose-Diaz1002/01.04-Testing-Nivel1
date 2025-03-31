package level1;
import java.util.*;

public class Library {
    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            Collections.sort(books);
        }
    }
    public List<String> getBooks() {
        return books;
    }

    public String getBookByPosition(int posicion) {
        if (posicion >= 0 && posicion < books.size()) {
            return books.get(posicion);
        } else {
            System.out.println("Position out of range");
            return null;
        }
    }

    public boolean insertBookIntoPosition(int posicion, String titulo) {
        if (!books.contains(titulo) && posicion >= 0 && posicion <= books.size()) {
            books.add(posicion, titulo);
            Collections.sort(books);
            return true;
        }
        return false;
    }

    public boolean deleteBook(String titulo) {
        return books.remove(titulo);
    }
}






























