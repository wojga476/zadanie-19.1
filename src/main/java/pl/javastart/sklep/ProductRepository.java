package pl.javastart.sklep;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> product;

    public ProductRepository() {
        product = new ArrayList<>();
        product.add(new Product("Bułka", "20"));
        product.add(new Product("Chleb", "20"));

    }

    public List<Product> getProduct() {
        return product;
    }

    public Product findByName(String name) {

        for (Product products : product) {
            if(products.getName().equals(name)) {
                return products;
            }
        }

        return null;
    }

    public void addAnimal(Product animal) {
        product.add(animal);
    }
}
