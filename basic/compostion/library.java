public class library {

    private String books;
    private floor floor;
    public floor getFloor() {
        return floor;
    }
    public void setFloor(floor floor) {
        this.floor = floor;
    }
    public library(String books, floor floor) {
        this.books = books;
        this.floor = floor;
    }
    public String getBooks() {
        return books;
    }
    public void setBooks(String books) {
        this.books = books;
    }
    
    
}
