public class Book {
    private String nameOfBook;
    private int publishingYear;
    private Author author;

    public Book(String nameOfBook, Author author, int publishingYear) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
