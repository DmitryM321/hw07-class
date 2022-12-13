public class Main {
    public static void main(String[] args) {
        Author author = new Author("Алексей", "Толстой");
        Author author1 = new Author("Джозеф", "Хеллер");
        Book bookauthor = new Book("Буратино", author, 1927);
        Book bookauthor1 = new Book("Уловка22", author, 1961);

        System.out.println(author.getAutor());
        System.out.println(author1.getAutor());

        System.out.println(bookauthor.getBook() + " Автор " + author.getAutor() + " Год издания " + bookauthor.getPublishingYear());
        bookauthor.setYear(2222);
        System.out.println(bookauthor.getBook() + " Автор " + author.getAutor() + " Год издания " + bookauthor.getPublishingYear());
        System.out.println(bookauthor1.getBook() + " Автор " + author1.getAutor() + " Год издания " + bookauthor1.getPublishingYear());



    }

}