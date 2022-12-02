public class Main {

    public static void main(String[] args) {


        Author moore = new Author("Alan", "Moore");
        Book theWatchmen = new Book("The Watchmen", moore, 1987);

        Author og = new Author("Og", "Mandino");
        Book greatestSeller = new Book("The World's Greatest Seller", og, 2002);

        System.out.println(theWatchmen.getTitleBook() + ", " + moore.getName() + " " + moore.getSurname() + ", " + theWatchmen.getYearPublisher() + ".");
        System.out.println(greatestSeller.getTitleBook() + ", " + og.getName() + " " + og.getSurname() + ", " + greatestSeller.getYearPublisher() + ".");

        ///проверяем сеттер
        theWatchmen.setYearPublisher(1986);
        greatestSeller.setYearPublisher(2015);
        System.out.println(theWatchmen.getTitleBook() + ", " + moore.getName() + " " + moore.getSurname() + ", " + theWatchmen.getYearPublisher() + ".");
        System.out.println(greatestSeller.getTitleBook() + ", " + og.getName() + " " + og.getSurname() + ", " + greatestSeller.getYearPublisher() + ".");

        /// Проверяем метод toString
        System.out.println(theWatchmen);
        System.out.println(greatestSeller);

        /// проверяем метод Equals
        Author moore1 = new Author("Alan", "Moore");
        Book theWatchmen1 = new Book("The Watchmen", moore, 1987);

        Author og1 = new Author("Og", "Mandino");
        Book greatestSeller1 = new Book("The World's Greatest Seller", og, 2002);

        System.out.println(theWatchmen1.equals(theWatchmen));
        System.out.println(greatestSeller1.equals(theWatchmen1));







    }
}