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
}
