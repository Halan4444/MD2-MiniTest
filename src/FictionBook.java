public class FictionBook extends Book {

    public String category;

    public FictionBook(String bookCode, String name, Double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "We have a list of Fiction books as follows {" +
                "bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

