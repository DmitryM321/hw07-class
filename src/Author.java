public class Author {
    private String firstname;
    private String laststname;

    public Author(String firstname, String laststname) {
        this.firstname = firstname;
        this.laststname = laststname;
    }

    public String getAutor() {
        String author;
        author = firstname + " " + laststname;
        return author;
}

    }
