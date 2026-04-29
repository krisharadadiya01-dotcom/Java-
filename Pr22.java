// Custom Exception Class
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Library Class
class Library {
    private int availableBooks;

    // Constructor
    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    // Method to issue books
    public void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Library library = new Library(3);

        try {
            // First valid issue
            library.issueBook(2);

            // Second issue (should throw exception)
            library.issueBook(2);

        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
