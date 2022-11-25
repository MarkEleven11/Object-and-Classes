public class Book {
   private String titleBook;
   private int yearPublisher;
public Book(String titleBook, int yearPublisher){
    this.titleBook = titleBook;
    this.yearPublisher = yearPublisher;
}
public String getTitleBook() {
    return titleBook;
}

    public int getYearPublisher() {
        return yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
    this.yearPublisher = yearPublisher;
    }
}
