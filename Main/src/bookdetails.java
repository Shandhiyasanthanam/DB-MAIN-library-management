public class bookdetails {
    private String book_name;
    public String getBook_name() {
        return book_name;
    }
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
    private int book_id;
    public int getBook_id() {
        return book_id;
    }
    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }
    private String author_name;
    public String getAuthor_name() {
        return author_name;
    }
    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
    private String quantity;
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public bookdetails(String book_name, int book_id, String author_name, String quantity) {
        this.book_name = book_name;
        this.book_id = book_id;
        this.author_name = author_name;
        this.quantity = quantity;
    }
    public bookdetails(String bok_nam)
    {
        this.book_name=bok_nam;
    }
 
}
