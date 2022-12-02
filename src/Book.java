import java.util.Objects;

public class Book {
   private String titleBook;
   private int yearPublisher;

   public Author author;

public Book(String titleBook, Author author, int yearPublisher){
    this.titleBook = titleBook;
    this.author = author;
    this.yearPublisher = yearPublisher;
}
public String getTitleBook() {
    return titleBook;
}

    public Author getAuthor() {
        return author;
    }

    public int getYearPublisher() {
        return yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
    this.yearPublisher = yearPublisher;
    }

    ///Метод toString
    public String toString() {
    return this.titleBook + " " + this.author + " " + this.yearPublisher;
    }

    ///Метод equals
    public boolean equals(Object other) {
    if (this.getClass() != other.getClass()) {
        return false;
    } Book b1 = (Book) other;
    return titleBook.equals(b1.titleBook) && getTitleBook().equals(b1.getTitleBook());
    }
    ///Метод HashCode
    public int hashCode() {
    return Objects.hash(titleBook, author);
    }

}
