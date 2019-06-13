class BookDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.setValue("Ravi", 10, "Notebook");
        System.out.print(book.getValue());
    }
}

class Book {
    String author;
    int noOfPages;
    String title;

    void setValue(String author, int noOfPages, String title) {
        this.author = author;
        this.noOfPages = noOfPages;
        this.title = title;
    }

    String getValue() {
        return "Author: " + author + "\n" + "noOfPages: " + noOfPages + "\n" + "title: " + title;
    }
}