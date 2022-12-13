public class Book {
    private String bookName;
    private Author author;
    private int publishingYear;
    public void setYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getBook() {
        String buratino = bookName;
        return bookName;
    }
    public int getPublishingYear() {
        int year1 = publishingYear;
        return publishingYear;
    }
}

