package level1;

import java.util.*;

public class Library {
    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    //agregar libros
    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            Collections.sort(books);// Mantiene el orden alfabético
        }
    }

    // Obtener la lista completa de libros
    public List<String> getBooks() {
        return books;
    }

    // Obtener un libro en una posición específica
    public String getBookByPosition(int posicion) {
        if (posicion >= 0 && posicion < books.size()) {
            return books.get(posicion);
        } else {
            System.out.println("Position out of range");
            return null;
        }
    }

    // Insertar un libro en una posición específica
    public boolean insertBookIntoPosition(int posicion, String titulo) {
        if (!books.contains(titulo) && posicion >= 0 && posicion <= books.size()) {
            books.add(posicion, titulo);
            Collections.sort(books); // Mantener ordenado
            return true;
        }
        return false;
    }

    // Eliminar un libro por su título
    public boolean deleteBook(String titulo) {
        return books.remove(titulo);
    }
}






























