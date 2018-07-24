package pl.javastart.sklep;

public class Product {

    private String name;
    private String price;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Product(String name, String price) {

        this.name = name;
        this.price = price;
    }

    public Product() {
    }
}
