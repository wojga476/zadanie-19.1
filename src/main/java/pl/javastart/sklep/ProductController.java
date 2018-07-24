package pl.javastart.sklep;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository animalRepository) {
        this.productRepository = animalRepository;
    }

    @GetMapping("/product")
    public String animal(@RequestParam("imie") String name, Model model) {

        Product animal = productRepository.findByName(name);

        if(animal != null) {
            model.addAttribute("animal", animal);
            return "piekarnia"; // templates/piekarnia.html
        } else {
            return "redirect:/";
        }

    }

    @PostMapping("/addProduct")
    public String addAnimal(Product product) {
        productRepository.addAnimal(product);
        return "redirect:/";
    }


}
