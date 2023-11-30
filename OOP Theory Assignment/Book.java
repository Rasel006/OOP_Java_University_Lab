public class Book {

    private String title;
    private String author;
    private int year;
    private String isbn;

    public Book() {
        this.title = "No Title";
        this.author = "No Author";
        this.year = 0;
        this.isbn = "No ISBN";
    }

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    
    public void setBookInfo(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getISBN() {
        return isbn;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("ISBN: " + isbn);
    }

    private void internalMethod() {
    }

    protected void protectedMethod() {
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayBookInfo();

        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "978-0-316-76948-0");
        book2.displayBookInfo();

        book1.setBookInfo("To Kill a Mockingbird", "Harper Lee", 1960, "978-0-06-112008-4");
        book1.displayBookInfo();
    }
}

