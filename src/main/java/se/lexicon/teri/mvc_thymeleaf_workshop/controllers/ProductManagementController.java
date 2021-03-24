package se.lexicon.teri.mvc_thymeleaf_workshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.lexicon.teri.mvc_thymeleaf_workshop.dto.ProductDetailsDto;
import se.lexicon.teri.mvc_thymeleaf_workshop.dto.ProductDto;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin/product")
public class ProductManagementController {

    private List<ProductDto> productDtoList;

    @PostConstruct
    public void init() {
        if (productDtoList == null) productDtoList= new ArrayList<>();

        // Product 1
        ProductDetailsDto productDetailsDto= new ProductDetailsDto();
        productDetailsDto.setId(1);
        productDetailsDto.setName("Test");
        productDetailsDto.setDescription("Test Description");

        ProductDto productDto= new ProductDto();
        productDto.setId(1);
        productDto.setName("Test Product 1");
        productDto.setPrice(10);
        productDto.setProductDetailsDto(productDetailsDto);


        // Product 2
        ProductDetailsDto productDetailsDto2= new ProductDetailsDto();
        productDetailsDto2.setId(1);
        productDetailsDto2.setName("Test2");
        productDetailsDto2.setDescription("Test Description 2");

        ProductDto productDto2= new ProductDto();
        productDto2.setId(2);
        productDto2.setName("Test Product 2");
        productDto2.setPrice(20);
        productDto2.setProductDetailsDto(productDetailsDto2);


        productDtoList.add(productDto);
        productDtoList.add(productDto2);
    }

    @GetMapping("/")
    public String getAllProducts(Model model) {
        model.addAttribute("productDtoList", productDtoList);
        return "productManagement";
    }

}
