package assignment2.organizations.bookstore;

import assignment2.commons.Organization;
import assignment2.commons.Contactable;

import java.util.ArrayList;
import java.util.List;

public class Bookstore extends Organization implements Contactable {
    private String email;
    private String phoneNumber;
    private String address;

    private List<Author> authors = new ArrayList<>();

    public Bookstore(String name, String description, String email, String phoneNumber, String address) {
        setName(name);
        setDescription(description);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void addMember(Author author) {
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

}
