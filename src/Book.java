import java.util.Objects;

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

    public String toString() {
        return "Name of book: " + nameOfBook + " , author: " + author.toString() + " , publishing year: " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(nameOfBook, book.nameOfBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, publishingYear, author);
    }
}
