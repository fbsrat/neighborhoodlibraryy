public class Book {
    int id;
    String isbn;
    String title;
    boolean checkedOut;

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    String checkedOutTo;

    public Book(int id,String isbn,String title,boolean checkedOut,String checkedOutTo) {
        this.id = id;
        this.isbn=isbn;
        this.title=title;
        this.checkedOut=checkedOut;
        this.checkedOutTo=checkedOutTo;
    }
    public static void checkOut( String name){

    }
    public static void checkIn(){

    }
    }

