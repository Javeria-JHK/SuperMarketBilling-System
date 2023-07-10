
public class Product {
    
    public int productID;
    public String productName;
    public String description;
    public double price;
    public int quantity;

    Product(){

    }
    Product( int id,String name,String desc,double cost, int q){
        productName = name;
        productID = id;
        price = cost;
        quantity = q;
        description = desc;

    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }




}
