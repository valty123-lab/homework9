import java.util.Objects;

public class Book {
    private String name;
    private int publisherYear;
    private Author author;

    public Book (String name, int publisherYear, Author author) {
        this.name = name;
        this.publisherYear = publisherYear;
        this.author = author;
    }
    public String getName() {

        return this.name;
    }
    public int getPublisherYear() {

        return this.publisherYear;
    }
    public void setPublisherYear(int publisherYear) {

        this.publisherYear = publisherYear;
    }
    private Author getAuthor (){
        return this.author;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publisherYear == book.publisherYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }
    public int hashCode() {
        return java.util.Objects.hash(name, publisherYear, author);
    }
    public String toString() {
        return "Название: " + this.name + ". Год изд: " + this.publisherYear + " " + this.author.toString();
    }
}
