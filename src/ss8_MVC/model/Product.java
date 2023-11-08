package ss8_MVC.model;

public class Product {
    int id;
    String name;
    double price;
    String information;
    public Product(){}
    public Product(int id, String name, double price, String information){
        this.id = id;
        this.name = name;
        this.price = price;
        this.information = information;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", information='" + information + '\'' +
                '}';
    }
}
