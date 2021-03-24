//package se.lexicon.teri.mvc_thymeleaf_workshop.controllers;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import se.lexicon.teri.mvc_thymeleaf_workshop.dto.ProductDto;
//
//import java.util.List;
//
//public class ProductController {
//
//    private List<ProductDto> productDto;
//
//    @GetMapping("/list")
//    public String getAllProducts(Model model){
//        model.addAttribute("productDto", productDto);
//        return "productList";
//    }
//}
