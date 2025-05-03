package com.yaloys.jewelry_store.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.yaloys.jewelry_store.data.ProductRepository;

@Controller
public class ProductController {
    private final ProductRepository productRepository;
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping("/product")
    public String getProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "product";
    }
}
