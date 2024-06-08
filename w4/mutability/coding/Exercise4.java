package w4.mutability.coding;

import java.util.ArrayList;

class Library {
    ArrayList<String> available;
    ArrayList<String> onLoan;

    Library() {
        available = new ArrayList<String>();
        onLoan = new ArrayList<String>();
    }

    void addBooks(String[] books) {
        for (String book : books) {
            available.add(book);
        }
    }

    void borrowBook(String book) {
        available.remove(book);
        onLoan.add(book);
    }

    void returnBook(String book) {
        onLoan.remove(book);
        available.add(book);
    }
}

public class Exercise4 {
    public static void main(String[] args) {

        Library myLibrary = new Library();
        String[] books = { "Four Seasons", "Say Nothing", "Milkman", "Harry Potter and the Order of the Phoenix" };
        myLibrary.addBooks(books);
        System.out.println(myLibrary.available);

        myLibrary.borrowBook("Harry Potter and the Order of the Phoenix");
        myLibrary.borrowBook("Say Nothing");
        System.out.println(myLibrary.available);
        System.out.println(myLibrary.onLoan);

        myLibrary.returnBook("Say Nothing");
        System.out.println(myLibrary.available);
        System.out.println(myLibrary.onLoan);
    }
}
