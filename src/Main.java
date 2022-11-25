public class Main {

    public static void main(String[] args) {
        Book theWatchmen = new Book("The Watchmen", 1987);
        Book greatestSeller = new Book("The World's Greatest Seller", 2002);

        Author moore = new Author("Alan", "Moore");
        Author og = new Author("Og", "Mandino");

        System.out.println(theWatchmen.getTitleBook() + ", " + moore.getName() + " " + moore.getSurname() + ", " + theWatchmen.getYearPublisher() + ".");
        System.out.println(greatestSeller.getTitleBook() + ", " + og.getName() + " " + og.getSurname() + ", " + greatestSeller.getYearPublisher() + ".");

        ///проверяем сеттер
        theWatchmen.setYearPublisher(1986);
        greatestSeller.setYearPublisher(2015);
        System.out.println(theWatchmen.getTitleBook() + ", " + moore.getName() + " " + moore.getSurname() + ", " + theWatchmen.getYearPublisher() + ".");
        System.out.println(greatestSeller.getTitleBook() + ", " + og.getName() + " " + og.getSurname() + ", " + greatestSeller.getYearPublisher() + ".");



    }
}