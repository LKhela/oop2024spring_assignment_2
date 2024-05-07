package assignment2.organizations.bookstore;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("John Doe", "johndoe@example.com", "123-456-7890");
        Author author2 = new Author("Jane Smith", "janesmith@example.com", "987-654-3210");

        Bookstore bookstore = new Bookstore("My Bookstore", "A great place for book lovers",
                "info@mybookstore.com", "555-123-4567", "123 Main Street");

        bookstore.addMember(author1);
        bookstore.addMember(author2);

        System.out.println("Bookstore Name: " + bookstore.getName());
        System.out.println("Bookstore Description: " + bookstore.getDescription());
        System.out.println("Bookstore Email: " + bookstore.getEmail());
        System.out.println("Bookstore Phone Number: " + bookstore.getPhoneNumber());
        System.out.println("Bookstore Address: " + bookstore.getAddress());

        List<Author> authors = bookstore.getAuthors();
        if (authors != null && !authors.isEmpty()) {
            System.out.println("Authors in the Bookstore:");
            for (Author author : authors) {
                System.out.println("Author Name: " + author.getName());
                System.out.println("Author Email: " + author.getEmail());
                System.out.println("Author Phone Number: " + author.getPhoneNumber());
            }
        } else {
            System.out.println("No authors found.");
        }
    }
}
