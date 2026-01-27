package SESSION08.Book;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "James", 100.0);
        System.out.println("Title: " + b1.getTitle() + ", Author: " + b1.getAuthor() + ", Price: " + b1.getPrice());
    }
}
