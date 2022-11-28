public class Main {

    public static void main(String[] args) {

        Author moore = new Author("Alan", "Moore");
        Book theWatchmen = new Book("The Watchmen", 1987);

        Author og = new Author("Og", "Mandino");
        Book greatestSeller = new Book("The World's Greatest Seller", 2002);

        System.out.println(theWatchmen.getTitleBook() + ", " + moore.getName() + " " + moore.getSurname() + ", " + theWatchmen.getYearPublisher() + ".");
        System.out.println(greatestSeller.getTitleBook() + ", " + og.getName() + " " + og.getSurname() + ", " + greatestSeller.getYearPublisher() + ".");

        ///проверяем сеттер
        theWatchmen.setYearPublisher(1986);
        greatestSeller.setYearPublisher(2015);
        System.out.println(theWatchmen.getTitleBook() + ", " + moore.getName() + " " + moore.getSurname() + ", " + theWatchmen.getYearPublisher() + ".");
        System.out.println(greatestSeller.getTitleBook() + ", " + og.getName() + " " + og.getSurname() + ", " + greatestSeller.getYearPublisher() + ".");



    }
}