package pl.javastart.sklep;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private ProductRepository productRepository;

    public MainController(ProductRepository animalRepository) {
        this.productRepository = animalRepository;
    }

    @GetMapping("/")
    public String home(Model model, @RequestParam(required = false) String type) {

        List<Product> products = productRepository.getProduct();


            model.addAttribute("produkty", products);


        Product product = new Product();
        product.setName("Burek");
        model.addAttribute("newAnimal", product);

        return "index"; // index.html
    }



}
