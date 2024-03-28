package book;

public class book {

    

    @Override
    public String toString() {
        return "book [authName=" + authName + ", title=" + title + ", price=" + price + "]";
    }

    private String authName;
    private String title;
    private int price;

    public book(String title, String authName, int price) {
        this.authName = authName;
        this.title = title;
        this.price = price;
    }


    public String getAuthName() {
        return authName;
    }


    public String getTitle() {
        return title;
    }


    public int getPrice() {
        return price;
    }

    
    
}
